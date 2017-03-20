package dao;

import java.sql.*;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.*;

import pojos.Account;

public class BankDAO {
	private InitialContext ctx;
	private DataSource ds;
	private static BankDAO dao;

	private BankDAO() throws Exception {
		ctx = new InitialContext();
		ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/mysql_conn");

	}

	public static BankDAO getBankDao() throws Exception

	{
		if (dao == null)
			dao = new BankDAO();
		return dao;
	}

	public void closeCtx() throws Exception {
		if (ctx != null)
			ctx.close();
	}

	public boolean updateAccount(Account a) throws Exception {
		// matches account inst state to DB a/c table
		boolean sts = false;
		Connection cn = null;
		PreparedStatement pst=null;
		try {

			cn = ds.getConnection();
			String updateSQL = "update bank_accounts set bal=? where ac_no=?";
			pst= cn.prepareStatement(updateSQL);
			pst.setDouble(1, a.getBalance());
			pst.setInt(2, a.getId());
			int rows = pst.executeUpdate();
			if (rows == 1)
				sts = true;

		} finally {
			if (pst != null)
				pst.close();
			if (cn != null)
				cn.close();
		}
		return sts;

	}

	public ArrayList<Account> getAccountsByNmPass(String name, String password) throws Exception{
		Connection cn = null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		ArrayList<Account> accts = null;
		try {
			cn = ds.getConnection();
			pst= cn
					.prepareStatement("select id from bank_users where name=? and password=?");
			pst.setString(1, name);
			pst.setString(2, password);
			rs= pst.executeQuery();
			if (rs.next()) {
				
				accts = new ArrayList<Account>();
				int id = rs.getInt(1);
				pst.close();
				String sql = "select a.ac_no,a.type,a.bal from bank_users u,bank_accounts a where a.id=u.id and u.id=?";
				pst = cn.prepareStatement(sql);
				pst.setInt(1, id);
				rs = pst.executeQuery();
				while (rs.next()) {
					accts.add(new Account(rs.getInt(1), rs.getString(2), rs
							.getDouble(3)));
				}
			}
		} finally {
			if(rs != null)
				rs.close();
			if (pst != null)
				pst.close();
			if (cn != null)
				cn.close();
		}
		return accts;

	}

}
