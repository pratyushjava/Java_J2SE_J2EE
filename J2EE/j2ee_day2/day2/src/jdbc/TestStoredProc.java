package jdbc;
import java.sql.*;
import java.util.Scanner;

public class TestStoredProc {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Connection cn=null;
		CallableStatement cst=null;
		try {
			Scanner sc=new Scanner(System.in);
			//load
			Class.forName("oracle.jdbc.OracleDriver");
			//cn
			String dbURL="jdbc:oracle:thin:@192.168.72.3:1521:orcl";
			cn=DriverManager.getConnection(dbURL, "oraw60", "oraw60");
			//cst
			String invocationSyntax="{call update_account(?,?,?,?,?)}";
			cst=cn.prepareCall(invocationSyntax);
			System.out.println("Enter sid did amt");
			//set in params
			cst.setInt(1,sc.nextInt());
			cst.setInt(2,sc.nextInt());
			cst.setDouble(3,sc.nextDouble());
			//reg out params
			cst.registerOutParameter(4,Types.DOUBLE);
			cst.registerOutParameter(5,Types.DOUBLE);
			//exec
			cst.execute();
			//get rslts
			System.out.printf("Updated sbal %.2f Dbal %.2f",cst.getDouble(4),cst.getDouble(5));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (cst != null)
				cst.close();
			if (cn != null)
				cn.close();
		}

	}

}
