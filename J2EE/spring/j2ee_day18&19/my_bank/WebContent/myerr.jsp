<%@ page isErrorPage="true" %>
<h2>
 Error Occured !!!!<br>
 ERR causing URI :  ${pageContext.errorData.requestURI }<br>
 ERR code :  ${pageContext.errorData.statusCode}<br>
 ERR Mesg :  ${pageContext.exception.message }
 Throwable : ${pageContext.errorData.throwable}<br/>
 

</h2>