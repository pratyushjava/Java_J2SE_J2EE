package com.cdac.accountproject.dal;

public interface AccountQuery {

	String CREATE="INSERT INTO ACCOUNT VALUES(?,?,?)";
	String RETRIEVE="SELECT * FROM ACCOUNT WHERE ACCNO=?";
	String UPDATE="UPDATE ACCOUNT SET NAME=?,BALANCE=? WHERE ACCNO=?";
	String DELETE="DELETE FROM ACCOUNT WHERE ACCNO=?";
	String RETRIEVEALL="SELECT * FROM ACCOUNT";
}
