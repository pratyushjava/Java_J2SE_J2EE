package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write(" The contents of this file are subject to the terms\n");
      out.write(" of the Common Development and Distribution License\n");
      out.write(" (the License). You may not use this file except in\n");
      out.write(" compliance with the License.\n");
      out.write(" \n");
      out.write(" You can obtain a copy of the License at\n");
      out.write(" https://javaserverfaces.dev.java.net/CDDL.html or\n");
      out.write(" legal/CDDLv1.0.txt. \n");
      out.write(" See the License for the specific language governing\n");
      out.write(" permission and limitations under the License.\n");
      out.write(" \n");
      out.write(" When distributing Covered Code, include this CDDL\n");
      out.write(" Header Notice in each file and include the License file\n");
      out.write(" at legal/CDDLv1.0.txt.    \n");
      out.write(" If applicable, add the following below the CDDL Header,\n");
      out.write(" with the fields enclosed by brackets [] replaced by\n");
      out.write(" your own identifying information:\n");
      out.write(" \"Portions Copyrighted [year] [name of copyright owner]\"\n");
      out.write(" \n");
      out.write(" [Name of File] [ver.__] [Date]\n");
      out.write(" \n");
      out.write(" Copyright 2005 Sun Microsystems Inc. All Rights Reserved\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Demonstration Components Home Page</title>\n");
      out.write("<style type=\"text/css\" media=\"screen\">\n");
      out.write("TD { text-align: center }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"white\">\n");
      out.write("\n");

  pageContext.removeAttribute("graph", PageContext.SESSION_SCOPE);
  pageContext.removeAttribute("list", PageContext.SESSION_SCOPE);

      out.write("\n");
      out.write("\n");
      out.write("<p>Here is a small gallery of custom components built from JavaServer\n");
      out.write("Faces technology.</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("<table border=\"1\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<th>Component Content</th> \n");
      out.write("\n");
      out.write("<th>View JSP Source</th> \n");
      out.write("\n");
      out.write("<th>View Java Source</th> \n");
      out.write("\n");
      out.write("<th>Execute JSP</th></tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Image Map\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"ShowSource.jsp?filename=/imagemap.jsp\"><img src=\"images/code.gif\" width=\"24\" height=\"24\" border=\"0\"></a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/components/AreaComponent.java\">com/sun/javaee/blueprints/components/ui/components/AreaComponent.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/components/AreaSelectedEvent.java\">com/sun/javaee/blueprints/components/ui/components/AreaSelectedEvent.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/components/AreaSelectedListener.java\">com/sun/javaee/blueprints/components/ui/components/AreaSelectedListener.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/components/MapComponent.java\">com/sun/javaee/blueprints/components/ui/components/MapComponent.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/model/ImageArea.java\">com/sun/javaee/blueprints/components/ui/model/ImageArea.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/renderkit/AreaRenderer.java\">com/sun/javaee/blueprints/components/ui/renderkit/AreaRenderer.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/renderkit/MapRenderer.java\">com/sun/javaee/blueprints/components/ui/renderkit/MapRenderer.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/taglib/AreaTag.java\">com/sun/javaee/blueprints/components/ui/taglib/AreaTag.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/taglib/MapTag.java\">com/sun/javaee/blueprints/components/ui/taglib/MapTag.java</a><br />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"imagemap.faces\"><img src=\"images/execute.gif\" width=\"24\" height=\"24\" border=\"0\"></a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td>Menu or Tree\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"ShowSource.jsp?filename=/menu.jsp\"><img src=\"images/code.gif\" width=\"24\" height=\"24\" border=\"0\"></a></td>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/taglib/GraphMenuBarTag.java\">com/sun/javaee/blueprints/components/ui/taglib/GraphMenuBarTag.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/taglib/GraphMenuNodeTag.java\">com/sun/javaee/blueprints/components/ui/taglib/GraphMenuNodeTag.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/taglib/GraphMenuTreeTag.java\">com/sun/javaee/blueprints/components/ui/taglib/GraphMenuTreeTag.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/taglib/GraphTreeNodeTag.java\">com/sun/javaee/blueprints/components/ui/taglib/GraphTreeNodeTag.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/components/GraphComponent.java\">com/sun/javaee/blueprints/components/ui/components/GraphComponent.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/model/Graph.java\">com/sun/javaee/blueprints/components/ui/model/Graph.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/model/Node.java\">com/sun/javaee/blueprints/components/ui/model/Node.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/renderkit/MenuBarRenderer.java\">com/sun/javaee/blueprints/components/ui/renderkit/MenuBarRenderer.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/renderkit/MenuTreeRenderer.java\">com/sun/javaee/blueprints/components/ui/renderkit/MenuTreeRenderer.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/demo/model/GraphBean.java\">demo/model/GraphBean.java</a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"menu.faces\"><img src=\"images/execute.gif\" width=\"24\" height=\"24\" border=\"0\"></a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td>Repeater\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"ShowSource.jsp?filename=/repeater.jsp\"><img src=\"images/code.gif\" width=\"24\" height=\"24\" border=\"0\"></a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/taglib/DataRepeaterTag.java\">com/sun/javaee/blueprints/components/ui/taglib/DataRepeaterTag.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/renderkit/RepeaterRenderer.java\">com/sun/javaee/blueprints/components/ui/renderkit/RepeaterRenderer.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/demo/model/RepeaterBean.java\">demo/model/RepeaterBean.java</a><br />\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"repeater.faces\"><img src=\"images/execute.gif\" width=\"24\" height=\"24\" border=\"0\"></a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td>Scroller\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"ShowSource.jsp?filename=/result-set.jsp\"><img src=\"images/code.gif\" width=\"24\" height=\"24\" border=\"0\"></a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/taglib/ScrollerTag.java\">com/sun/javaee/blueprints/components/ui/taglib/ScrollerTag.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/components/ScrollerComponent.java\">com/sun/javaee/blueprints/components/ui/components/ScrollerComponent.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/demo/model/ResultSetBean.java\">demo/model/ResultSetBean.java</a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"result-set.faces\"><img src=\"images/execute.gif\" width=\"24\" height=\"24\" border=\"0\"></a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td>Tabbed Pane\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"ShowSource.jsp?filename=/tabbedpanes.jsp\"><img src=\"images/code.gif\" width=\"24\" height=\"24\" border=\"0\"></a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/taglib/PaneTabTag.java\">com/sun/javaee/blueprints/components/ui/taglib/PaneTabTag.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/taglib/PaneTabLabelTag.java\">com/sun/javaee/blueprints/components/ui/taglib/PaneTabLabelTag.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/taglib/PaneTabbedTag.java\">com/sun/javaee/blueprints/components/ui/taglib/PaneTabbedTag.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/components/PaneComponent.java\">com/sun/javaee/blueprints/components/ui/components/PaneComponent.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/components/PaneSelectedEvent.java\">com/sun/javaee/blueprints/components/ui/components/PaneSelectedEvent.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/renderkit/TabLabelRenderer.java\">com/sun/javaee/blueprints/components/ui/renderkit/TabLabelRenderer.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/renderkit/TabRenderer.java\">com/sun/javaee/blueprints/components/ui/renderkit/TabRenderer.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/renderkit/TabbedRenderer.java\">com/sun/javaee/blueprints/components/ui/renderkit/TabbedRenderer.java</a><br />\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"tabbedpanes.faces\"><img src=\"images/execute.gif\" width=\"24\" height=\"24\" border=\"0\"></a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td>Chart\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"ShowSource.jsp?filename=/chart.jsp\"><img src=\"images/code.gif\" width=\"24\" height=\"24\" border=\"0\"></a></td>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/taglib/ChartTag.java\">com/sun/javaee/blueprints/components/ui/taglib/ChartTag.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/taglib/ChartItemTag.java\">com/sun/javaee/blueprints/components/ui/taglib/ChartItemTag.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/components/ChartComponent.java\">com/sun/javaee/blueprints/components/ui/components/ChartComponent.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/components/ChartItemComponent.java\">com/sun/javaee/blueprints/components/ui/components/ChartItemComponent.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/renderkit/ChartServlet.java\">com/sun/javaee/blueprints/components/ui/renderkit/ChartServlet.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/model/ChartItem.java\">com/sun/javaee/blueprints/components/ui/model/ChartItem.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/demo/model/ChartBean.java\">demo/model/ChartBean.java</a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"chart.faces\"><img src=\"images/execute.gif\" width=\"24\" height=\"24\" border=\"0\"></a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td>AJAX Progress Bar\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"ShowSource.jsp?filename=/progressbar.jsp\"><img src=\"images/code.gif\" width=\"24\" height=\"24\" border=\"0\"></a></td>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/renderkit/AjaxPhaseListener.java\">com/sun/javaee/blueprints/components/ui/renderkit/AjaxPhaseListener.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/components/ProgressBarComponent.java\">com/sun/javaee/blueprints/components/ui/components/ProgressBarComponent.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/renderkit/ProgressBarRenderer.java\">com/sun/javaee/blueprints/components/ui/renderkit/ProgressBarRenderer.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/taglib/ProgressBarTag.java\">com/sun/javaee/blueprints/components/ui/taglib/ProgressBarTag.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/wait.jsp\">wait.jsp</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/complete.jsp\">complete.jsp</a><br />\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"progressbar.faces\"><img src=\"images/execute.gif\" width=\"24\" height=\"24\" border=\"0\"></a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td>AJAX Validator\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"ShowSource.jsp?filename=/ajaxValidator.jsp\"><img src=\"images/code.gif\" width=\"24\" height=\"24\" border=\"0\"></a></td>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/components/AjaxValidatorComponent.java\">com/sun/javaee/blueprints/components/ui/components/AjaxValidatorComponent.java\n");
      out.write("</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/components/AjaxValidatorPhaseListener.java\">com/sun/javaee/blueprints/components/ui/components/AjaxValidatorPhaseListener.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/taglib/AjaxValidatorTag.java\">com/sun/javaee/blueprints/components/ui/taglib/AjaxValidatorTag.java</a><br />\n");
      out.write("<a href=\"ShowSource.jsp?filename=/src/java/components/java/com/sun/javaee/blueprints/components/ui/renderkit/AjaxPhaseListener.java\">com/sun/javaee/blueprints/components/ui/renderkit/AjaxPhaseListener.java</a><br />\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td><a href=\"ajaxValidator.faces\"><img src=\"images/execute.gif\" width=\"24\" height=\"24\" border=\"0\"></a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</head>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
