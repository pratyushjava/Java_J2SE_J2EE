<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="adminDelete.action">
<table border="1">
 <c:forEach var="v" items="${sd}">
 <td>${v.flight_id}<td>${v.fare}<td>${v.arrivaltime}<td>${v.departtime}<td>${v.from}<td>${v.to}<td>${v.adult}<td>${v.children}<td>${v.infants}
  <td><input type="radio" name="rbtn" value="${v.flight_id}"><tr>
 </c:forEach>
 </table>
 <a href="DeleteShow.action">Refresh</a>
 <br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <input type="submit" name="cmd" value="Delete">
 </form>
</body>
</html>