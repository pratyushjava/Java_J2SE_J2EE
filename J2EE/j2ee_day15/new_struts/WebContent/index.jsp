<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:url var="url" action="hello" namespace="/basic" />
	<s:a href="%{url}">Start</s:a><br/>
	<%--validations & locale related testing --%>
	<s:url var="url" action="validate" namespace="/locale" />
	<s:a href="%{url}">Start Validations</s:a><br/>
	
	<%--Emp Management DAO Based --%>
	<s:url var="url" action="test_emp" namespace="/emp" />
	<s:a href="%{url}">Manage Emps</s:a><br/>
	
	<%--File Upload Utilities --%>
	
	<s:url var="url" action="test_file_upload" namespace="/file_upload" />
	<s:a href="%{url}">File Upload</s:a>
	
	
	
</body>
</html>