package db;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;
import java.util.*;
import oracle.jdbc.*;

public class TableBeanJNDI {

Connection con ;
Statement ps;
ResultSet rs;
private List<CustInfo> customers;
private DataSource ds;

public TableBeanJNDI() throws Exception
	{
	InitialContext ic=new InitialContext();
//	Context ctx  = (Context)ic.lookup("java:/comp/env");

	ds=(DataSource)ic.lookup("java:comp/env/jdbc/my_ora_src");

		 customers= new ArrayList<CustInfo>(); 
	}

public List<CustInfo> getCustomers() throws Exception{
 int i = 0;
    try
    {
			con=ds.getConnection();
			
			System.out.println("Conn established,  via JDBC Conn Pool");
			   
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