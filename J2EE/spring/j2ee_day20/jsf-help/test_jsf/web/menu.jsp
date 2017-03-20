<%@ taglib uri="http://java.sun.com/jsf/core"   prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html"   prefix="h" %>
<%@ taglib uri="http://java.sun.com/blueprints/ee5/components/ui" prefix="d" %>

<f:view>
    <html>
        <head>
            <title>Demonstration Components - Menu</title>
        </head>
        <body bgcolor="white">

            <h:form >

                <d:stylesheet path="/tree-control-test.css"/>

                Render graph as a menu bar (graph retrieved from model):<br>
                <d:graph_menubar id="menu2" value="#{GraphBean.menuGraph}"
                                 selectedClass="tree-control-selected"
                                 unselectedClass="tree-control-unselected" immediate="true"/>

                <hr>

                  Render graph as a menu bar (graph specified via JSP):<br>
                <d:graph_menubar id="menu3" selectedClass="tree-control-selected"
                                 unselectedClass="tree-control-unselected" immediate="true">
                    <d:graph_menunode  name="Menu" label="Menu 3" >

                        <d:graph_menunode  name="File" label="File 3" expanded="true">
                            <d:graph_menunode  name="File-New" label="New 3" action="/faces/demo-test.jsp" />
                            <d:graph_menunode  name="File-Open" label="Open 3" action="demo-test.faces" />
                            <d:graph_menunode  name="File-Close" label="Close 3" enabled="false" />
                            <d:graph_menunode  name="File-Exit" label="Exit 3" action="demo-test.faces" />
                        </d:graph_menunode>

                        <d:graph_menunode  name="Edit" label="Edit 3" >
                            <d:graph_menunode  name="Edit-Cut" label="Cut 3" action="demo-test.faces"/>
                            <d:graph_menunode  name="Edit-Copy" label="Copy 3" action="demo-test.faces" />
                            <d:graph_menunode  name="Edit-Paste" label="Paste 3" enabled="false" />
                        </d:graph_menunode>

                            <d:graph_menunode  name="Othes" label="Others" >
                            <d:graph_menunode  name="Font" label="Set Font" action="demo-test.faces"/>
                            <d:graph_menunode  name="Color" label="Set Color" action="demo-test.faces" />
                            <d:graph_menunode  name="Icon" label="Set Icon" enabled="false" />
                        </d:graph_menunode>

                    </d:graph_menunode>
                </d:graph_menubar>

                <hr>
                <%--
                Render graph as a tree control (graph retrieved from model):<br>
                <d:graph_menutree id="menu4" value="#{GraphBean.treeGraph}" styleClass="tree-control"
                     selectedClass="tree-control-selected"
                     unselectedClass="tree-control-unselected" immediate="true"/>
                <hr>
                Render graph as a tree control (graph specified via JSP):<br>
                <d:graph_menutree id="menu5" selectedClass="tree-control-selected"
                    unselectedClass="tree-control-unselected" styleClass="tree-control"
                    immediate="true">
                    <d:graph_treenode  name="Menu" label="Menu 5" enabled="false"
                         expanded="true">

        <d:graph_treenode  name="File" label="File 5"
             icon="folder_16_pad.gif" enabled="false">

            <d:graph_treenode  name="File-New" label="New 5"
                icon="folder_16_pad.gif" action="demo-test.faces"/>
            <d:graph_treenode  name="File-Open" label="Open 5"
                icon="folder_16_pad.gif" action="/demo-test.faces" />
            <d:graph_treenode  name="File-Close" label="Close 5" enabled="false"
                icon="folder_16_pad.gif" />
            <d:graph_treenode  name="File-Exit" label="Exit 5"
                icon="folder_16_pad.gif" action="demo-test.faces" />
       </d:graph_treenode>

       <d:graph_treenode  name="Edit" label="Edit 5" 
           icon="folder_16_pad.gif" expanded="true" enabled="false"> 

           <d:graph_treenode  name="Edit-Cut" label="Cut 5" 
               icon="folder_16_pad.gif" action="demo-test.faces"/>
           <d:graph_treenode  name="Edit-Copy" label="Copy 5"
               icon="folder_16_pad.gif" action="demo-test.faces" />
           <d:graph_treenode  name="Edit-Paste" label="Paste 5" enabled="false" 
               icon="folder_16_pad.gif" />
       </d:graph_treenode>
   </d:graph_treenode>
</d:graph_menutree>

<hr> --%>
            </h:form>
            <a href='<%= request.getContextPath() + "/index.faces"%>'>Back</a> to home page.
            <a href='${pageContext.servletContext.contextPath}/index.faces'>Back123</a> to home page.

        </body>
    </html>
</f:view>
