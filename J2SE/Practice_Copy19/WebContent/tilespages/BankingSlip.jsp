<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body topmargin="0" leftmargin="0">
<form action="">
<table background="white" border="1" width="300" align="center">
<tr ><td colspan="3"><center>The Hotel Payment Slip</center></td></tr>
<tr>
<td>HotelId :${userdet.hotelid }
<td>Full Name :${userdet.firstname }&nbsp;&nbsp;${userdet.lastname }
<tr>
<td>Fare: ${totalfare }
<tr>
<td>No Of rooms :${userdet.no_of_room }
<tr><td>
</table>
</form>
<input type="submit" name="cmd" value="print" onclick="window.print()">
</body>
</html>