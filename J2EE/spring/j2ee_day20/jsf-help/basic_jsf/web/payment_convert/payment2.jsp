<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <title><h:outputText value="#{msg.title_convert}"/></title>
      </head>
      <body>
         <h:form>
            <h1><h:outputText value="#{msg.enterPayment}"/></h1>
            <h:panelGrid columns="3">
               <h:outputText value="#{msg.amount}"/>
               <h:inputText id="amount" label="#{msg.amount}"
                     value="#{payment_convert.amount}" >
                  <f:convertNumber minFractionDigits="2" />
                  <f:validateDoubleRange maximum="10000" minimum="500"/>
               </h:inputText>
               <h:message for="amount" styleClass="errorMessage"/>

               <h:outputText value="#{msg.creditCard}"/>
               <h:inputText id="card" label="#{msg.creditCard}"
                            value="#{payment_convert.card}" >
                  <f:converter converterId="convert.CreditCard"/>
               </h:inputText>
               <h:message for="card" styleClass="errorMessage" showSummary="true"/>

               <h:outputText value="#{msg.expirationDate}"/>
               <h:inputText id="date" label="#{msg.expirationDate}"
                            value="#{payment_convert.date}" required="true">
                  <f:convertDateTime pattern="MM/yyyy"/>
               </h:inputText>
               <h:message for="date" styleClass="errorMessage"/>
            </h:panelGrid>
            <h:commandButton value="Process" action="process"/>
         </h:form>
      </body>
   </f:view>
</html>
