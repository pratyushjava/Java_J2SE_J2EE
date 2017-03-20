package dao;

import java.sql.*;
import java.util.ArrayList;
import pojo.VendorPojo;
public class VenderDao 
{
	
	ResultSet rst=null;
	Statement st=null;
	PreparedStatement pst1=null,pst2=null;
	ArrayList<VendorPojo> vendor=new ArrayList<>();
	VendorPojo ven;
	int result;
	
	
	public ArrayList<VendorPojo> displayAll()	
	{
		try
		{
			Connection con=DBConnection.getConnection();
			st=con.createStatement();
			
			rst=st.executeQuery("select * from vendors");
			
			while(rst.next())
			{
				ven=new VendorPojo(rst.getInt(1),rst.getInt(2), rst.getString(3),rst.getString(4));
				vendor.add(ven);
			}
			DBConnection.closeConnection(con);
			System.out.println("Connection closed");
			return vendor;
			
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return null;
	
		
	}
	
	public int deleteId(int id)
	{
		try
		{
			Connection con=DBConnection.getConnection();
			pst1=con.prepareStatement("delete from vendors where v_id=?");
			pst1.setInt(1,id);
			int del=pst1.executeUpdate();
			
			DBConnection.closeConnection(con);
			System.out.println("Connection closed");
			return del;
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		return 0;
	}
	
	public boolean InsertVendor(int id,int phno,String name,String city)
	{
		try
		{
			Connection con=DBConnection.getConnection();
			pst2=con.prepareStatement("insert into vendors values(?,?,?,?)");
			pst2.setInt(1, id);
			pst2.setInt(2,phno);
			pst2.setString(3,name);
			pst2.setString(4,city);
			result=pst2.executeUpdate();
			if(result==1)
			{
				DBConnection.closeConnection(con);
				System.out.println("Connection closed");
				return true;
			}
			else 
			{
				DBConnection.closeConnection(con);
				System.out.println("Connection closed");
				return false;
			}
				
		}
		catch(Exception e3)
		{
			e3.printStackTrace();
		}
		return false;
	}
	
}
