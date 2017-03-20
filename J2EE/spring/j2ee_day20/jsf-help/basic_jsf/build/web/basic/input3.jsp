<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<f:loadBundle basename="jsfBean.messages" var="msg"/>

<html>
<head>
<title>Input Form Submitted via event Listener method of Bean</title>
</head>
<body>
<f:view>
<h1>
<h:outputText value="#{msg.header}"/>
</h1>
<h:form id="UserEntryForm">
<h:outputText value="#{msg.your_name}"/>
<h:inputText value="#{UserBean.userName}" />
<h:commandButton action="#{UserBean.sayHello}" value="#{msg.button_text_ok}" />
</h:form>
</f:view>
</body>
</html> 