<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Launch New Course</title>
</head>
<jsp:useBean id="course" class="beans.CourseRegistrationBean" scope="session"/>
<body>
	<form>
		Course Name : <input type="text" name="cName" /><br /> Fees : <input
			type="text" name="fees" /><br /> Start Date (dd-MMM-yyyy) : <input
			type="text" name="s1" /><br /> End Date (dd-MMM-yyyy) : <input
			type="text" name="s2" /><br /> <input type="submit" name="btn"
			value="Launch Course" />
	</form>
</body>
<c:if test="${param.btn == 'Launch Course'}">

	<jsp:setProperty property="*" name="course" />
	${course.course}
	
</c:if>
<a href="course.jsp">Back To Main</a>
</html>