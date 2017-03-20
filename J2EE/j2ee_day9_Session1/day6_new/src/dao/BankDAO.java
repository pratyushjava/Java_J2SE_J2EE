package dao;

import java.sql.*;
import java.util.ArrayList;

import pojos.*;

public class BankDAO {
	private Connection cn;
	private PreparedStatement pst1, pst2;

	public BankDAO() throws Exception {
		System.out.println("in bank dao constr");
		// load drvr
		Class.forName("com.mysql.jdbc.Driver");

		// get cn
		String dbURL = "jdbc:mysql://localhost:3306/testjdbc";
		cn = DriverManager.getConnection(dbURL, "root", "root");
		// psts...
		String sql = "select id from bank_users where name=? and password=?";
		pst1 = cn.prepareStatement(sql);
		sql = "select a.ac_no,a.type,a.bal from bank_users u,bank_accounts a where u.id=? and u.id=a.id";
		pst2 = cn.prepareStatement(sql);
	}

	public void cleanUp() throws Exception {
		System.out.println("in clean-up");
		if (cn != null) {
			if (pst1 != null)
				pst1.close();
			if (pst2 != null)
				pst2.close();

			cn.close();
			cn = null;
		}
	}

	public BankUserPOJO getUserByNamePass(String name, String password)
			throws Exception {
		ResultSet rst = null;
		try {
			pst1.setString(1, name);
			pst1.setString(2, password);
			rst = pst1.executeQuery();
			if (rst.next())
				return new BankUserPOJO(rst.getInt(1), name, password);
			return null;
		} finally {
			if (rst != null)
				rst.close();
		}
	}

	public ArrayList<AccountPOJO> getUserAccounts(BankUserPOJO b)
			throws Exception {
		ResultSet rst = null;
		try {
			// logic --- fire query -- get all accts belonging to user
			// add them to AL of bank user & ret the same
			// set user id as IN param
			System.out.println("in accts "+b);
			pst2.setInt(1, b.getUserId());
			rst = pst2.executeQuery();
			//empty AL
			ArrayList<AccountPOJO> accts = new ArrayList<AccountPOJO>();
			while (rst.next())
				accts.add(new AccountPOJO(rst.getInt(1), b.getUserId(), rst
						.getString(2), rst.getDouble(3)));
			System.out.println("from dao acct list " + accts);
			b.setAccounts(accts);
			return accts;
		} finally {
			if (rst != null)
				rst.close();
		}
	}

}
