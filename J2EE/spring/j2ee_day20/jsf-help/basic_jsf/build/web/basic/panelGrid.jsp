<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<f:view>
 <html>
  <body>
   <h:form>
<h:panelGrid columns="4" border="1" title="This is panelGroup/grid demo">
    <f:facet name="header">
        <h:outputText value="Submit Detail"/>
    </f:facet>
           <h:inputText/>
           <h:inputText/>
           <h:inputText/>
           <h:inputText/>
           <h:inputText/>
           <h:inputText/>
           <h:inputText/>
           <h:inputText/>
    <f:facet name="footer">
        <h:panelGroup>
           <h:outputText value="Leave Comment Here :" />
           <h:inputText/>
           <h:outputText value="Submit" />
           <h:commandButton value="SUBMIT" />
		   <h:commandButton value="CANCEL" />
        </h:panelGroup>
    </f:facet>
</h:panelGrid> 
    </h:form>
  </body>
 </html>
</f:view> 