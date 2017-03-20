package srvrs;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class NumberServer {
	public static final int SERVER_PORT = 3000;
	private ServerSocket ss;

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		new NumberServer();

	}

	public NumberServer() throws Exception {
		Socket s = null;
		try {
			ss = new ServerSocket(SERVER_PORT, 1);
			System.out.println("Waiting for clnt");
			s = ss.accept();
			System.out.println("accepted cn");
			acceptDataNCompute(s);
			System.out.println("end of try");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (s != null)
				s.close();
			if (ss != null)
				ss.close();
		}
	}

	@SuppressWarnings("unchecked")
	private void acceptDataNCompute(Socket s) throws Exception {
		// attach data strms
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		ObjectInputStream in = new ObjectInputStream(s.getInputStream());
		System.out.println("attached data strms");
		ArrayList<Integer> l = (ArrayList<Integer>) in.readObject();
		double sum=0;
		switch (in.readUTF()) {
		case "add":
			for (int i : l)
				sum += i;
			break;
		case "mult":
			sum=1;
			for(int i:l)
				sum *= i;
			break;
		}
		//send rslt
		out.writeDouble(sum);
		out.flush();
		System.out.println("server sent rslts "+sum);
	}

}
