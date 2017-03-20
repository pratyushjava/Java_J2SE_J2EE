<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="/struts-tags" prefix="s" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdminInserting</title>
</head>

<body>
 <form action="HotelInsert.action"><br><br>
 <table border="1" bgcolor="cyan">
 <tr><td>Hotel Name<td><input type="text" name="hotelname" size="5">
 <td>Location<td><input type="text" name="location" size="14">
 <td>no_of_ac_rooms<td><input type="text" name="no_of_ac_rooms" size="3">
 <td>no_of_nonac_rooms<td><input type="text" name="no_of_nonac_rooms" size="3">
 <td>ac_rooms_price<td><input type="text" name="ac_room_price" size="5">
 <td>nonac_rooms_price<td><input type="text" name="nonac_room_price" size="5">
 
 <td>city<td>
<select name="city">
<c:forEach var="v" items="${CityList}">
<option value="${v.cityid }">${v.cityname }</option>
</c:forEach>
</select>
 <td><td><input type="submit" name="cmd" value="Insert">
 </table>
 </form>
 &nbsp;<br><br>
 <c:if test="${param.cmd=='Insert' }">
 <table border="1">
 <c:forEach var="v" items="${hd}">
 
 <tr>
 <td>${v.hotelid }<td>${v.hotelname}<td>${v.ac_room_price }<td>${v.nonac_room_price }<td>${v.no_of_ac_rooms }<td>${v.no_of_nonac_rooms }
 </c:forEach>
 <!-- <tr><td><input type="submit" name="sub" value="delete"><td><input type="submit" name="sub" value="update"> -->
 </table>
 </c:if>
<!-- <a href="UpdateShow.action"> Update flight Details</a> -->
 </body>
</html>