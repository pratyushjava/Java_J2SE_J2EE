<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="InsertServlet" method="get">
VendorID: <input type="text" name="vendorid"><br/><br/>
VendorName: <input type="text" name="vendorname"><br/><br/>
PhoneNum: <input type="text" name="phoneno"><br/><br/>
City: <input type="text" name="city"><br/><br/>
<input type="submit" name="InsertVendor" value="InsertVendor">
</form>
</body>
</html>