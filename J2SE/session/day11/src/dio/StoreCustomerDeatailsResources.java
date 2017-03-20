package dio;

import java.io.*;
import java.util.*;

public class StoreCustomerDeatailsResources {
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
		// sort the same using Email based customers

		// TM
		TreeMap<String, Customer> tm = new TreeMap<>(custs);
		System.out.println("Sorted custs per email " + tm);
		// TM---> coll of custs
		Collection<Customer> coll = tm.values();
		// attach itr & write cus coll to bin file in buufered manner
		storeCustomers(coll);

	}

	private static void storeCustomers(Collection<Customer> c) throws Exception {
		// Till Java 6 , prog has to add finally block to
		// clean up(close) resources before terminating the appln
		// From Java 7 : can replace finally block by
		// try with resources

		try (DataOutputStream dout = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("custs.dat")));) {

			for (Customer c1 : c)
				c1.writeData(dout);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
