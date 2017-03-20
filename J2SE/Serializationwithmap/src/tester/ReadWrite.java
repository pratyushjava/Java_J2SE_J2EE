package tester;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import pojos.Emp;

public class ReadWrite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("mnb.ser"));
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("mnb.ser"));
			HashMap<Integer, Emp> hm=new HashMap<>();
			Scanner sc=new Scanner(System.in);
			System.out.println("no of emp u want to add");
			int no=sc.nextInt();
			for (int i = 0; i < no; i++) {
				System.out.println("details of emp"+(i+1));
				System.out.println("enter id .name,password");
				int id=sc.nextInt();
				String password=sc.next();
				String name=sc.next();
				hm.put(id, new Emp(id, name, password));
			}
			System.out.println("data has been added into map");
			out.writeObject(hm);
			System.out.println("data has been write to file");
			try {
				HashMap<Integer, Emp> hm1=(HashMap<Integer, Emp>)in.readObject();
				Collection<Emp> cl=hm1.values();
				for (Emp emp : cl) {
					System.out.println(emp);
				}
				System.out.println("data has beenn read");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
