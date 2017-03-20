<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:view>
<html>
<body>
<h:form>
<h:selectOneMenu id="selectDrink" value="#{valueBean.som}" title="select any one in this menu" onchange="submit()">
<f:selectItem id="si1" itemLabel="Thums Up" itemValue="11" />
<f:selectItem id="si2" itemLabel="Limca" itemValue="22" />
<f:selectItem id="si3" itemLabel="Pepsi" itemValue="33" />
<f:selectItem id="si4" itemLabel="Sprite" itemValue="44" />
<f:selectItem id="si5" itemLabel="Frooti" itemValue="55" />
<f:selectItem id="si6" itemLabel="Coca-Cola" itemValue="66" />
<f:valueChangeListener type="jsfBean.ValueBean" />
</h:selectOneMenu>
</h:form>
</body>
</html>
</f:view>