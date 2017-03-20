
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<html>
<head>
  <title>Standard Validator examples</title>
</head>

<body>
<h1>Validator examples</h1>

<f:view>
  <h:form>
      <h:panelGrid border="1" columns="4">
           <h:outputText value="Validator(s)" />
           <h:outputText value="Comments"/>
           <h:outputText value="Input"/>
           <h:outputText value="Errors"/>
			<h:outputText value="Validate"/>
			<h:outputText value="Validation method
         validator=testForm.validateEmail" />
         
            <h:inputText id="methodInput" validator="#{testForm.validateEmail}"/>
            <h:message for="methodInput" style="color: red"/>
         <h:outputText value="None (component property)"/>
         <h:outputText value="required=true"/>
         <h:selectOneMenu  id="RequiredInput" required="true">
         <f:selectItem itemValue="" itemLabel=""/>
         <f:selectItem itemValue="1" itemLabel="dogs"/>
         <f:selectItem itemValue="2" itemLabel="birds"/>
         <f:selectItem itemValue="3" itemLabel="hamsters"/>
         </h:selectOneMenu >
         <h:message for="RequiredInput" style="color: red"/>
         <h:outputText value="Length"/>
         <h:outputText value="minimum=2 maxmimum=10" />
            <h:inputText id="LengthInput">
             <f:validateLength minimum="2" maximum="10"/>
            </h:inputText>
            <h:message for="LengthInput" style="color: red"/>
         <h:outputText value="LongRange"/>
         <h:outputText value="minimum=5 maxmimum=999" />
            <h:inputText id="LongRangeInput">
             <f:validateLongRange minimum="5" maximum="999"/>
            </h:inputText>
            <h:message for="LongRangeInput" style="color: red"/>
			<h:outputText value="DoubleRange" />
         <h:outputText value="minimum=5.1 maxmimum=6.76"/>
            <h:selectOneRadio id="DoubleRangeInput">
              <f:selectItem itemValue="5.0" itemLabel="5.0"/>
              <f:selectItem itemValue="6.1" itemLabel="6.1"/>
              <f:selectItem itemValue="6.8" itemLabel="6.8"/>
              <f:validateDoubleRange minimum="5.1" maximum="6.76"/>
            </h:selectOneRadio>
            <h:message for="DoubleRangeInput" style="color: red"/>
		<h:outputText value="Length, LongRange"/>
         <h:outputText value="required=true Length minimum=2 Length maxmimum=3 LongRange minimum=10 LongRange maxmimum=999" />
        <h:inputText id="MultiInput" required="true">
             <f:validateLength minimum="2" maximum="3"/>
             <f:validateLongRange minimum="10" maximum="999"/>
            </h:inputText>
            <h:message for="MultiInput" style="color: red"/>
        </h:panelGrid>
    
    <h:commandButton value="Go!"/>
  </h:form>
</f:view>

</body>
</html>
