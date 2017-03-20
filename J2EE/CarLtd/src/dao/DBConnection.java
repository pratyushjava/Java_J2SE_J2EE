package dao;

import java.sql.*;

public class DBConnection 
{
	static Connection con=null;
	static
	{
		try 
		{
			
			Class.forName("oracle.jdbc.OracleDriver");
		} 
		
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws Exception
	{ 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.72.3:1521:orcl","orad46","orad46");
		return con;
	}
	
	public static void closeConnection(Connection con)
	{
		try
		{
		if(con!=null)
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
