package tester;

import java.sql.*;
import java.util.Scanner;

public class TestStoredProc {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Connection cn = null;
		CallableStatement cst = null;
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			String dbURL = "jdbc:mysql://localhost:3306/testjdbc";
			cn = DriverManager.getConnection(dbURL, "root", "root");
			// cst
			String invocationSyntax = "{call update_account(?,?,?,?,?)}";
			cst = cn.prepareCall(invocationSyntax);
			// set IN params
			System.out.println("Enter src ID, dest ID, amt for xfer funds");
			cst.setInt(1, sc.nextInt());
			cst.setInt(2, sc.nextInt());
			cst.setDouble(3, sc.nextDouble());
			//register OUT params
			cst.registerOutParameter(4,Types.DOUBLE);
			cst.registerOutParameter(5,Types.DOUBLE);
			//exec 
			cst.execute();
			System.out.printf("Update Sbal %.2f Updated DBal %.2f %n ",cst.getDouble(4),cst.getDouble(5));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (cst != null)
				cst.close();
			if (cn != null)
				cn.close();

		}

	}

}
