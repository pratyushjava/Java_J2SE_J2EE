package coll_inner_cls;

import java.util.*;

public class TestCustomerEntrySet {
	public static void main(String[] args) throws Exception {
		// empty HM of custs
		HashMap<String, Customer> custs = new HashMap<>();
		// dyn init of array -- sample custs
		Customer[] c = { new Customer("a@gmail", "a", 100),
				new Customer("b@gmail", "a", 60),
				new Customer("cc@gmail", "a", 800) };
		// populate hm
		for (Customer c1 : c)
			custs.put(c1.getEmail(), c1);
		System.out.println("HM " + custs);
		// From single line ---
		// extract BOTH key & val pair from Map
		Set<Map.Entry<String, Customer>> entries = custs.entrySet();
		for (Map.Entry<String, Customer> e : entries)
			System.out.println("Key "+e.getKey()+" Value "+e.getValue());
	}

}
