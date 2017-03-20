<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Using JB</title>
</head>
<jsp:useBean id="user" class="beans.UserBean" scope="request"/>
<jsp:setProperty property="*" name="user"/>
<%
 /*  String sts=user.validateUser();*/
 String sts="failed";
   if (sts.equals("success")) {
%>
<jsp:forward page="user_ok.jsp"/>
<% } else {
%>
<jsp:forward page="user_err.jsp"/>
<%} %>






</html>