package db;
import java.sql.*;
import java.util.*;
import oracle.jdbc.*;

public class TableBean {

Connection con ;
Statement ps;
ResultSet rs;
private List<CustInfo> customers;

public TableBean()
	{
		 customers= new ArrayList<CustInfo>(); 
	}

public List<CustInfo> getCustomers() throws Exception{
 int i = 0;
    try
    {
   DriverManager.registerDriver(new OracleDriver());
			

			//get connection from DriverMgr.
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			System.out.println("Conn established!!! via Type IV Oracle supplied thin client driver");
			   
    ps = con.createStatement();
    rs = ps.executeQuery("select * from customers");
	customers=new ArrayList<CustInfo>(); 
    while(rs.next()){
      System.out.println(rs.getString(1));
      customers.add(i,new CustInfo(rs.getString(1),rs.getString(2),rs.getString(3)));
      i++;

      }
      
    }
    catch (Exception e)
    {
      System.out.println("Error Data : " + e.getMessage());
    }
	con.close();
	return customers;
}



} 