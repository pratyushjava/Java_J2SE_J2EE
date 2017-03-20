<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<h1>welcome ${user2.email }</h1>
what political party u ewant to vote  for?
<form action="user_ok.jsp">
<input type="radio" name="congress" value="cgr" id="r1" >Congress<br/>
<input type="radio" name="congress" value="bjp" id="r1">Bjp<br/>
<input type="radio" name="congress" value="mns" id="r1">MNS<br/>
<input type="submit" name="cmd" value="vote">
</form>
<c:if test="${param.cmd=='vote' }">
<jsp:useBean id="vote1" class="Beans.VoteBean" scope="application"/>
<%-- <jsp:setProperty property="*" name="vote1"/> --%>
<c:if test="${param.congress=='cgr' }">

<jsp:setProperty property="congress" name="vote1" value="${vote1.congress }"/>
<jsp:forward page="result.jsp"></jsp:forward>

</c:if>
<c:if test="${param.congress=='bjp' }">
<jsp:setProperty property="bjp" name="vote1" value="${vote1.bjp }"/>
<jsp:forward page="result.jsp"></jsp:forward>

</c:if>


<c:if test="${param.congress=='mns' }">
<jsp:setProperty property="mns" name="vote1" value="${vote1.mns }"/>
<jsp:forward page="result.jsp"></jsp:forward>

</c:if>



</c:if>

</body>
</html>