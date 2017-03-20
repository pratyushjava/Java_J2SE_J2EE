package coll_inner_cls;

import java.util.*;

public class TestCustomerComp {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		//empty HM of custs
		HashMap<String,Customer>custs=new HashMap<>();
		//dyn init of array -- sample custs
		Customer[] c={new Customer("a@gmail", "a", 100),new Customer("b@gmail", "a", 60),new Customer("cc@gmail", "a", 800)};
		//populate hm
		for (Customer c1 : c)
			custs.put(c1.getEmail(),c1);
		System.out.println("HM "+custs);
		//i/f ref referring to imple cls inst --- DMD via i/fs
		List<Customer> l1=new ArrayList<>(custs.values());
		//sort as per C.O
		Collections.sort(l1,new CustSubAmtComparator());
		System.out.println("Sorted custs per sub amt "+l1);
		
		

	}
	
}
