package tester;

import javax.naming.InitialContext;

import java.util.Scanner;
import emp_util.*;

public class EmpUtilsThickClnt {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		InitialContext ctx = null;
		try {
			ctx = new InitialContext();
			EmpUtil ref = (EmpUtil) ctx.lookup("dac1_emp_util");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Emp ID");
			System.out.println("Emp Details " + ref.getEmpInfo(sc.nextInt()));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ctx != null)
				ctx.close();
		}

	}

}
