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
    
    myadate =new Date();
    
   function getCurrentdate()
   {
	   flag=false;
	   alert("in get date");
	 alert(f1.departdate.value);
	   alert(myadate.getDate());
	   return flag;
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
	    if(to==-1 || from==-2){  ///////////////////////////////////////
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
<title>Insert title here</title>

</head>
<body bgcolor="" >
<b></b>
<form action="home.action"  name="f1" onsubmit="return validateForm(this)" method="post">

<table width="80%">


<tr>
<td>
<table border="0"  bgcolor="#87CEEB" height="450" width="80" >
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
<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="r1" value="1" checked="checked">one way &nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="r1" value="2">round trip</td></tr>
<tr><td>
<select name="to" >
<option selected="selected" value="-1">To &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
<option selected="selected" value="-2">From
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
<option value="5">5 Adult</option>
<option value="6">6 Adult</option>
<option value="7">7 Adult</option>
<option value="8">8 Adult</option>
<option value="9">9 Adult</option>
<option value="10">10 Adult</option>
<option value="11">11 Adult</option>
<option value="12">12 Adult</option>

</select>
&nbsp;&nbsp;&nbsp;&nbsp;



<select name="children" >
<option selected="selected" value="0">0 Children &nbsp;&nbsp;&nbsp;&nbsp;</option>
<option value="1">1 Children</option>
<option value="2">2 Children</option>
<option value="3">3 Children</option>
<option value="4">4 Children</option>
<option value="5">5 Children</option>
<option value="6">6 Children</option>
<option value="7">7 Children</option>
<option value="8">8 Children</option>
<option value="9">9 Children</option>
<option value="10">10 Children</option>
<option value="11">12 Children</option>

</select>

&nbsp;&nbsp;&nbsp;&nbsp;

<select name="infants" >
<option selected="selected" value="0">0 Infants &nbsp;</option>
<option value="1">1 Infants</option>
<option value="2">2 Infants</option>
<option value="3">3 Infants</option>
<option value="4">4 Infants</option>
<option value="5">5 Infants</option>
<option value="6">6 Infants</option>
<option value="7">7 Infants</option>
<option value="8">8 Infants</option>
<option value="9">9 Infants</option>
<option value="10">10 Infants</option>
<option value="11">11 Infants</option>
<option value="12">12 Infants</option>

</select>
</td></tr>


<tr><td><s:submit name="sub" value="Find Flight" onclick="home.action" ></s:submit>
</td>
</tr>

</table>
</td>
<td ><img alt="" src="Images/1.gif"  height="450" width="900">
</td>
</tr>
</table>
</form>
</body>
</html>