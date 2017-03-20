package clnts;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumberClnt {

	/**
	 * @param args
	 */
	public static final int SERVER_PORT=3000;
	public static void main(String[] args) {
		new NumberClnt();
	}
	public NumberClnt() {
		try (Socket s =new Socket(InetAddress.getLocalHost(),SERVER_PORT))
		{
			System.out.println("cn established...");
			ObjectOutputStream out=new ObjectOutputStream(s.getOutputStream());
			out.flush();
			DataInputStream din=new DataInputStream(s.getInputStream());
			System.out.println("Data strms attached");
			acceptDataNWaitForResults(out,din);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private void acceptDataNWaitForResults(ObjectOutputStream out,DataInputStream din) throws Exception
	{
		//accept nums from user
		String s1=JOptionPane.showInputDialog(null,"Enter nums");
		if (s1 == null)
			return;
		Scanner s=new Scanner(s1);
		ArrayList<Integer> l1=new ArrayList<>();
		//add the same to AL
		while(s.hasNextInt())
			l1.add(s.nextInt());
		System.out.println("AL "+l1);
		
		//accept cmd & send both to server
		s1=JOptionPane.showInputDialog(null,"Enter Command");
		out.writeObject(l1);
		out.writeUTF(s1);
		out.flush();
		//wait for rslts & disp the same
		JOptionPane.showMessageDialog(null,"Result="+din.readDouble());
	}

}

