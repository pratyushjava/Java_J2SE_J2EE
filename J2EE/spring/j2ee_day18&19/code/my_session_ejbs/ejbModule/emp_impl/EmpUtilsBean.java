package emp_impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import java.sql.*;

import pojos.EmpPOJO;
import cust_exc.EmpNotFoundException;

import emp.EmpUtils;

//slsb
@Stateless(mappedName = "emp_utils")
public class EmpUtilsBean implements EmpUtils {
	// DI
	@Resource(name = "jdbc/mysql_ds")
	private DataSource ds;

	@Override
	public EmpPOJO getEmpDetails(int id) throws EmpNotFoundException {
		// TODO Auto-generated method stub
		Connection cn = null;
		PreparedStatement pst = null;
		ResultSet rst = null;
		try {
			cn = ds.getConnection();
			pst = cn.prepareStatement("select * from my_emp where empid=?");
			pst.setInt(1, id);
			rst = pst.executeQuery();
			if (rst.next())
				return new EmpPOJO(id, rst.getString(2), rst.getDouble(4));
			throw new EmpNotFoundException("Emp with ID=" + id
					+ " Not found!!!!");
		} catch (SQLException e) {
			System.out.println("err in get "+e);
		} finally {
			try {
			if (rst != null)
				rst.close();
			if (pst != null)
				pst.close();
			if (cn != null)
				cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public EmpUtilsBean() {
		System.out.println("in constr ds=" + ds);
	}

	@PostConstruct
	public void init() {
		System.out.println("in post con ds" + ds);
	}

}
