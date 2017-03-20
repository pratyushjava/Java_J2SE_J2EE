package serial;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class StoreCustomersSerial {

	/**
	 * @param args
	 */
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
		//attach OOS --use writeObj to store coll of custs
		//to bin file
		try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("custs.ser")))
		{
			out.writeObject(custs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
