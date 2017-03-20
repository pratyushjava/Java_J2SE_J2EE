<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="Pojos.FlightPojos"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="UserPassangerDetails.action">
<table border="1" bgcolor="white" align="center" width="800" >
<tr><th >Flight Id <th>Flight Fare<th>DepartDate and Time
<c:forEach var="var" items="${flightdetails }">
<tr><td style="size: 20"><input type="radio" name="r1" value="${var.flight_id }" checked="checked">${var.flight_id }<td>${var.fare }<td>${var.departtime }
<td><a href="PassangerDetails.action">select</a>

</c:forEach>


<tr><td><td><td><input type="submit" name="cmd" value="Select and Continue">
</table>
</form>
</body>
</html>