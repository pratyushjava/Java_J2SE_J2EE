package Tester;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import pojos.Emp;

public class WriteData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		try {
			System.out.println("in try");
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("D://abc.ser"));
			Scanner sc=new Scanner(System.in);
			Emp e=new Emp(sc.nextInt(), sc.next(), sc.next());
			out.writeObject(e);
			System.out.println("data has been write to file");
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("D://abc.ser"));
			Emp e2=(Emp)in.readObject();
			System.out.println(e2);
			System.out.println("data has been read from file");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
