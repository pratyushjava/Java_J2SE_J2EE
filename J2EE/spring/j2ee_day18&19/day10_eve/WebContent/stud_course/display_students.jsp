<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display students enrolled for a course</title>
</head>
<jsp:useBean id="course" class="beans.CourseRegistrationBean" scope="session"/>
<body>
	<form>
		Course Name : <input type="text" name="cName" /><br /> <input
			type="submit" name="btn" value="Display Student Details" />
	</form>

</body>
<h2></h2>
<center>
<c:if test="${param.btn == 'Display Student Details'}">
	<jsp:setProperty property="*" name="course" />
	<h3>Students enrolled for ${param.cName}</h3>
	<c:forEach var="s" items="${course.students}">
	${s.studentId} ${s.name} ${s.addr}<br/>
	</c:forEach>
</c:if>
</center>
<a href="course.jsp">Back To Main</a>
</html>