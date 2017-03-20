package com.cdac.accountproject.dal;

import java.util.ArrayList;

public interface AccountDao {

	boolean createAccount(Account account);
	boolean deleteAccount(int accno);
	boolean updateAccount(Account account);
	Account retrieveAccount(int accno);
	ArrayList<Account> retrieveAllAccounts(); 
}
