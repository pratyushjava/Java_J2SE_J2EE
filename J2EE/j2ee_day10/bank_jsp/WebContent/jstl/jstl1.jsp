<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 <c:set    var="a"   scope="page"  value="Rama" /> 

 <c:out   value="${a}"   /><br/>


Welcome 
<c:set  var="s" value="${param.user}" /> <br/>
<b><c:out value="${s}" /> </b> to my web-appln.


</HTML>
