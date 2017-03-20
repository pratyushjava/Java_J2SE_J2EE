package emp_util_impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;

import java.sql.*;

import pojos.EmpPOJO;
import cust_exc.EmpNotFoundException;
import emp_util.EmpUtil;
@Stateless(mappedName="dac1_emp_util")
public class EmpUtilBean implements EmpUtil {
	@Resource(mappedName="jdbc/mysql_ds")
	private DataSource ds;

	public EmpUtilBean() {
		System.out.println("in constr ...ds="+ds);
	}
	@PostConstruct
	public void init()
	{
		System.out.println("in post const ...ds="+ds);
	}
	@Override
	public EmpPOJO getEmpInfo(int id) throws EmpNotFoundException {
		Connection cn=null;
		PreparedStatement pst=null;
		ResultSet rst=null;
		try {
			cn=ds.getConnection();
			pst=cn.prepareStatement("select * from my_emp where empid=?");
			pst.setInt(1, id);
			rst=pst.executeQuery();
			if (rst.next())
				return new EmpPOJO(id,rst.getString(2),rst.getDouble(4));
			throw new EmpNotFoundException("emp id not found!!!!");
			
		} catch (SQLException e) {
			System.out.println("err in bean "+e);
		} finally {
			try {
			if (rst != null)
				rst.close();
			if (pst != null)
			pst.close();
			if (cn != null)
				cn.close();
			} catch (Exception e) {
				System.out.println("in finally "+e);
			}
		}
		
		return null;
	}

}
