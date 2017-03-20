package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import POJO.UserPojo;

public class UserDao {
	
	
	
	private Connection cn;
	private PreparedStatement pst;
	private UserPojo u;
	public UserDao() {
		System.out.println("in dao default constr");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","acts","dac");
			pst=cn.prepareStatement("select * from users u where u.email=? and u.password=?");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public UserPojo validate(String email,String password)
	{
		ResultSet rst=null;
		try
		{
			pst.setString(1, email);
			pst.setString(2, password);
			rst=pst.executeQuery();
			if(rst.next())
				u=new UserPojo(rst.getString(1), rst.getString(2));
			
			System.out.println("in dao"+u);
				
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			if(rst!=null)
				try {
					rst.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return u;
	}
	
	public void Cleanup()
	{
		if(cn!=null)
			try {
				cn.close();
				if(pst!=null)
					pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
