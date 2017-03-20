<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<html>
<head>
<title>enter your name page</title>
</head>
<body>
<f:view>
<h1>
<h:outputText value="JSF 1.2 Input Param"/>
</h1>
  <h:form id="UserEntryForm">
    <h:outputText value="Enter Your Name:"/>
    <h:inputText value="#{UserBean.userName}" />
    <h:commandButton action="welcome" value="OK" />
   </h:form>
</f:view>
</body>
</html> 