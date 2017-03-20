<%@ page isErrorPage="true" %>
<h2>
 Error Occured !!!!<br>
 ERR causing PAGE URI :  ${pageContext.errorData.requestURI }<br>
 HTTP ERR STS code :  ${pageContext.errorData.statusCode}<br>
 ERR Mesg :  ${pageContext.exception.message }
 </h2>