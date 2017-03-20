<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	User Details
	<s:property value="user" />
	<center>
		<h3>Account Summary</h3>
	</center>
	<table border="1" bgcolor="cyan">
		<tr>
			<th>Acct ID</th>
			<th>Balance</th>
			<th>Creation Date</th>
		</tr>
		<s:iterator value="#session.bank_user.accts" var="acct">
			<tr>
				<td><s:property value="acctId" /></td>
				<td><s:property value="bal" /></td>
				<td><s:date name="creationDate" format="dd-MMM-yyyy" /></td>
			</tr>
		</s:iterator>
	</table><br/>
	<s:url var="url" value="create.jsp" />
	<s:a href="%{url}">Create Account</s:a><br/>
	
	<s:url var="url" value="logout.jsp" />
	<s:a href="%{url}">Log Out</s:a>
</body>
</html>