<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to ViewAll.jsp</title>
</head>
<body>
<c:out value="Displaying all details of vendors"/>
<table border="1">
<tr>
<td>Vendor_id</td>
<td>VendorName</td>
<td>Delete</td>
</tr>
<c:forEach var="disp" items="${VenBean}">
<tr>
<td><a href="ViewDetails.jsp?v_id=${disp.v_id}">${disp.v_id}</a></td>
<td>${disp.name}</td>
<td><a href="DeleteServlet?v_id=${disp.v_id}">Delete</a></td>
</tr>
</c:forEach>
</table>

<form action="Insert.jsp">
<input type="submit" name="addrecord" value="AddVendorRecord">
</form>
</body>
</html>