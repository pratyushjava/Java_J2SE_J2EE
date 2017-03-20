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
 	  // flag=true;
 	   var to=thisform.to.value;
 	   var from=thisform.from.value;
 	   var departdate=thisform.departdate.value;
 	   var arrivaldate=thisform.arrivaldate.value;
 	   var radiobtn=thisform.r1.value;
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
  	    	{alert("select your journey date");
  	    		return false;
  	    	}
  	    	else {
  	   if(xtemp<currentdate  || ytemp<currentdate)
  		   {alert("dont try to edit your past");
  	   			return false;
  		   }
  	   if(xtemp>ytemp){
  		   alert("Arrival before Departure not possible");
  	   return false;
  	   }
  	   }
 	    if(to=="To" || from=="From"){  ///////////////////////////////////////
 	    	alert("select city first"); 
 	    	return false;
 	    	}else{
 	   if(to==from){
 		   alert("City must not be same");
 	   return false;
 	   }}
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
<title>UserFlightSearch</title>

</head>
<body bgcolor="" >
<form action="UserFlightDetails.action" onsubmit="return validateForm(this)" method="post">
<center>Plan your Travel</center>

<table border="0"  bgcolor="" height="500" align="center">
<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="r1" value="1" checked="checked">One Way &nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="r1" value="2">Round Trip</td></tr>
<tr><td>
<select name="to" >
<option selected="selected">To &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</option>
<c:forEach var="v" items="${CityList }">
<option value="${v.cityid }">${v.cityname } &nbsp;&nbsp;&nbsp;&nbsp;</option>

</c:forEach>
 </select>

</td>
<tr><td style="width: 200"><select name="from" >
<option selected="selected">From
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
</option>
<c:forEach var="v" items="${CityList }">
<option value="${v.cityid }">${v.cityname } &nbsp;&nbsp;&nbsp;&nbsp;</option>

</c:forEach>


</select></td>
<tr><td><input type="date"  name="departdate" size="20" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="date"  name="arrivaldate" size="20" />
</td></tr>
<tr>
<td>

<select name="adult" >
<option selected="selected" value="1">1 Adult&nbsp;&nbsp;&nbsp;&nbsp;</option>
<option value="2">2  Adult</option>
<option value="3">3Adult</option>
<option value="4">4 Adult</option>

</select>
&nbsp;&nbsp;&nbsp;&nbsp;



<select name="children" >
<option selected="selected" value="0">0 Children &nbsp;&nbsp;&nbsp;&nbsp;</option>
<option value="1">1 Children</option>
<option value="2">2 Children</option>
<option value="3">3 Children</option>

</select>

&nbsp;&nbsp;&nbsp;&nbsp;

<select name="infants" >
<option selected="selected" value="0">0 Infants &nbsp;</option>
<option value="1">1 Infants</option>
<option value="2">2 Infants</option>
<option value="3">3 Infants</option>

</select>
</td></tr>


<tr><td><s:submit name="sub" value="Find Flight" onclick="home.action" ></s:submit>
</td>
</tr>
</table>
</form>
</body>
</html>