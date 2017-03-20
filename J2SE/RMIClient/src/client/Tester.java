package client;
import intrfc.Calculator;

import java.rmi.Naming;
import java.util.Scanner;

public class Tester
{
	public static void main(String[] args) {
		try 
		{
		/*	ServiceImple ref = new ServiceImple();
					System.setProperty("java.rmi.server.codebase","//Acts-adc/userdata$/dac131/Desktop/RMI Sewa/rmi_srvr/bin");
			// register the same
			Naming.rebind("rmi://127.0.0.1:1099/MyCalc", ref);
			Scanner sc=new Scanner(System.in);*/
			Calculator ref =(Calculator) Naming.lookup("rmi://127.0.0.1:1099/MyCalc");
			System.out.println("success");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number for adding");
			System.out.println("Result is: "+ref.add(sc.nextInt(),sc.nextInt()));
			System.out.println("Enter number for multiplication");
			System.out.println("Result is: "+ref.mul(sc.nextInt(),sc.nextInt()));
			System.out.println("Enter number for substraction");
			System.out.println("Result is: "+ref.sub(sc.nextInt(),sc.nextInt()));
			System.out.println("Enter number for Devide");
			System.out.println("Result is: "+ref.dev(sc.nextInt(),sc.nextInt()));
			
		
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	
	}
}
