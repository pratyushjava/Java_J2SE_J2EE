<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%--  <f:loadBundle basename="jsfBean.messages" var="msg"/>--%>

<html>
    <head>
        <title>Validating JSF Page</title>
    </head>
    <body>
        <h1>Please enter the requested data</h1>

        <f:view>
            <h:form id="form1">
                <h:panelGrid columns="3">
                    <h:outputLabel for="inp_string" value="Enter a string"/>

                    <h:inputText id="inp_string" required="true"
                                 value="#{data.inString}" size="20">
                        <f:validateLength minimum="3" maximum="12"/>
                    </h:inputText>
                    <h:message id="mid" for="inp_string" style="color: red;"/>
                    <br/>
                    <h:commandButton action="validated" value="#{msg.your_values}" />
                </h:panelGrid>
            </h:form>


        </f:view>
    </body></html>
