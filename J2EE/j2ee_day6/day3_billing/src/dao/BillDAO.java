package dao;

import java.sql.*;
import java.util.ArrayList;
import pojos.*;

public class BillDAO {
	private Connection cn;
	private PreparedStatement pst1, pst2, pst3;

	// DAO constr
	public BillDAO() throws Exception {
		System.out.println("in dao constr");
		// load drvr
		Class.forName("com.mysql.jdbc.Driver");

		// get cn
		String dbURL = "jdbc:mysql://localhost:3306/testjdbc";
		cn = DriverManager.getConnection(dbURL, "root", "root");
		// psts...
		String sql = "select mob_no from billing";
		pst1 = cn.prepareStatement(sql);
		sql = "select * from billing where mob_no=?";
		pst2 = cn.prepareStatement(sql);
		sql = "update billing set call_duration=?,total_bill=? where mob_no=?";
		pst3 = cn.prepareStatement(sql);
		System.out.println("dao set-up successfully...");
	}

	// clean-up
	public void cleanUp() throws Exception {
		System.out.println("in clean-up");
		if (cn != null) {
			if (pst1 != null)
				pst1.close();
			if (pst2 != null)
				pst2.close();
			if (pst3 != null)
				pst3.close();
			cn.close();
		}
		cn = null;
	}

	public ArrayList<String> getAllCellNos() throws Exception {
		ResultSet rst = null;
		ArrayList<String> l1 = null;
		try {
			// empty AL
			l1 = new ArrayList<String>();
			// exec query get RST & populate AL
			rst = pst1.executeQuery();
			while (rst.next()) {
				l1.add(rst.getString(1));
			}

			return l1;
		} finally {
			if (rst != null)
				rst.close();
		}

	}

	public BillPOJO getBillDetails(String cellNO) throws Exception {
		ResultSet rst = null;
		try {
			// set in param exec query , get rslt ,populate POJO & ret the same
			pst2.setString(1, cellNO);
			rst = pst2.executeQuery();
			if (rst.next())
				return new BillPOJO(cellNO, rst.getString(2), rst.getInt(3),
						rst.getDouble(4));
			return null;
		} finally {
			if (rst != null)
				rst.close();
		}

	}

	public String updateBillDetails(BillPOJO b) throws Exception {
		// set in params
		pst3.setInt(1, b.getCallDuration());// call duration
		pst3.setDouble(2, b.getBillAmt());// amt
		pst3.setString(3, b.getMobNo());// mob no
		int updateCnt = pst3.executeUpdate();
		if (updateCnt == 1)
			return "success";

		return "failed";
	}

}
