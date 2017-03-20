<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<f:loadBundle basename="jsfBean.messages" var="Message"/>

<html> 
  <head> <title>Greeting Page</title> </head> 
 
  <body> 
     <f:view> 
        <h3> 
           <h:outputText value="#{Message.greeting_text}" />, 
           <h:outputText value="#{LoginBean.username}" />! 
        </h3> 
     </f:view> 
 </body> 
</html>
