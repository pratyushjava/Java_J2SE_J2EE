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
<form action="hoteladminDelete.action">
<table border="1">
 <c:forEach var="v" items="${hd}">
 <td>${v.hotelid }<td>${v.hotelname}<td>${v.ac_room_price }<td>${v.nonac_room_price }<td>${v.no_of_ac_rooms }<td>${v.no_of_nonac_rooms }
  <td><input type="radio" name="rbtn" value="${v.hotelid}">${v.hotelid }</td><tr>
 </c:forEach>
 </table>
 <a href="HotelDeleteShow.action">Refresh</a>
 <br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <input type="submit" name="cmd" value="Delete">
 </form>
</body>
</html>