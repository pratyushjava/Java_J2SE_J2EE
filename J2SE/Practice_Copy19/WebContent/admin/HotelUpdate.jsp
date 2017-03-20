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
 <c:forEach var="v" items="${hd}">
 <tr>
 <td>${v.hotelid }<td>${v.hotelname}<td>${v.ac_room_price }<td>${v.nonac_room_price }<td>${v.no_of_ac_rooms }<td>${v.no_of_nonac_rooms }
  <%-- <td><input type="radio" name="rbtn" value="${v.hotelid}">${v.hotelid }</td><tr>
  --%></c:forEach>
 </table>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="HotelUpdateShow.action">Refresh</a>
<!-- <a href="DeleteShow.action">Remove that flight</a> -->
<br><br>
<form action="HoteladminUpdate.action">
<table border="1">
 <tr>
 <td>HotelId<td><select name="hotelid">
 <c:forEach var="v" items="${hd}">
 <option value="${v.hotelid}">${v.hotelid}</option>
 </c:forEach>
 </select>

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
 <td><input type="submit" name="cmd" value="Update">
 </table>
</form>
</body>
</html>