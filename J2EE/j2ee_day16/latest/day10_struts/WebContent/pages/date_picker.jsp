<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
    <%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<s:url value="/css/main.css"/>" rel="stylesheet"
type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<sx:head />
</head>
<body>
<s:form action="display" namespace="/basic">
<sx:datetimepicker name="regDate" label="Enter Date" displayFormat="dd-MMM-yyyy"/>
<sx:autocompleter label="Select Country" list="countries" name="country"/>
<s:submit></s:submit>
</s:form>
</body>
</html>