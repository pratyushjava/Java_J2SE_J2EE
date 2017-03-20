<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="course" class="beans.CourseRegistrationBean"
	scope="session" />

<body>
<form >
Course Name : <input type="text" name="cName"/><br/>
<input type="submit" name="btn" value="Cancel Course"/>
</form>
<center>
<c:if test="${param.btn == 'Cancel Course'}">
	<jsp:setProperty property="*" name="course" />
	<h3>Cancelled Course is  ${param.cName}</h3>
	<h3>Informing following students </h3>
	<c:forEach var="s" items="${course.deleteCourse}">
	${s.studentId} ${s.name} ${s.addr}<br/>
	</c:forEach>
</c:if>
</center>

</body>
</html>