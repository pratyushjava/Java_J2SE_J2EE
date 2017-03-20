<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Hello, ${sessionScope.bank_user.uName}</h3>
<h3>Account Summary</h3>
<%--${sessionScope.bank_user.acctList} --%>
<table>
<tr>
<th>Acct No </th>
<th>Acct Type </th>
<th>Acct Bal </th>
</tr>
<c:forEach var="ac" items="${sessionScope.bank_user.acctList}">
<tr>
<td>${ac.acctID}</td>
<td>${ac.type}</td>
<td>${ac.balance}</td>
</tr>
</c:forEach>
</table>
<c:url var="url" value='transactions.jsp' />
<a href="${url}">Back To Transactions</a> 
</body>
</html>