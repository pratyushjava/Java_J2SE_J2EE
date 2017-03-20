package tester;

import java.sql.*;
import java.util.Scanner;

public class TestUpdate {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Connection cn = null;
		PreparedStatement pst = null;
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			String dbURL = "jdbc:mysql://localhost:3306/testjdbc";
			cn = DriverManager.getConnection(dbURL, "root", "root");
			String sql="update my_emp set salary=salary+(salary*?)/100 where deptid=?";
			pst=cn.prepareStatement(sql);
			// set IN params
			System.out.println("Enter inc deptid");
			pst.setDouble(1,sc.nextDouble());
			pst.setString(2,sc.next());
			System.out.println("Rows updated --"+pst.executeUpdate());
		
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pst != null)
				pst.close();
			if (cn != null)
				cn.close();

		}

	}

}
