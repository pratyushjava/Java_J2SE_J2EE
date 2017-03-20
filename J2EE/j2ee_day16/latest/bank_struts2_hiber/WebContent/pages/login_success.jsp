<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
User Details <s:property value="user"/>
<h3>Account Summary</h3>
<s:iterator value="#session.bank_user.accts" var="acct">
<s:property value="acctId"/>
<s:property value="bal"/>
<s:date name="creationDate" format="dd-MMM-yyyy"/><br/>
</s:iterator>
<s:url var="url" value="/pages/create.jsp"/>
<s:a href="%{url}">Create Account</s:a>
</body>
</html>