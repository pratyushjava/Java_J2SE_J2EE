package emp_impl;

import java.sql.*;
import java.util.Scanner;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.JOptionPane;

import cust_exc.EmpInsertionException;
import cust_exc.EmpNotFoundException;

import emp.EmpUtils;

public class EmpUtilsImpl extends UnicastRemoteObject implements EmpUtils {
	private Connection cn;
	private PreparedStatement pst, pst1;

	// constr
	public EmpUtilsImpl() throws Exception {
		System.out.println("in rem obj constr");
		// cls load,cn,psts
		initDB();
		System.out.println("jdbc inited....");

	}

	private void initDB() throws Exception {
		// load cls
		Class.forName("oracle.jdbc.OracleDriver");
		// get cn
		String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		cn = DriverManager.getConnection(dbURL, "scott", "tiger");
		String sql = "select * from my_emp where empid=?";
		// pst --- pre-parsed , pre-compiled stmt obj
		pst = cn.prepareStatement(sql);
		// insert query
		sql = "insert into my_emp values(?,?,?,?,?,?)";
		pst1 = cn.prepareStatement(sql);
	}

	@Override
	public String getEmpDtls(int empId) throws RemoteException,
			EmpNotFoundException {

		return dispEmpInfo(empId);

	}

	private String dispEmpInfo(int id) throws EmpNotFoundException {
		ResultSet rst = null;
		try {
			// set IN param/s

			pst.setInt(1, id);
			// exec query, get rst -- forward only
			rst = pst.executeQuery();
			if (rst.next())
				return "Emp ID " + rst.getInt(1) + " Name " + rst.getString(2)
						+ "  Sal " + rst.getDouble(4);
			else
				throw new EmpNotFoundException("Emp " + id + " doesn't exist");

		} catch (SQLException e1) {
			System.out.println("in eventLis --- err " + e1);
		} finally {
			if (rst != null)
				try {
					rst.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		return null;
	}

	@Override
	public String insertEmpRecord(int id, String nm, String adr, double sal,
			int deptId, String date) throws RemoteException,
			EmpInsertionException {
		// TODO Auto-generated method stub
		return addEmpRecord(id, nm, adr, sal, deptId, date);
	}

	private String addEmpRecord(int id, String nm, String adr, double sal,
			int deptId, String date) throws EmpInsertionException {
		try {
			// pst1 ---insert query

			// set In params
			pst1.setInt(1, id);// int id
			pst1.setString(2, nm);// string nm
			pst1.setString(3, adr);// string adr
			pst1.setDouble(4, sal);// double sal
			pst1.setInt(5, deptId);// int deptId
			pst1.setDate(6, Date.valueOf(date));
			// executeUpdate --- indicate sts
			int updateCnt = pst1.executeUpdate();
			if (updateCnt == 1)
				return "Emp insertion successful";
			else
				throw new EmpInsertionException("Emp " + id
						+ " insertion failed!!!!");
		} catch (SQLException e) {
			System.out.println("err in insert - " + e);
		}
		return null;
	}

	public void closeConnection() throws Exception {
		if (pst != null)
			pst.close();
		if (pst1 != null)
			pst1.close();
		if (cn != null)
			cn.close();

	}

}
