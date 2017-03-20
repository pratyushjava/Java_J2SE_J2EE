
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<f:view>
<html>
     <head><title>jsf h:column example</title></head>

     <body>
          <h:dataTable border="10">
          <f:facet name="header">
              <h:outputText value="This is header."/>
          </f:facet>
          <h:column>
              <f:facet name="header">
                   <h:outputText value="Student"/>
              </f:facet>
          </h:column>
          <h:column>
              <f:facet name="header">
                   <h:outputText value="Marks" />
              </f:facet>
          </h:column>
          <h:column>
              <f:facet name="header">
                   <h:outputText value="Percent" />
              </f:facet>
          </h:column>
          <f:facet name="footer">
               <h:outputText value="This is footer."/>
          </f:facet>
          </h:dataTable>
     </body>
</html>
</f:view>