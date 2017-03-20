<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<f:loadBundle basename="jsfBean.messages" var="msg"/>
<html>
<head>
<title>Welcome</title>
</head> 
<body>
<f:view>
<h3>
<h:outputText value="#{msg.welcome_valid}"/> : 
<h:outputText value="#{data.inString}" />
</h3>
</f:view>
</body> 
</html> 