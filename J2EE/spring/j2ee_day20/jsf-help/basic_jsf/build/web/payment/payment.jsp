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
            <h1><h:outputText value="#{msg.enterPayment}"/></h1>
            <h:panelGrid columns="3">
               <h:outputText value="#{msg.amount}"/>
               <h:inputText id="amount" label="#{msg.amount}" 
                            value="#{payment.amount}" required="true">
                   <f:convertNumber minFractionDigits="2" locale="en"/>
               </h:inputText>
               <h:message for="amount" styleClass="errorMessage"/>

               <h:outputText value="#{msg.creditCard}"/>
               <h:inputText id="card" label="#{msg.creditCard}"
                            value="#{payment.card}" required="true"/>
               <h:panelGroup/>

               <h:outputText value="#{msg.expirationDate}"/>
               <h:inputText id="date" label="#{msg.expirationDate}"
                     value="#{payment.date}">                
                  <f:convertDateTime pattern="MM/yyyy"/>
               </h:inputText>
               <h:message for="date" styleClass="errorMessage"/>
            </h:panelGrid>
            <h:commandButton value="#{msg.process}" action="process"/>
         </h:form>
      </body>
   </f:view>
</html>
