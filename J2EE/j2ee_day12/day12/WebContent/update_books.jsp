<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/tlds/example" prefix="ex"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h3>Books Update Form</h3>
		<form>
			Enter Price Upper Limit <input type="text" name="price" /><br />
			Enter Discount % <input type="text" name="discount" /><br /> <input
				type="submit" value="Update Books" name="update" />
		</form>

		<c:if test="${param.update == 'Update Books'}">
			<ex:update_price limit="${param.price}"
				percentDisc="${param.discount}" />
				<h3>Price Updated Successfully</h3>
		</c:if>
		<a href="welcome.html">Back To Main Page</a>
	</center>
</body>
</html>