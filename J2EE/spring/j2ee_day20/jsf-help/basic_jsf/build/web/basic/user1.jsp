<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>


<html>
    <head>
        <title>Input Form</title>
    </head>
    <body>
        <f:view>
            <h:form>
                <h:panelGrid columns="2" >
                    <h:outputLabel value="First Name"/><h:inputText value="#{User.firstName}"/>
                    <h:outputLabel  value="Last Name"/><h:inputText value="#{User.lastName}"/>
                    <h:outputLabel      value="Phone"/><h:inputText value="#{User.phone}"/>
                    <h:outputLabel      value="Email"/><h:inputText value="#{User.email}"/>
                    <h:commandButton value="Update"/>

                </h:panelGrid>
            </h:form>

            <p>Current Tasks:</p>
            <h:dataTable value="#{User.tasks}" var="row" border="1">
                <h:column>
                    <h:outputText value="#{row}"/>
                </h:column>
            </h:dataTable>
            <p>A few recent blog entries:</p>
            <h:form>
            <h:dataTable value="#{User.recentBlogEntries}" var="row" border="1">
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="ODD"/>
                    </f:facet>
                    <h:commandLink value="#{row['ODD']}" action="validated"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="ASPVsJSF"/>
                    </f:facet>
                    <h:commandLink  value="#{row['ASPvsJSF']}" action="welcome"/>
                </h:column>

            </h:dataTable>
            </h:form>


        </f:view>
    </body>
</html> 