package tester;

import org.*;

public class TestOrg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create org struct --- dyn init of array
		Emp[] emps = { new Mgr(101, "aa", 1000, 100),
				new Worker(103, "bb", 500, 23, 10),
				new Mgr(151, "cc", 3000, 200),
				new Worker(56, "dd", 600, 20, 12) };
		//for -each
		for (Emp e : emps) {
			System.out.println(e +" Net sal "+e.computeNetSal());
			if (e instanceof Mgr)
			System.out.println("Bonus "+((Mgr)e).getPerfBonus());
			else
			System.out.println("Rate "+((Worker)e).getRate());
		}

	}

}
