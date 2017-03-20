<html>
   <%@ taglib uri="http://java.sun.com/jsf/core"  prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html"  prefix="h" %>
   <f:view>
      <head>
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <title>
            <h:outputText value="#{msg.windowTitle}"/>
         </title>
      </head>
      <body>
         <h:form>
            <h:dataTable value="#{tableData.names}" var="name" 
               styleClass="names" headerClass="namesHeader" 
               columnClasses="last,first">
               <h:column rendered="#{tableData.editable}">
                  <f:facet name="header">
                     <h:outputText value="#{msg.deleteColumnHeader}"/>
                  </f:facet>
                  <h:selectBooleanCheckbox value="#{name.markedForDeletion}" 
                     onchange="submit()"/>
               </h:column>
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msg.lastColumnHeader}"/>
                  </f:facet>
                  <h:outputText value="#{name.last},"/>
               </h:column>
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msg.firstColumnHeader}"/>
                  </f:facet>
                  <h:outputText value="#{name.first}"/>
               </h:column>
            </h:dataTable>
            <h:outputText value="#{msg.editPrompt}"/>
            <h:selectBooleanCheckbox immediate="true" onchange="this.form.submit()" 
               value="#{tableData.editable}"/>
            <h:commandButton value="#{msg.deleteButtonText}" 
               rendered="#{tableData.editable}" 
               action="#{tableData.deleteNames}" 
               disabled="#{not tableData.anyNamesMarkedForDeletion}"/>
         </h:form>
      </body>
   </f:view>
</html>
