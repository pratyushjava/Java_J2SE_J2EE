
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<h3> From 1st page </h3>
<jsp:useBean id="dt" class="java.util.Date"/>
<c:set var="test" value="${dt}" scope="session"></c:set>
<%--<c:url var="url" value="jstl8.jsp"/> 
URL=<c:out value="${url}"/> --%>
<%--<a href="${url}">Next </a> --%>
<c:redirect  url="jstl8.jsp" >
<c:param name="name1" value="aa"/> 
</c:redirect> 

