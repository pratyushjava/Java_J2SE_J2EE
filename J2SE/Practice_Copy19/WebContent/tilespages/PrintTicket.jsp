<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PrintTicket</title>
<script type="text/javascript">
function validate(thisform){
	var PNR=thisform.PNR.value;
	var bool=isNaN(PNR);
	if(PNR==null || PNR=="" ||bool==true){
        alert("Re enter your Flight No.");
		thisform.PNR.focus();
		return false;
	}
	return true;
}
</script>
</head>
<body>
<form action="ShowTicket.action" onsubmit="return validate(this)" method="post">
<table align="center">
<tr><td>Enter Your Flight No:<td><input type="text" name="PNR"><br/>
<tr><td><td align="right"><input type="submit" name="cmd" value="check for flight">
</table>
</form>
</body>
</html>