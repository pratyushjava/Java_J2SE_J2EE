package jdbc;

import java.sql.*;

public class TestScrollRst {

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
			// create st --- to asso with scrollable BUT read only type RST
			st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			//sql
			String sql="select * from billing";
			rst=st.executeQuery(sql);
			//rst traversing in reverse manner
			rst.afterLast();
			while(rst.previous())
				System.out.printf("Row Num %d NO %s Name %s Duration %d Amt %f%n",rst.getRow(),rst.getString(1),rst.getString("name"),rst.getInt(3),rst.getDouble(4));
			
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
