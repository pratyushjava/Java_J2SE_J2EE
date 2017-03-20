package com.cdac.accountproject.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccountDaoImpl implements AccountDao {

	@Override
	public boolean createAccount(Account account) {
	
	boolean isCreated=false;
	Connection con=null;
	PreparedStatement ps=null;
	
	
	try {
		con=DBUtil.getConn();
		ps=con.prepareStatement(AccountQuery.CREATE);
		
		ps.setInt(1,account.getAccno());
		ps.setString(2, account.getName());
		ps.setDouble(3,account.getBalance());
		
		
		
		
		if(ps.executeUpdate()==1)
		isCreated=true;	
	
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
	DBUtil.closeConn(con);
	}
	
	
		return isCreated;
	}
	
	
	
	
	
	
	
	
	
	
	@Override
	public boolean deleteAccount(int accno) {
		boolean isDeleted=false;
		Connection con=null;
		PreparedStatement ps=null;
		
		
		try {
			con=DBUtil.getConn();
			ps=con.prepareStatement(AccountQuery.DELETE);
			
			ps.setInt(1,accno);
			
			
			if(ps.executeUpdate()==1)
			isDeleted=true;	
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBUtil.closeConn(con);
			}
			
			return isDeleted;
}
	
	@Override
	public boolean updateAccount(Account account) {
		boolean isUpdated=false;
		Connection con=null;
		PreparedStatement ps=null;
		
		
		try {
			con=DBUtil.getConn();
			ps=con.prepareStatement(AccountQuery.UPDATE);
			ps.setString(1, account.getName());
			ps.setDouble(2,account.getBalance());
			ps.setInt(3,account.getAccno());
				
			if(ps.executeUpdate()==1)
			isUpdated=true;	
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBUtil.closeConn(con);
			}
			
			return isUpdated;
	}
	
	@Override
	public Account retrieveAccount(int accno) {
	Account account=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;		
		try {
			con=DBUtil.getConn();
			ps=con.prepareStatement(AccountQuery.RETRIEVE);
			ps.setInt(1, accno);
			rs=ps.executeQuery();
			
			if(rs.next())
			{
			account=new Account();
			account.setAccno(rs.getInt(1));
			account.setName(rs.getString(2));
			account.setBalance(rs.getDouble(3));
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBUtil.closeConn(con);
			}
			
			return account;
	}
	
	@Override
	public ArrayList<Account> retrieveAllAccounts() {
		ArrayList<Account> accounts=new ArrayList<>();
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;		
		try {
			con=DBUtil.getConn();
			st=con.createStatement();
			rs=st.executeQuery(AccountQuery.RETRIEVEALL);
			
			while(rs.next())
			{
			Account account=new Account();
			account.setAccno(rs.getInt(1));
			account.setName(rs.getString(2));
			account.setBalance(rs.getDouble(3));
			accounts.add(account);			
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBUtil.closeConn(con);
			}
			
			return accounts;
	}
	
	
}
