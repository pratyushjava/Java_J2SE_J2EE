<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib  uri="/struts-tags" prefix="s" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdminUpdating</title>
</head>
<body>
<table border="1">
 <c:forEach var="v" items="${sd}">
 <td>${v.flight_id}<td>${v.fare}<td>${v.arrivaltime}<td>${v.departtime}<td>${v.from}<td>${v.to}<td>${v.adult}<td>${v.children}<td>${v.infants}
  <%-- <td><input type="radio" name="rbtn" value="${v.flightid}"> --%><tr>
 </c:forEach> 
 </table>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="UpdateShow.action">Refresh</a>
<!-- <a href="DeleteShow.action">Remove that flight</a> -->
<br><br>
<form action="adminUpdate.action">
<table border="1">
 <tr>
 <td>FlightId<td><select name="flightid">
 <c:forEach var="v" items="${sd}">
 <option value="${v.flight_id}">${v.flight_id}</option>
 </c:forEach>
 </select>

 <td>Fare<td><input type="text" name="fare" size="5">
 <td>Depart Time<td><input type="text" name="departdate" size="14">
 <td>Arrival Time<td><input type="text" name="arrivaldate" size="14">
 
<td>Destination<td>
<select name="to">
<c:forEach var="v" items="${CityList}">
<option value="${v.cityid }">${v.cityname }</option>
</c:forEach>
</select>

 <td>Source<td>
<select name="from">
<c:forEach var="v" items="${CityList}">
<option value="${v.cityid }">${v.cityname }</option>
</c:forEach>
</select>
 
 <td>No of Adults<td><input type="text" name="adult" size="3">
 <td>No of Children<td><input type="text" name="children" size="3">
 <td>No oF Infants<td><input type="text" name="infants" size="3">
 <td><input type="submit" name="cmd" value="Update">

 </table>
</form>
</body>
</html>