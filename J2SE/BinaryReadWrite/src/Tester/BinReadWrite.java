package Tester;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

import pojos.Emp;

public class BinReadWrite {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "deprecation", "deprecation" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DataOutputStream dout=new DataOutputStream(new FileOutputStream("cde.dat"));
			DataInputStream din=new DataInputStream(new FileInputStream("cde.dat"));
			Emp e=new Emp(1, "ashish", "ashish");
			dout.writeInt(e.getId());
			dout.writeUTF(e.getName());
			dout.writeUTF(e.getPassword());
			System.out.println("data has been written");
			System.out.println(din.readInt());
			System.out.println(din.readUTF());
			System.out.println(din.readUTF());
			
			
System.out.println("data has been read");			

		} catch ( IOException e) {
			// TODO Auto-generated catch block
			if(e instanceof EOFException)
				System.out.println("data has been ended");
			e.printStackTrace();
		}
		

	}

}
