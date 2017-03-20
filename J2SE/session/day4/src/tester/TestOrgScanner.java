package tester;

import org.*;
import java.util.*;

public class TestOrgScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// sc
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Emps to hire?");
		Emp[] emps = new Emp[sc.nextInt()];
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println(" 1 : Enter Mgr Details id nm basic bonus");
			System.out.println(" 2 : Enter Worker Details id nm basic no rate");
			System.out.println(" 3 : Exit Re-cruitment");
			System.out.println("Enter Option");
			switch (sc.nextInt()) {
			case 1:
				if (counter < emps.length) {
					emps[counter++] = new Mgr(sc.nextInt(), sc.next(),
							sc.nextDouble(), sc.nextDouble());
				} else {
					exit = true;
					System.out.println("Recruitment over!!!!");
				}
				break;
			case 2:
				if (counter < emps.length) {
					emps[counter++] = new Worker(sc.nextInt(), sc.next(),
							sc.nextDouble(), sc.nextInt(), sc.nextDouble());
				} else {
					exit = true;
					System.out.println("Recruitment over!!!!");
				}
				break;
			case 3:
				exit = true;
				break;
			}
		}

		// using single for-each loop --- display emp info & net sal
		for (Emp e : emps) {
			System.out.println(e + " net sal " + e.computeNetSal());
			if (e instanceof Mgr)
				System.out.println("Perf Bonus " + ((Mgr) e).getPerfBonus());
			else
				System.out.println("Hourly Rate  " + ((Worker) e).getRate());
		}

	}

}
