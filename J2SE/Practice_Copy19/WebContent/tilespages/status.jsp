<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Status</title>
<script type="text/javascript">
function validate(thisform){
	var pnr=thisform.pnr.value;
	var bool=isNaN(pnr);
	if(pnr==null || pnr=="" ||bool==true){
        alert("Re enter your PNR");
		thisform.pnr.focus();
		return false;
	}
	return true;
}
</script>
</head>
<body>

 <form action="GetStatus.action" onsubmit="return validate(this)" method="post">
 <table align="center">
 <tr><td>Enter Your PNR<td><input type="text" name="pnr">
 <tr><td><td><input type="submit" name="cmnd" value="GetStatus" >
 <tr height="200">
 </table>
 
 
 </form>
 
 
 <c:if test="${param.cmnd=='GetStatus' }">
<table bgcolor="white" border="1" width="800" align="center">
<tr><th>Flight Id <th>Flight Fare<th>DepartDate and Time<th>DepartDate and Time<th>Status
<tr><td align="center">${flstatus.flight_id }<td align="center">${flstatus.fare }<td align="center">${flstatus.departtime }<td align="center">${flstatus.arrivaltime }<td align="center">${flstatus.status }


</table>




</c:if>
</body>
</html>