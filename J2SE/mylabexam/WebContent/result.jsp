<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<center><h1>Voting-------------------Result</h1></center>
<form action="result.jsp">
percent of user vote for congress ${vote1.perc }%<br/>
percent of user vote for bjp ${vote1.perb }%<br/>
percent of user vote for mns ${vote1.perm }%<br/>
<input type="submit" name="cmd" value="logout"/>
</form>
</body>
<c:if test="${param.cmd=='logout' }">
<%
out.print("in log out");
session.invalidate();
response.sendRedirect("index.jsp");


%>


</c:if>
</html>