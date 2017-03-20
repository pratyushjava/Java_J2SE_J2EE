package srvrs;

import java.net.*;
import java.io.*;
import java.util.*;

import customer_care.CustomerComplaint;

public class CustomerCareServerThreaded {
	public static final int SERVER_PORT = 2345;
	public static final int NO_OF_CENTERS=2;
	private ServerSocket ss;
	private Socket ds;
	private ArrayList<Thread> thrds;
	private HashMap<String,HashMap<Integer,CustomerComplaint>> allComplaints;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			new CustomerCareServerThreaded();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public CustomerCareServerThreaded() throws Exception {

		try {
			thrds = new ArrayList<Thread>();
			// create ss
			ss = new ServerSocket(SERVER_PORT, 10);
			//create empty outer coll
			allComplaints=new HashMap<String,HashMap<Integer,CustomerComplaint>> ();
		
			for (int i=0;i<NO_OF_CENTERS;i++) {
				System.out.println("Waiting for clnts #"+i);
				// accept cn from clnt
				ds = ss.accept();
				System.out.println("accepted cn from clnt");
				// create clnt handler thrd,pass ds, add it to AL
				thrds.add(new ClntHandler(ds));

			}
			//server side user wants to terminate
			//wait for clnt handler thrds to get over
			for (Thread t : thrds)
				t.join();
			System.out.println("All Complaints ---"+allComplaints);
			System.out.println("main over.....");

		} finally {
			if (ss != null)
				ss.close();

		}
	}

	
	class ClntHandler extends Thread {
		private Socket s;
		
		private ObjectInputStream in;

		public ClntHandler(Socket s) throws Exception {
			// thrd --- newly created
			this.s = s;
			in = new ObjectInputStream(s.getInputStream());
			// attach data strms
			System.out.println("attached data strms for " + getName());
			start();// rdy pool
		}

		@SuppressWarnings("unchecked")
		@Override
		public void run() {
			try {
				//read center code, complaints & in synched block ---
				String code=in.readUTF();
				HashMap<Integer, CustomerComplaint> hm=(HashMap<Integer, CustomerComplaint>)in.readObject();
				//update outer collection 
				synchronized (allComplaints) {
					allComplaints.put(code,hm);
					
				}
			} catch (Exception e) {
				System.out.println("Err in thrd " + getName() + "  " + e);
			} finally {
				if (s != null)
					try {
						s.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println("err in finally");
					}
			}
			System.out.println(getName() +" over");
		}

	}

}
