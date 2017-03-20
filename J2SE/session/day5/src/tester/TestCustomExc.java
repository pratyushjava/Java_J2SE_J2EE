//define consts for speed range
//main accepts speed from user --- invokes checkSpeed
//checkspeed ---should NOT handle exc BUT delegate the same to main
//supply finally from both method + main

package tester;

import java.util.Scanner;

import cust_exc.SpeedOutOfRangeException;

public class TestCustomExc {
	public static final int MIN_SPEED = 40;
	public static final int MAX_SPEED = 100;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			checkSpeed(sc.nextInt());
			System.out.println("in main : try end");
		} catch (Exception e) {
			System.out.println("in main " + e);
		} finally {
			System.out.println("in main's finally");
		}
		System.out.println("cntd....");

	}

	static void checkSpeed(int speed) throws SpeedOutOfRangeException {
		try {
			if (speed < MIN_SPEED)
				throw new SpeedOutOfRangeException("U R drvng too slow!!!!");
			if (speed > MAX_SPEED)
				throw new SpeedOutOfRangeException("U r drvng too fast");
			System.out.println("Speed within range, Keep it up!");
		} finally {
			System.out.println("in meth's finally");
		}
		System.out.println("end of meth");
	}

}
