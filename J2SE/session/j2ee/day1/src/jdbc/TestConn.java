package jdbc;

import java.sql.*;

public class TestConn {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Connection cn = null;
		Statement st = null;
		ResultSet rst = null;
		try {
			// load JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			// get fixed cn from underlying driver
			String dbURL = "jdbc:mysql://localhost:3306/testjdbc";
			cn = DriverManager.getConnection(dbURL, "root", "root");
			System.out.println("cn established....");
			// create st
			st = cn.createStatement();
			String sql = "select * from my_emp";
			rst = st.executeQuery(sql);
			// process rst & disp row data
			while (rst.next())
				System.out.printf("Emp ID %d Name %s Sal %.2f Join Date %tD%n",
						rst.getInt(1), rst.getString("name"), rst.getDouble(4),
						rst.getDate(6));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rst != null)
				rst.close();
			if (st != null)
				st.close();
			if (cn != null)
				cn.close();
		}

	}

}
