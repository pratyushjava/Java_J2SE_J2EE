<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
    <%@taglib uri="/struts-dojo-tags" prefix="sa" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<script type="text/javascript">
    var datefield=document.createElement("input")
    datefield.setAttribute("type", "date")
    if (datefield.type!="date"){ //if browser doesn't support input type="date", load files for jQuery UI Date Picker
        document.write('<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />\n')
        document.write('<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"><\/script>\n')
        document.write('<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"><\/script>\n')
    }
    function validateForm(thisform)
    {
       var city=thisform.city.value;
       var no_of_rooms=thisform.no_of_rooms.value;
 	   var departdate=thisform.checkindate.value;
 	   var arrivaldate=thisform.checkoutdate.value;
 	   
 	   var xday=departdate.substring(8,10);
 	   var xmonth=departdate.substring(5,7);
 	   var xyear=departdate.substring(0,4);
 	   var yday=arrivaldate.substring(8,10);
 	   var ymonth=arrivaldate.substring(5,7);
 	   var yyear=arrivaldate.substring(0,4);
 	   var d1=new Date();
 	   //alert(d1.getDate());alert(d1.getMonth()+1);alert(d1.getFullYear());
 	   var currentdate=d1.getDate()+((d1.getMonth()+1)*100)+(d1.getFullYear()*10000);
 	   //alert(currentdate);
 	  if(city=="10000"){
	    	alert("U Must have to select city first");
	    	return false;
	    }
 	   xday=xday*1;
 	   yday=yday*1;
 	   xmonth=xmonth*100;
 	   ymonth=ymonth*100;
 	   xyear=xyear*10000;
 	   yyear=yyear*10000;
 	   var xtemp=xday+xmonth+xyear;
 	   var ytemp=yday+ymonth+yyear;
 	   //alert(xtemp);alert(ytemp);
 	
 	    if(xtemp==0 || ytemp==0)
 	    	{alert("select your checkin-checkout date");
 	    	return false;
 	    	}
 	    	else {
 	   if(xtemp<currentdate  || ytemp<currentdate)
 		   {alert("dont try to edit your past");
 	   			return false;
 		   }
 	   if(xtemp>ytemp){
 		   alert("Checkout before Checkin not possible");
 	   return false;
 	   }
 	   }
 	    if(no_of_rooms=="0"){
 	    	alert("select no. of rooms");
 	    	return false;
 	    }
 	      
 	   return true;
    }
    
</script>
 
<script>
if (datefield.type!="date"){ //if browser doesn't support input type="date", initialize date picker widget:
    jQuery(function($){ //on document.ready
        $('#birthday').datepicker();
    })
}
</script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hotel.jsp</title>

</head>
<body bgcolor="cyan">
<b></b>
<form action="HotelDetails.action" onsubmit="return validateForm(this)" method="post" >
<table width="80%">
<tr>
<td>

<table border="0"  bgcolor="#87CEEB" height="450" width="350" >
<!-- <tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="show.action">	<img src="image/home.gif" width="82" height="40" alt=""></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <a href="LeftHotel.action"><img src="image/hotel.gif" width="78" height="40" alt=""></a></td>
 --> 
 <tr style="background-color: #000000">
 <td >
 <table align="center" id="Table_01" width="300" height="15" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>
			<a href="show.action"><img src="image4/baf.jpg" width="151" height="35" alt=""></a></td>
		<td>
			<a href="Hotel.action"><img src="image4/bah.jpg" width="149" height="35" alt=""></a></td>
	</tr>
</table>
</td>
 </tr>
 
 
<tr><td>I Want to go to&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;

<select name="city" >
<option selected="selected" value="10000">Choose City To Go</option>
<c:forEach var="v" items="${CityList }">
<option value="${v.cityid }">${v.cityname } </option>

</c:forEach>

</select>

</td>
<tr><td>
Check in Date
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
Check Out Date
<tr>
<td>
 <input type="date"  name="checkindate" size="20" />
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

 
 <input type="date"  name="checkoutdate" size="20" />


</td>
 
</tr>
<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="type" value="1">AC&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="type" value="2" checked="checked">NonAC
<tr><td>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


<select name="no_of_rooms">
<option value="0">No Of Rooms</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
</select>

<tr><td align="right"><input type="submit" name="cmd" value="searchHotel"><td>
</table>
</td>
<td ><img alt="" src="Images/1.gif"  height="450" width="900">
</td>
</tr>
</table>
</form>
</body>
</html>