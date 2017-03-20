<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="/WEB-INF/ui.tld" prefix="d" %>




<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> 

<f:view> 

<html> 

<body> 

<h:form> 

 <h:outputText value="Vertical Bar 

    Chart with data specified via JSP" /> 

    <br> 

   <d:chart width="300" height="300" 

      title="Vertical Bar Chart" 

      xlabel="X-Coordinates" 

      ylabel="Y-Coordinates"> 

     <d:chartItem itemLabel="item1" 

      itemValue="200" itemColor="red" /> 

     <d:chartItem itemLabel="item2"    

      itemValue="400" itemColor="green"/> 

     <d:chartItem itemLabel="item3" 

      itemValue="250" itemColor="blue"/> 

   </d:chart>       <br><br> 

 <h:outputText value="Horizontal Bar 

   Chart with data specified via JSP" /> 

   <br> 

   <d:chart width="300" height="300"   

     type="bar" orientation="horizontal" 

     title="Horizontal Bar Chart" 

     xlabel="X-Coordinates" 

     ylabel="Y-Coordinates"> 

     <d:chartItem itemLabel="item1" 

     itemValue="200" itemColor="red" /> 

     <d:chartItem itemLabel="item2" 

     itemValue="400" itemColor="green"/> 

     <d:chartItem itemLabel="item3"  

     itemValue="250" itemColor="blue" /> 

     <d:chartItem itemLabel="item4" 

     itemValue="350" itemColor="cyan" /> 

     <d:chartItem itemLabel="item5" 

     itemValue="300" itemColor="orange"/> 

   </d:chart>           <br><br> 

<h:outputText value="Pie Chart with data    

   specified via JSP" /> 

   <br> 

   <d:chart width="400" height="200" 

      type="pie"  title="Pie Chart"> 

     <d:chartItem itemLabel="item1" 

      itemValue="200" itemColor="red" /> 

     <d:chartItem itemLabel="item2" 

      itemValue="400" itemColor="green"/> 

     <d:chartItem itemLabel="item3" 

      itemValue="600" itemColor="blue"/> 

     <d:chartItem itemLabel="item4" 

      itemValue="800" itemColor="cyan"/> 

   </d:chart> 

</h:form> 

</body> 

</html> 

</f:view> 

