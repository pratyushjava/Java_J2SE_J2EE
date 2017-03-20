<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
    <head> 
        <link href="styles.css" rel="stylesheet" type="text/css"/>

        <title>Calculator</title>
    </head>

    <body bgcolor="white">
        <h2>JSF Calculator</h2>

        <f:view>

            <h:form id="calcForm">

                <h:panelGrid columns="3" >
                        <h:outputLabel value="First Number" for="firstNumber" />
                    <h:inputText id="firstNumber"  value="#{CalcBean.firstNumber}"
                                 required="true" >
                        <f:validateLongRange maximum="200" minimum="50"/>
                    </h:inputText>
                    <h:message style="color: red;" for="firstNumber" />

                    <h:outputLabel value="Second Number" for="secondNumber" />
                    <h:inputText id="secondNumber" value="#{CalcBean.secondNumber}"
                                 required="true" />
                    <h:message style="color: red;" for="secondNumber" />

                </h:panelGrid>
                <h:panelGroup  >
                    <h:commandButton id="submitAdd" action="#{CalcBean.add}"
                                     value="Add" />
                    <h:commandButton id="submitMultiply" action="#{CalcBean.multiply}"
                                     value="Multiply" />
                    <h:commandButton action="#{CalcBean.clear}" value="Clear" />
                </h:panelGroup>


            </h:form>
        </f:view>
</html>  
