<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%--<f:loadBundle basename="jsfBean.msgs" var="msg"/>--%>

<html> 
<head><title>Login</title></head> 
<body> 
    <f:view> 
        <h:form id="loginForm"> 
            
            <h:outputLabel for="username" value="#{msg.username_label}" />
                <h:inputText id="username" value="#{LoginBean.username}" required="true"> 
                    <f:validateLength maximum="15" minimum="3" /> 
                </h:inputText> 
                <h:message for="username" /><br />
                <h:outputLabel for="password" value="#{msg.password_label}" />
                <h:inputSecret id="password" value="#{LoginBean.password}" required="true"> 
                    <f:validateLength maximum="15" minimum="3" /> 
                </h:inputSecret> 
                <h:message for="password" /><br />
            <h:commandButton id="submit" action="#{LoginBean.login}" value="#{msg.login_button}" />
			<br><h:message for="loginForm" /><br />
        </h:form> 
    </f:view> 
</body> 
</html> 
