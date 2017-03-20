
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<html>
<head>
  <title>Date Time converter examples</title>
  <style type="text/css">
   .errors { color: red }
  </style>
</head>
<body bgcolor="#ffffff">

<h1>DateTime converter examples</h1>

  <f:view>
    <h:panelGrid columns="3" border="1" cellspacing="0" cellpadding="2">
      <h:outputText value="Comments"/>
      <h:outputText value="Output"/>
      <h:outputText value="Errors"/>
<%-- verbatim : unparsed --%>
      <f:verbatim>
        default<br>
        value="{User.dateOfBirth}"
      </f:verbatim>
      <h:outputText id="DateTime1" value="#{User.dateOfBirth}">
        <f:convertDateTime/>
      </h:outputText>
      <h:message for="DateTime1" styleClass="errors"/>

      <f:verbatim escape="false">
         value="{User.dateOfBirth}"<br>
         type="date"<br>
         dateStyle="full"
     </f:verbatim>
      <h:outputText id="DateTime2" value="#{User.dateOfBirth}">
        <f:convertDateTime type="date" dateStyle="full"/>
      </h:outputText>
      <h:message for="DateTime2"/>

      <f:verbatim escape="false">
         value="{User.dateOfBirth}"<br>
         type="both"<br>
         dateStyle="full"
      </f:verbatim>
      <h:outputText id="DateTime3" value="#{User.dateOfBirth}">
        <f:convertDateTime type="both" dateStyle="full"/>
      </h:outputText>
      <h:message for="DateTime3" styleClass="errors"/>

      <f:verbatim escape="false">
         value="{User.dateOfBirth}"<br>
         type="time"<br>
         timeStyle="full"
			</f:verbatim>
      <h:outputText id="DateTime4" value="#{User.dateOfBirth}">
        <f:convertDateTime type="time" timeStyle="full"/>
      </h:outputText>
      <h:message for="DateTime4"/>

      <f:verbatim escape="false">
         value="{User.dateOfBirth}"<br>
         size="25"<br>
         type="both"<br>
         timeStyle="short"<br>
         dateStyle="short"<br>
         timeZone="Europe/Moscow"
      </f:verbatim>
      <h:form>
        <h:inputText id="DateTime5" value="#{User.dateOfBirth}" size="25">
          <f:convertDateTime type="both" dateStyle="short" timeStyle="short"
                             timeZone="Europe/Moscow"/>
        </h:inputText>
         <h:commandButton value="Go!"/>
      </h:form>
      <h:message for="DateTime5" styleClass="errors"/>

      <f:verbatim >
         value="{User.dateOfBirth}"<br>
         type="both"<br>
         dateStyle="long"<br>
         timeStyle="full"<br>
         timeZone="Europe/Moscow"<br>
         locale="ru"
      </f:verbatim>
      <h:outputText id="DateTime6" value="#{User.dateOfBirth}">
        <f:convertDateTime type="both" dateStyle="long" timeStyle="full"
                           timeZone="Europe/Moscow" locale="ru"/>
      </h:outputText>
      <h:message for="DateTime6" styleClass="errors"/>

      <f:verbatim escape="false">
         value="{User.dateOfBirth}"<br>
        pattern="MM/dd/yyyy (hh:mm a)"
      </f:verbatim>
      <h:form>
        <h:inputText id="DateFormat1" value="#{User.dateOfBirth}">
          <f:convertDateTime pattern="MM/dd/yyyy (hh:mm a)"/>
        </h:inputText>
         <h:commandButton value="Go!"/>
      </h:form>
      <h:message for="DateFormat1" styleClass="errors"/>

      <h:outputText id="DateFormatInput4" value="#{User.dateOfBirth}">
        <f:convertDateTime pattern="hh 'o''clock' a zzzz"
                           timeZone="Asia/Seoul"/>
      </h:outputText>
      <h:message for="DateFormatInput4" styleClass="errors"/>
    </h:panelGrid>
  </f:view>

</body>
</html>
