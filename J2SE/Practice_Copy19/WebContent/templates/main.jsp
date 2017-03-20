<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: #FFFFFF" style="background-repeat: no-repeat; ">

<%-- <center><tiles:insertAttribute name="header" ></tiles:insertAttribute></center> --%>
<%-- <table border="3" bgcolor="red">
<tr><td><tiles:insertAttribute name="header"/><td><tiles:insertAttribute name="footer"/><td><tiles:insertAttribute name="body"/>
 </table>
 --%>
<center style="background-color: #000000"> <tiles:insertAttribute name="header" /></center>
 <table  width="80%" height="" border="0" background="" align="center" style="background-repeat:repeat-y">
 
 <tr >
 <%-- <td style="background-color: #000000" ><tiles:insertAttribute name="header" ></tiles:insertAttribute></td>
  --%></tr>
 <!-- <tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="show.action">	<img src="image/home.gif" width="82" height="40" alt=""></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <a href="LeftHotel.action"><img src="image/hotel.gif" width="78" height="40" alt=""></a></td>
 <tr>
  -->
  
  <tr>
  <td style="background-color: #FFFFFF" width="80%"  height="25">
  </td>
  </tr>
 
 
 
  <tr>
  <%-- <table>
  <tr><td style="background-color: #FFB6C1" height="450" width="30%"> <tiles:insertAttribute name="left"/>
  <td background="Images/12.gif" width="50%" bordercolor="#FFB6C1"><tiles:insertAttribute name="body"/>
  </td>
  </tr> 
  </table>
   --%>
 
 <td><tiles:insertAttribute name="body"></tiles:insertAttribute>
 </tr>

  <tr>
  <td style="background-color: #FFFFFF" height="10" ></td></tr>
 <tr >
 
  <tr>
  <td style="background-color: #BBA0BB" height="50" ><tiles:insertAttribute name="abovefooter"/></td></tr>
 <tr >
 
   <tr>
  <td style="background-color: #FFFFFF" height="10" ></td></tr>
 <tr >
 
  <tr>
  <td style="background-color:#F0FFFF;;background-repeat: no-repeat; " height="110" background="Images/ad.gif " ></td></tr>
 <tr >
 
 <td style="background-color: #FFFFFF" height="25" ></td></tr>
 <tr >
 
 <%-- <td style="background-color: #000000" ><tiles:insertAttribute name="footer" ></tiles:insertAttribute></td>
  --%></tr>
 </table>
 <center style="background-color: #000000"> <tiles:insertAttribute name="footer" ></tiles:insertAttribute></center>

</body>
</html>