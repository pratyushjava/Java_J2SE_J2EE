
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>

<body>
<h1>Struts 2 Programmatic Validation example</h1>
<s:head theme="xhtml"/>


<s:form action="validate_user2" namespace="/locale" validate="true">

	<s:textfield label="User Name" name="username" />
	<s:password label="User Password" name="password"/>	
	<s:submit value="Login" name="submit" />
	
</s:form>

</body>
</html>