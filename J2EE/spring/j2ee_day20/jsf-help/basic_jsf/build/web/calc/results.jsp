
<!DOCTYPE HTML PUBLIC "-//w3c//dtd html 4.01 transitional//en">
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
<head>
<title>Calculator Results</title>
</head>
<body bgcolor="#FFFF00">
<f:view>
First Number: <h:outputText id="firstNumber" 
    			                  value="#{CalcBean.firstNumber}"/> 
    			                  <br />
Second Number: 
             <h:outputText id="secondNumber" 
    			                 value="#{CalcBean.secondNumber}"/> 
    			                 <br />
<h:outputText id="result" 
    			value="#{CalcBean.result}"/> <br />

</f:view>
</body>
</html>