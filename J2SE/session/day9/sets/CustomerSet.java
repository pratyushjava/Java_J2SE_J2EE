package sets;

import java.util.HashSet;

public class CustomerSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create empty set of custs
		HashSet<Customer> hs=new HashSet<>();
		
		// dyn init of array --populate custs
		Customer[] custs={new Customer(101,"a@gmail","a", 100),new Customer(16,"x@gmail","x", 340),new Customer(34,"b@gmail","b", 600)};
		for (Customer c : custs)
		System.out.println("Added "+hs.add(c));
		//display cust set -- toString,iterator(for-each)
		System.out.println("HS cont via toString "+hs);
		System.out.println("HS cont via for-each");
		for (Customer c : hs)
			System.out.println(c);
			
		//chk for dup
		Customer ref=new Customer(101,"a1@gmail","a", 100);
		System.out.println("Added finally "+hs.add(ref));
		System.out.println("HS cont via toString "+hs);
		//search
		//sort set --- N.O & C.O
		

	}

}
