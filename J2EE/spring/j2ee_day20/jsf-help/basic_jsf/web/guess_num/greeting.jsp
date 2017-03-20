
<HTML>
    <HEAD> <title>Hello</title> </HEAD>
    <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
    <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
    <body bgcolor="white">
    <f:view>
    <h:form  >
      <h2>Hi,   I'm thinking of a number from
      <h:outputText value="#{guess.minimum}"/> to
      <h:outputText value="#{guess.maximum}"/>.  Can you guess
      it?</h2>

        <h:graphicImage id="waveImg" url="wave.med.gif" alt="Duke waving" />
  	<h:inputText id="userNo" value="#{guess.userNumber}">
                      <f:validateLongRange minimum="#{guess.minimum}" maximum="#{guess.maximum}" /> 
         </h:inputText>
	 <h:commandButton id="submit" action="success" value="Submit" />
         <p>
	 <h:message style="color: red;" id="errors1" for="userNo"/>

    </h:form>
    </f:view>
</HTML>  
