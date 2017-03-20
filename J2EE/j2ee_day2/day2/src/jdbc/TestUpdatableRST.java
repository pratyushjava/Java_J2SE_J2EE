package jdbc;

import java.sql.*;
import java.util.Scanner;

public class TestUpdatableRST {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Connection cn = null;
		PreparedStatement pst = null;
		ResultSet rst = null;
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("oracle.jdbc.OracleDriver");
			String dbURL = "jdbc:oracle:thin:@192.168.72.3:1521:orcl";
			cn = DriverManager.getConnection(dbURL, "oraw60", "oraw60");
			// create PST --- to attach scrollable + updatable RST
			String sql = "select a.* from accounts a";
			pst = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			// get rst --- exec query
			rst = pst.executeQuery();
			// modify specified a/c bal to new val
			System.out.println("Enter row num update amt");
			// position rst cursor on the specified row
			rst.absolute(sc.nextInt());
			rst.updateDouble(4, rst.getDouble(4) + sc.nextDouble());
			// update table
			rst.updateRow();
			// insert new row --position cursor to newly created row
			rst.moveToInsertRow();
			System.out.println("Enter new a/c dtls");
			rst.updateInt(1, sc.nextInt());// id
			rst.updateString(2, sc.next());// nm
			rst.updateString(3, sc.next());// type
			rst.updateDouble(4, sc.nextDouble());
			// insert row in db
			rst.insertRow();
			System.out.println("enter row num to delete");
			// accept row num to be deleted
			rst.absolute(sc.nextInt());
			rst.deleteRow();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rst != null)
				rst.close();

			if (pst != null)
				pst.close();
			if (cn != null)
				cn.close();

		}

	}

}
