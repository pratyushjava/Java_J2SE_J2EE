<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:view>
<html>
<body>
<h:outputText id="myLabel" value="#{msg.title}" />
<h:form id="form1">
<p>
<h:commandButton id="button1" value="Click">
<f:actionListener type="jsfBean.MyActionListener" />
</h:commandButton>
</p>
<p>
<h:commandButton id="button2" value="Login"
 actionListener ="#{myAction.changeIt}" >
</h:commandButton>
</p>
</h:form>
</body>
</html>
</f:view>