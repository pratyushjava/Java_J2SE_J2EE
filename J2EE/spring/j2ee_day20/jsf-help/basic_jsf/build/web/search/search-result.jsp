<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<html>
  <head>
    <title>Search Page Results</title>
  </head>
  <body>
    <h1>Hello and welcome to the example application</h1>
  	<f:view>
	  	<h:panelGrid columns="1" border="1">
          <f:facet name="header">
          	<h:panelGroup>
              <h:outputText value="Here are the customers:"/>
          	</h:panelGroup>
          </f:facet>
          <h:panelGroup>
            <h:dataTable value="#{SearchResultPage.customers}"
            	         var="customer" border="1">
              <h:column>
                <f:facet name="header">
                  <h:outputText value="SSN"/>
	  	        </f:facet>
		        <h:outputText id="custSSN"
		                      value="#{customer.ssn}"/>
	  	      </h:column>
              <h:column>
                <f:facet name="header">
                  <h:outputText value="First Name"/>
	  	        </f:facet>
		        <h:outputText id="custFirstName"
		                      value="#{customer.firstName}"/>
	  	      </h:column>
              <h:column>
                <f:facet name="header">
                  <h:outputText value="Last Name"/>
	  	        </f:facet>
		        <h:outputText id="custLastName"
		                      value="#{customer.lastName}"/>
	  	      </h:column>
            </h:dataTable>
          </h:panelGroup>
        </h:panelGrid>
    </f:view>
  </body>
</html>