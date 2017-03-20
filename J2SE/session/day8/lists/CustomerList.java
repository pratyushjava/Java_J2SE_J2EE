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

		// accept cust id  & new subAmt from user & check if cust exists in list
		//if yes update subamt , ow give err msg 
		System.out.println("Enter cust id &  new sub amt ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		Customer ref=new Customer(id);
		//System.out
			//	.println("cust exists " + custList.contains(new Customer(id)));

		int index =custList.indexOf(ref);//cals equqls method...indexof...lastindexof...contains calls equals method
		if(index != -1)
		{
			custList.get(index).setSubAmt(sc.nextDouble());
		}
		else
			System.out.println("Customer not yet registered!!!!");
		System.out.println("update cust list "+custList);
		//sort customers as per ID
		Collections.sort(custList);
		System.out.println("sorted cust list as per ids "+custList);
		//converting AL ---> array
		Customer[] c=new Customer[custList.size()];
		custList.toArray(c);
		System.out.println("cust array "+Arrays.toString(c));
		Customer[] newCusts=custList.toArray(new Customer[0]);
		System.out.println("new cust array "+Arrays.toString(newCusts));
	}

}