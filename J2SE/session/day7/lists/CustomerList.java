package lists;

import java.util.*;

public class CustomerList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create empty AL of custs
		ArrayList<Customer> custList = new ArrayList<Customer>();
		// dyn init of cust array
		Customer[] custs = { new Customer(101, "a@gmail", "a", 100),
				new Customer(13, "B@gmail", "B", 150),
				new Customer(34, "c@gmail", "c", 500) };
		// populate AL
		for (Customer c : custs)
			custList.add(c);
		// display toString
		System.out.println("cust list " + custList);

		// accept cust id from user & check if cust exists in list
		System.out.println("Enter cust id");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		System.out
				.println("cust exists " + custList.contains(new Customer(id)));

	}

}
