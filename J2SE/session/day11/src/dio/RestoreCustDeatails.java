package dio;

import java.io.*;
import java.util.*;

public class RestoreCustDeatails {
	public static void main(String[] args) {
		// identify chain of strms
		// & create try-with resources block
		File f1 = new File("custs.dat");
		HashMap<String,Customer> hm=new HashMap<>();
		if (f1.exists() && f1.isFile() && f1.canRead()) {
			try (DataInputStream dis = new DataInputStream(
					new BufferedInputStream(new FileInputStream(f1)))) {
				Customer c =null;
				while (true) {
				// invoke readData() ---from cust class
					c=Customer.readData(dis);
					hm.put(c.getEmail(), c);
				}
				
			} catch (Exception e) {
				if (e instanceof EOFException)
					System.out.println("Data read over...");
				else
					e.printStackTrace();
			}
			System.out.println("Restored map "+hm);
			
		} else
			System.out.println("Invalid data file");

	}

}
