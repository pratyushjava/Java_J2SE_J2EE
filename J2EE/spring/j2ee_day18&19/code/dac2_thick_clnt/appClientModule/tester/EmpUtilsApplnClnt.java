package tester;

import java.util.Scanner;

import javax.naming.InitialContext;
import emp.EmpUtils;

public class EmpUtilsApplnClnt {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		InitialContext ctx = null;
		try {
			ctx = new InitialContext();
			EmpUtils ref = (EmpUtils) ctx.lookup("emp_utils");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter emp id");
			System.out.println("Emp Dtls " + ref.getEmpDetails(sc.nextInt()));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ctx != null)
				ctx.close();
		}

	}

}
