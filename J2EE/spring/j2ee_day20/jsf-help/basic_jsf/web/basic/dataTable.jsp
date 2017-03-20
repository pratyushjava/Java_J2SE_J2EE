<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<f:view><html>
<body>
<center>
<br><br><br>
<h:dataTable id="dt1" value="#{tableBean.customers}" var="item" bgcolor="cyan" border="10" cellpadding="5" cellspacing="3"  width="80%" dir="LTR" frame="box" rules="all" summary="JSF code Testing Data Table" >

<f:facet name="header">
<h:outputText value="This is 'dataTable' demo" />
</f:facet> 

<h:column>
<f:facet name="header">
<h:outputText value="Subscription ID" />
</f:facet> 
<h:outputText  value="#{item.subId}" ></h:outputText>
</h:column>

<h:column>
<f:facet name="header">
<h:outputText value="First Name"/>
</f:facet> 
<h:outputText value="#{item.firstName}"></h:outputText>
</h:column>

<h:column>
<f:facet name="header">
<h:outputText value="Last Name"/>
</f:facet> 
<h:outputText value="#{item.lastName}"></h:outputText>
</h:column>

<f:facet name="footer">
<h:outputText value="The End" />
</f:facet> 

</h:dataTable><br>


</center>
</body></html></f:view> 