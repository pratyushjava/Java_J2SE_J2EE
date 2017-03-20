
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>

<body>
<h1>Struts 2 localization example</h1>

<s:form action="validateUser" namespace="/locale">

	<s:textfield key="global.username" name="username" />
	<s:password key="global.password" name="password"/>	
	<s:submit key="global.submit" name="submit" />
	
</s:form>

<s:url var="localeEN" namespace="/locale" action="locale" >
   <s:param name="request_locale" >en</s:param>
</s:url>

<s:url var="localeDE" namespace="/locale" action="locale" >
   <s:param name="request_locale" >de</s:param>
</s:url>
<s:url var="localeFR" namespace="/locale" action="locale" >
   <s:param name="request_locale" >fr</s:param>
</s:url>

<s:url var="localeMR" namespace="/locale" action="locale" >
   <s:param name="request_locale" >mr_IN</s:param>
</s:url>

<s:url var="localeHI" namespace="/locale" action="locale" >
   <s:param name="request_locale" >hi_IN</s:param>
</s:url>


<s:a href="%{localeEN}" >English</s:a>
<s:a href="%{localeDE}" >German</s:a>
<s:a href="%{localeFR}" >France</s:a>
<s:a href="%{localeMR}" >Marathi</s:a>
<s:a href="%{localeHI}" >Hindi</s:a>
 
</body>
</html>