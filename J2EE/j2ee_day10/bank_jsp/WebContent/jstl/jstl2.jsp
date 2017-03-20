<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<UL>
<c:forEach var="seconds" begin="500"
end="${pageContext.session.maxInactiveInterval}"
step="50">
<LI>
<%--<c:out value="${seconds}"/> seconds. --%>
${seconds} secs<br/>
</c:forEach>
<LI>Timeout exceeded.
</UL>
