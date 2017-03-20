<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hotelpayment</title>
</head>
<body>
<b>Fill Up Your  Payment Details</b>
<form action="Hotelpaymentdetails.action">


<table align="center">
<tr><td>Full Name<td>${userdet.firstname } ${userdet.lastname }</td>
<tr><td>No of rooms<td>${userdet.no_of_room }
<tr><td>Total Fare<td>${totalfare }


</table>

<table>


</table>
<table>
<tr><td><input type="radio" name="r1" value="d">Debit Card
<tr><td><input type="radio" name="r1" value="c">Credit Card
<tr><td><input type="radio" name="r1" value="n">Net Banking
<tr><td><select name="BankName">
<option>State Bank Of India</option>
<option>Punjab National Bank</option>
<option>Axis Bank</option>
<option>Citi Bank</option>
<option>Vijaya Bank</option>
<option>HDFC</option>
<option>ICICI</option>
<option>State Bank Of Maharastra</option>
<option>Central Bank Of India</option>
<option>Union Bank</option>
<option>Bank Of Baroda</option>


</select>

</table>
<input type="submit" value="pay" name="cmd">

</form>
<c:if test="${param.cmd=='pay' }">
<c:if test="${param.r1=='d' }">
the debit card details

</c:if>

<c:if test="${param.r1=='c' }">
the credit card details

</c:if>

<c:if test="${param.r1=='n' }">
the net banking card details

</c:if>


</c:if>

</body>
</html>