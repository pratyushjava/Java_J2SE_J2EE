<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> User Validated ...</h3>
${sessionScope.bank_user.bankUser} <br/>
<a href="summary.jsp">View Account Summary</a> 
Click <a href="logout.jsp">LogOut</a> To Exit
</body>
</html>