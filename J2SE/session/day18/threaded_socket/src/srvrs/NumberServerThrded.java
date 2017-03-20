package srvrs;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class NumberServerThrded {
	public static final int SERVER_PORT = 3000;

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		new NumberServerThrded();

	}

	public NumberServerThrded() throws Exception {

		try (ServerSocket ss = new ServerSocket(SERVER_PORT, 1)) {
			boolean exit = false;
			int cnter = 1;
			ArrayList<Thread> l1 = new ArrayList<>();
			while (!exit) {
				String s = JOptionPane.showInputDialog(null,
						"Want to continue?");
				if (s == null)
					exit = true;
				else {
					System.out.println("Waiting for clnt # " + cnter++);
					Socket s1 = ss.accept();
					System.out.println("accepted cn");
					l1.add(new ClntHandler(s1));
				}
			}
			//no new clnts
			System.out.println("waiting for clnt handling to get over");
			for(Thread t : l1)
				t.join();
			System.out.println("server shutting down....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Inner class for clnt handling
	class ClntHandler extends Thread
	{
		private ObjectInputStream in;
		private DataOutputStream out;
		private Socket s;
		public ClntHandler(Socket s) throws Exception{
			this.s=s;
			out=new DataOutputStream(s.getOutputStream());
			in=new ObjectInputStream(s.getInputStream());
			System.out.println("attached data strms "+getName());
			start();//rdy
			
		}
		@Override
		public void run()
		{
			System.out.println("thrd strted "+getName());
			try {
				acceptDataNCompute(out, in);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("exc in thrd "+getName()+" "+e);
			}
			finally {
				if (s != null)
					try {
						s.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println("err in finally");
					}
			}
			System.out.println("thrd over "+getName());
		}
	}

	@SuppressWarnings("unchecked")
	private void acceptDataNCompute(DataOutputStream out,ObjectInputStream in) throws Exception {
		ArrayList<Integer> l = (ArrayList<Integer>) in.readObject();
		double sum = 0;
		switch (in.readUTF()) {
		case "add":
			for (int i : l)
				sum += i;
			break;
		case "mult":
			sum = 1;
			for (int i : l)
				sum *= i;
			break;
		}
		// send rslt
		out.writeDouble(sum);
		out.flush();
		System.out.println("server sent rslts " + sum);
	}

}
