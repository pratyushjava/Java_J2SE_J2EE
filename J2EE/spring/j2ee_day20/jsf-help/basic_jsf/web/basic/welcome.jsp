<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
<head>
<title>Welcome123</title>
</head> 
<body>
<f:view>
<h3>
<h:outputText value="Welcome" />,
<h:outputText value="#{UserBean.userName}" /> to JSF 1.2 World!
</h3>
</f:view>
</body> 
</html> 