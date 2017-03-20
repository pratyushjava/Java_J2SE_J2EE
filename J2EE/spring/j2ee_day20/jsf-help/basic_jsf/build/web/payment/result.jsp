<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view locale="en">
      <head>
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <title><h:outputText value="#{msg.title_payment}"/></title>
      </head>
      <body>
         <h:form>
            <h1><h:outputText value="#{msg.paymentInformation}"/></h1>
            <h:panelGrid columns="2">
               <h:outputText value="#{msg.amount}"/>
               <h:outputText value="#{payment.amount}"> 
                   <f:convertNumber type="currency" locale="en"/>
               </h:outputText>

               <h:outputText value="#{msg.creditCard}"/>
               <h:outputText value="#{payment.card}"/>

               <h:outputText value="#{msg.expirationDate}"/>
               <h:outputText value="#{payment.date}"> 
                  <f:convertDateTime pattern="MM/yyyy"/>
               </h:outputText>
            </h:panelGrid>
            <h:commandButton value="Back" action="back"/>
         </h:form>
      </body>
   </f:view>
</html>
