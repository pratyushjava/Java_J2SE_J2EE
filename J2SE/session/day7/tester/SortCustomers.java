package tester;

//GUI comp. to give readymade dialog boxes of various types
import javax.swing.JOptionPane;

import sort.Customer;

import java.util.*;

public class SortCustomers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Accept how many customers : I/P dialog box
		String s = JOptionPane.showInputDialog(null, "How many Customers?");
		if (s==null)
			return;
		Customer[] custs=new Customer[Integer.parseInt(s)];
		Scanner sc=null;
		// accept cust data & populate cust array
		for (int i=0;i<custs.length;i++)
		{
			//attaching scanner to string 
			s=JOptionPane.showInputDialog(null, "Enter Cust Details");
			if (s == null)
				return;
			sc=new Scanner(s);
			custs[i]=new Customer(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
		}
		//unsorted
		System.out.println("Unsorted custs "+Arrays.toString(custs));
		System.out.println("Unsorted custs "+custs[0]);
		// invoke Arrays.sort to sort cust refs.
		Arrays.sort(custs);
		System.out.println("Sorted custs "+Arrays.toString(custs));
		

	}

}
