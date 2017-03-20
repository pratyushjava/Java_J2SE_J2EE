<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<html>
  <head>
    <title>Main Search page</title>
  </head>
  <body>
   <f:view>
     <h:form>
        <h:panelGrid>
          <f:facet name="header">
         <%--  <h:panelGroup>--%>
            <h2>
              <h:outputText value="Enter search criteria below."/>
            </h2>
      <%--     </h:panelGroup>--%>
          </f:facet>
          <h:outputLabel for="customerSSN">
            <h:outputText id="customerSSNLabel" value="SSN:"/>
          </h:outputLabel> 
          <h:inputText id="customerSSN" size="12" 
                       value="#{SearchPage.ssn}"/>
          <h:outputLabel for="customerFName">
            <h:outputText id="customerFNameLabel" value="First Name:"/>
          </h:outputLabel> 
          <h:inputText id="customerFName" size="32"
                        value="#{SearchPage.firstName}"/> 
          <h:outputLabel for="customerLName">
            <h:outputText id="customerLNameLabel" value="Last Name:"/>
          </h:outputLabel> 
          <h:inputText id="customerLName" size="32"
                        value="#{SearchPage.lastName}"/> 
          <f:facet name="footer">
       <%--    <h:panelGroup>--%>
              <h:commandButton value="Search"
                               action="#{SearchPage.search}"/>
       <%--     </h:panelGroup> --%>
          </f:facet>
        </h:panelGrid>
      </h:form>
   </f:view>
  </body>
</html>
