<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="Pojos.FlightPojos"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HotelUserDetails</title>
<script type="text/javascript">

function isEmpty(id1,altxt)
{
    var x = document.getElementById(id1).value;
    if (x == null || x == "") 
	{
        var s=id1+"span";
		document.getElementById(s).innerHTML=altxt;
        document.getElementById(id1).focus();
        return false;
    }
	else
	return true;
} 
function validateForm(thisform){
	var firstname=thisform.firstname.value;
	var lastname=thisform.lastname.value;
	var emailid=thisform.emailid.value;
	var password=thisform.password.value;
	var no_of_room=thisform.no_of_room.value;
	
	if(firstname==null || lastname==null ||lastname=="" ||firstname=="" ||emailid==null ||emailid=="" ||password==null ||password=="" ||no_of_room==null ||no_of_room=="")
		{
		 alert("fillup all the details");
		return false;
		}
   var bool1 =isNaN(firstname);
   var bool2 =isNaN(lastname);
   if(bool1==false || bool2==false){
	   alert("plz enter ur name in letters");
	   return false;
   }

var bool3=isNaN(no_of_room);
if(bool3==true){
	alert("No. of rooms must be integer");
	thisform.no_of_room.focus();
	return false;
}
return true;
}

</script>
</head>
<body bgcolor="white">
<b><center>Fill Up Your Details</center></b>
<form action="Hotelpayment.action" onsubmit="return validateForm(this)" method="post">

<c:forEach var="v" items="${hoteldetails }">
<c:if test="${param.r1==v.hotelid }">


<center>Hotel id &nbsp;&nbsp;&nbsp;&nbsp;${v.hotelid }<br/>
<center>AC Room  fare&nbsp;&nbsp;&nbsp;&nbsp;${v.ac_room_price }<br/>
<center>NonAC Room  fare&nbsp;&nbsp;&nbsp;&nbsp;${v.nonac_room_price }<br/>

</c:if>
</c:forEach>
<table align="center">
<tr><td>Hotel id is<td><input type="text" name="hotelid" value="${param.r1 }" readonly="readonly"/>
<tr><td>First name<td><input type="text" name="firstname" id="ln" onblur="return isEmpty(id,'*required')">&nbsp;&nbsp;<span id=lnspan></span>
<tr><td>Last name<td><input type="text" name="lastname" id="fn" onblur="return isEmpty(id,'*required')">&nbsp;&nbsp;<span id=fnspan></span>
 <tr><td>Email id<td><input type="text" name="emailid">
<tr><td>Password<td><input type="password" name="password">
 
<tr><td>select type of room <td><select name="type">
<option value="1">AC</option>
<option value="2">NonAC</option>
</select>
<tr><td>enter  no of rooms<td><input type="text" name="no_of_room" size="5" maxlength="2"/>

<tr><td><td><input type="submit" name="cmd" value="Payment">
</table>
</form>
</body>
</html>