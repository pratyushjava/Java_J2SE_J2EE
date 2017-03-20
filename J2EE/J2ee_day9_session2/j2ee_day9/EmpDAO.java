//Insted of Fixed cn --- uses Pooled conn.
package dao;

import java.sql.*;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import pojos.EmpPOJO;

public class EmpDAO {
	private InitialContext ctx;
	private DataSource ds;

	public EmpDAO() throws Exception {
		// IC
		ctx = new InitialContext();
		// from IC --- DS---- perform lookup --- use JNDI name
		String jndiName = "java:comp/env/jdbc/mysql_pool";
		ds = (DataSource) ctx.lookup(jndiName);

	}

	
	
	public EmpPOJO getEmpByNamePass(String nm, String pass) throws Exception {
		Connection cn = null;
		ResultSet rs=null;
		PreparedStatement pst1=null;
		try {
			cn =ds.getConnection();
			String sql = "select * from my_emp where name=? and password=?";
			pst1 = cn.prepareStatement(sql);
			pst1.setString(1, nm);
			pst1.setString(2, pass);
			// exec
			rs= pst1.executeQuery();
			if (rs.next())
				return new EmpPOJO(rs.getInt(1), rs.getString(2),
						rs.getString(5), rs.getDouble(6));
		} finally {
			if (rs != null)
				rs.close();
			if (pst1 != null)
				pst1.close();
			if (cn != null)
				cn.close();
		}
		return null;

	}

	/*public void saveEmp(EmpPOJO e) throws Exception {
		// dept_id,sal,id
		pst2.setString(1, e.getDept());
		pst2.setDouble(2, e.getSalary());
		pst2.setInt(3, e.getId());
		pst2.executeUpdate();
	}*/
	public void closeContext() throws Exception
	{
		if (ctx != null)
			ctx.close();
	}
}
