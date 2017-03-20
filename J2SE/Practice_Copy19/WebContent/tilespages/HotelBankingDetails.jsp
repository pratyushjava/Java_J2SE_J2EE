<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HotelBankingDetails</title>
<script type="text/javascript">
function timeOut()
{
var t=setTimeout("alert('Session Expired Try Again..i!i!i!')",180000);
}
function validate(thisform){
	var cardno=thisform.cardno.value;
	var cvc=thisform.cvc.value;
	var name=thisform.name.value;
	var MM=thisform.MM.value;
	var YYYY=thisform.YYYY.value;
	
	if(cardno==null ||cardno=="" ||cardno.length<16){
		alert("fillup card no again");
		thisform.cardno.focus();
		return false;
	}
	var bool1=isNaN(cardno)
	if(bool1==true){
		alert("enter no not char");
		return false;
	}
	if(MM=="MM" ||YYYY=="YYYY"){
		alert("select expiry date");
		return false;
	}
	if(cvc==null ||cvc=="" ||cvc.length<3){
		alert("fillup cvc no again");
		thisform.cvc.focus();
		return false;
	}
	var bool3=isNaN(cvc);
	if(bool3==true){
		alert("CVC must be a number");
	return false;
	}
	if(name==null ||name==""){
		alert("name is required feild");
		thisform.cvc.focus();
		return false;
	}
	var bool2=isNaN(name)
	if(bool2==false){
		alert("your name can't be a no..!!");
		return false;
	}
	
	return true;
}

</script>
</head>
<body onload="timeOut()">
<center>Fill Up Your Banking Details</center>
<form action="HotelPaymentComplete.action" onsubmit="return validate(this)" method="post">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label style="color: red;">**This page will expire in 3 minutes.**</label><br>
<table align="center">
<tr><td>Select Card Type<td><select name="CardType" >
<option>${param.BankName } MasterCard</option>
<option>${param.BankName } VisaCard</option>

</select>
<tr><td>Card No*<td><input type="text" name="cardno" size="16" maxlength="16">
<tr><td>Expiry date*<td><select name="MM">
<option selected="selected">MM</option>
<option >1</option>
<option >2</option>
<option >3</option>
<option >4</option>
<option >5</option>
<option >6</option>
<option >7</option>
<option >8</option>
<option >9</option>
<option >10</option>
<option >11</option>
<option >12</option>
</select>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<select name="YYYY">
<option selected="selected">YYYY</option>
<option >2001</option>
<option >2002</option>
<option >2003</option>
<option >2004</option>
<option >2005</option>
<option >2006</option>
<option >2007</option>
<option >2008</option>
<option >2009</option>
<option >2010</option>
<option >2011</option>
<option >2012</option>
<option >2013</option>
<option >2014</option>
<option >2015</option>
<option >2016</option>
<option >2017</option>
<option >2018</option>
<option >2019</option>
<option >2020</option>
</select>
<tr><td>CVV2/CVC2 Number<td><input type="text" name="cvc" size="3" maxlength="3">
<tr><td>Name on Card<td><input type="text" name="name" size="20">
<tr><td>Amount to be paid<td><b>${totalfare } Rs</b>
<tr><td><td><input type="submit" name="cmnd" value="Pay">&nbsp;&nbsp;
<input type="reset" name="cmnd" value="Cancel">

</table>
</form>
</body>
</html>