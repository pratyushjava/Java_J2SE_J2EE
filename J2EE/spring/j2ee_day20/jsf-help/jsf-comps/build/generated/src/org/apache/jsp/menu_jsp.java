package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ff_005fview;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fform;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005fstylesheet_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005fgraph_005fmenubar_0026_005fvalue_005funselectedClass_005fselectedClass_005fimmediate_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005fgraph_005fmenubar_0026_005funselectedClass_005fselectedClass_005fimmediate_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fexpanded;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fenabled_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005fgraph_005fmenutree_0026_005fvalue_005funselectedClass_005fstyleClass_005fselectedClass_005fimmediate_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005fgraph_005fmenutree_0026_005funselectedClass_005fstyleClass_005fselectedClass_005fimmediate_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005fexpanded_005fenabled;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fenabled;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fenabled_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fexpanded_005fenabled;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ff_005fview = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fform = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005fstylesheet_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenubar_0026_005fvalue_005funselectedClass_005fselectedClass_005fimmediate_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenubar_0026_005funselectedClass_005fselectedClass_005fimmediate_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fexpanded = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fenabled_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenutree_0026_005fvalue_005funselectedClass_005fstyleClass_005fselectedClass_005fimmediate_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenutree_0026_005funselectedClass_005fstyleClass_005fselectedClass_005fimmediate_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005fexpanded_005fenabled = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fenabled = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fenabled_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fexpanded_005fenabled = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ff_005fview.release();
    _005fjspx_005ftagPool_005fh_005fform.release();
    _005fjspx_005ftagPool_005fd_005fstylesheet_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenubar_0026_005fvalue_005funselectedClass_005fselectedClass_005fimmediate_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenubar_0026_005funselectedClass_005fselectedClass_005fimmediate_005fid.release();
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel.release();
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fexpanded.release();
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fenabled_005fnobody.release();
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenutree_0026_005fvalue_005funselectedClass_005fstyleClass_005fselectedClass_005fimmediate_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenutree_0026_005funselectedClass_005fstyleClass_005fselectedClass_005fimmediate_005fid.release();
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005fexpanded_005fenabled.release();
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fenabled.release();
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fenabled_005fnobody.release();
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fexpanded_005fenabled.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  f:view
      com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_005fview_005f0 = new com.sun.faces.taglib.jsf_core.ViewTag();
      org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_f_005fview_005f0);
      _jspx_th_f_005fview_005f0.setPageContext(_jspx_page_context);
      _jspx_th_f_005fview_005f0.setParent(null);
      _jspx_th_f_005fview_005f0.setJspId("jsp_1741556418_0");
      int _jspx_eval_f_005fview_005f0 = _jspx_th_f_005fview_005f0.doStartTag();
      if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_f_005fview_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_f_005fview_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("<html>\n");
          out.write("<head>\n");
          out.write("<title>Demonstration Components - Menu</title>\n");
          out.write("</head>\n");
          out.write("<body bgcolor=\"white\">\n");
          out.write("\n");
          if (_jspx_meth_h_005fform_005f0(_jspx_th_f_005fview_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("<a href='");
          out.print( request.getContextPath() + "/index.jsp" );
          out.write("'>Back</a> to home page.\n");
          out.write("\n");
          out.write("<h1>How to Use this Component</h1>\n");
          out.write("\n");
          out.write("<p>This component renders a <code>Graph</code> as either a menu bar or a tree control.  \n");
          out.write("The <code>Graph</code> can be specified as model data, or it can be specified in \n");
          out.write("<code>JSP</code>.</p>\n");
          out.write("\n");
          out.write("<h2>JSP Attributes</h2>\n");
          out.write("\n");
          out.write("<p>Attributes described below apply to graph_menubar tag as well as graph_tree tag \n");
          out.write("since they are just two different visual representations of the Graph Component.\n");
          out.write("Attributes can represent values directly or point to them via value binding\n");
          out.write("expressions except for actionListener attribute that points to a \n");
          out.write("method reference. This component allows the user to define CSS classes via JSP \n");
          out.write("attributes that are output in the rendered markup.  This makes it possible to \n");
          out.write("produce highly customizable output. You can compare the rendered source of this \n");
          out.write("page, using the \"View Source\" feature of your browser, with \n");
          out.write("<a href=\"ShowSource.jsp?filename=/menu.jsp\">the JSP source</A> for this page.</p>\n");
          out.write("\n");
          out.write("<table border=\"1\">\n");
          out.write("\n");
          out.write("<tr>\n");
          out.write("<th>JSP Attribute Name</th>\n");
          out.write("<th>What it Does</th>\n");
          out.write("</tr>\n");
          out.write("\n");
          out.write("<tr>\n");
          out.write("<td><code>selectedClass</code></td>\n");
          out.write("<td>A style sheet class which controls the display attributes of the selected \n");
          out.write("menu bar or tree element.  This is used to distinguish the selected portion from \n");
          out.write("the other unselected portions.</td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("\n");
          out.write("<td><code>unselectedClass</code></td>\n");
          out.write("<td>A style sheet class which controls the display attributes of an unselected menu bar or tree element.  This is used to distinguish an unselected portion from a selected portion.</\n");
          out.write("<td>\n");
          out.write("</tr>\n");
          out.write("\n");
          out.write("<tr>\n");
          out.write("<td><code>immediate</code>\n");
          out.write("</td>\n");
          out.write("<td>A flag indicating that the default ActionListener should execute\n");
          out.write("      immediately (that is, during the Apply Request Values phase of the \n");
          out.write("      request processing lifecycle, instead of waiting for Invoke \n");
          out.write("      Application phase). The default value of this property must be false.\n");
          out.write("</td>\n");
          out.write("</tr>\n");
          out.write("\n");
          out.write("<tr>\n");
          out.write("<td><code>styleClass</code></td>\n");
          out.write("<td>The CSS style <code>class</code> to be applied to the entire menu/tree.\n");
          out.write("</td>\n");
          out.write("</tr>\n");
          out.write("\n");
          out.write("<tr>\n");
          out.write("<td><code>value</code></td>\n");
          out.write("<td>Value Binding reference expression that points to a Graph in scoped namespace.\n");
          out.write("</td>\n");
          out.write("</tr>\n");
          out.write("\n");
          out.write("<tr>\n");
          out.write("<td><code>actionListener</code></td>\n");
          out.write("<td>Method binding reference to handle tree expansion and contraction events.\n");
          out.write("</td>\n");
          out.write("</tr>\n");
          out.write("\n");
          out.write("</table>\n");
          out.write("\n");
          out.write("<h2>Menu Bar</h2>\n");
          out.write("\n");
          out.write("<p>The menu bar can be described from a <code>Graph</code> specified in the model or it can be described from <code>JSP</code> tags.</p>\n");
          out.write("\n");
          out.write("<h3>Described From JSP</h3>\n");
          out.write("\n");
          out.write("<p>The <code>graph_menubar</code> tag consists of multiple <code>graph_menunode</code> tags.  Each <code>graph_menunode</code> tag corresponds to an item on the menu bar, and you can nest <code>graph_menunode</code> tags within each other.  The <code>graph_menunode</code> tag has attributes that control the visual aspects of the node, and it has an <code>action</code> attribute that can be used to specify a context-relative URL for when the node is selected.  Refer to the tag library descriptor <code>tld</code> file for a complete list of attributes.</p>\n");
          out.write("\n");
          out.write("<h3>Described From Model</h3>\n");
          out.write("\n");
          out.write("<p>The <code>graph_menubar</code> tag refers to a <code>Graph</code> model component through the <code>valueRef</code> attribute.  The <code>Graph</code> model component consists of multiple <code>Node</code> components.  Each <code>Node</code> component describes an item on the menu bar.</p>\n");
          out.write("\n");
          out.write("<h2>Tree Control</h2>\n");
          out.write("\n");
          out.write("<p>The tree control can be described from a <code>Graph</code> specified in the model or it can be described from <code>JSP</code> tags.</p>\n");
          out.write("\n");
          out.write("<h3>Described From JSP</h3>\n");
          out.write("\n");
          out.write("<p>The <code>graph_menutree</code> tag consists of multiple <code>graph_treenode</code> tags.  Each <code>graph_treenode</code> tag corresponds to a node in the tree, and you can nest <code>graph_treenode</code> tags within each other.  The <code>graph_treenode</code> tag has attributes that control the visual aspects of the node, and it has an <code>action</code> attribute that can be used to specify a context-relative URL for when the node is selected.  Refer to the tag library descriptor <code>tld</code> file for a complete list of attributes.</p>\n");
          out.write("\n");
          out.write("<h3>Described From Model</h3>\n");
          out.write("\n");
          out.write("<p>The <code>graph_menutree</code> tag refers to a <code>Graph</code> model component through the <code>valueRef</code> attribute.  The <code>Graph</code> model component consists of multiple <code>Node</code> components.  Each <code>Node</code> component describes an item in the tree.</p>\n");
          out.write("\n");
          out.write(" \n");
          out.write("<hr>\n");
          out.write("\n");
          out.write("<a href='");
          out.print( request.getContextPath() + "/index.jsp" );
          out.write("'>Back</a> to home page.\n");
          out.write("\n");
          out.write("</body>\n");
          out.write("</html>\n");
          int evalDoAfterBody = _jspx_th_f_005fview_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_f_005fview_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_th_f_005fview_005f0.release();
        org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_f_005fview_005f0);
        return;
      }
      _jspx_th_f_005fview_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_f_005fview_005f0);
      out.write('\n');
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

  private boolean _jspx_meth_h_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_005fview_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_005fform_005f0 = new com.sun.faces.taglib.html_basic.FormTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005fform_005f0);
    _jspx_th_h_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_005fview_005f0);
    _jspx_th_h_005fform_005f0.setJspId("jsp_1741556418_1");
    int _jspx_eval_h_005fform_005f0 = _jspx_th_h_005fform_005f0.doStartTag();
    if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_005fform_005f0.doInitBody();
      }
      do {
        out.write('\n');
        out.write('\n');
        if (_jspx_meth_d_005fstylesheet_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("Render graph as a menu bar (graph retrieved from model):<br>\n");
        if (_jspx_meth_d_005fgraph_005fmenubar_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("<hr>\n");
        out.write("Render graph as a menu bar (graph specified via JSP):<br>\n");
        if (_jspx_meth_d_005fgraph_005fmenubar_005f1(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("<hr>\n");
        out.write("Render graph as a tree control (graph retrieved from model):<br>\n");
        if (_jspx_meth_d_005fgraph_005fmenutree_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("<hr>\n");
        out.write("Render graph as a tree control (graph specified via JSP):<br>\n");
        if (_jspx_meth_d_005fgraph_005fmenutree_005f1(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("<hr>\n");
        int evalDoAfterBody = _jspx_th_h_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_h_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fform_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fform_005f0);
      return true;
    }
    _jspx_th_h_005fform_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_d_005fstylesheet_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:stylesheet
    com.sun.javaee.blueprints.components.ui.taglib.StylesheetTag _jspx_th_d_005fstylesheet_005f0 = new com.sun.javaee.blueprints.components.ui.taglib.StylesheetTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_d_005fstylesheet_005f0);
    _jspx_th_d_005fstylesheet_005f0.setPageContext(_jspx_page_context);
    _jspx_th_d_005fstylesheet_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /menu.jsp(75,0) name = path type = javax.el.ValueExpression reqTime = false required = true fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fstylesheet_005f0.setPath(new org.apache.jasper.el.JspValueExpression("/menu.jsp(75,0) '/tree-control-test.css'",_el_expressionfactory.createValueExpression("/tree-control-test.css",java.lang.String.class)));
    _jspx_th_d_005fstylesheet_005f0.setJspId("jsp_1741556418_2");
    int _jspx_eval_d_005fstylesheet_005f0 = _jspx_th_d_005fstylesheet_005f0.doStartTag();
    if (_jspx_th_d_005fstylesheet_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_d_005fstylesheet_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005fstylesheet_005f0);
      return true;
    }
    _jspx_th_d_005fstylesheet_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005fstylesheet_005f0);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenubar_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menubar
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuBarTag _jspx_th_d_005fgraph_005fmenubar_005f0 = new com.sun.javaee.blueprints.components.ui.taglib.GraphMenuBarTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_d_005fgraph_005fmenubar_005f0);
    _jspx_th_d_005fgraph_005fmenubar_005f0.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenubar_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /menu.jsp(78,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f0.setId("menu2");
    // /menu.jsp(78,0) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = com.sun.javaee.blueprints.components.ui.model.Graph methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/menu.jsp(78,0) '#{GraphBean.menuGraph}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{GraphBean.menuGraph}",com.sun.javaee.blueprints.components.ui.model.Graph.class)));
    // /menu.jsp(78,0) name = selectedClass type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f0.setSelectedClass(new org.apache.jasper.el.JspValueExpression("/menu.jsp(78,0) 'tree-control-selected'",_el_expressionfactory.createValueExpression("tree-control-selected",java.lang.String.class)));
    // /menu.jsp(78,0) name = unselectedClass type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f0.setUnselectedClass(new org.apache.jasper.el.JspValueExpression("/menu.jsp(78,0) 'tree-control-unselected'",_el_expressionfactory.createValueExpression("tree-control-unselected",java.lang.String.class)));
    // /menu.jsp(78,0) name = immediate type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = boolean methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f0.setImmediate(new org.apache.jasper.el.JspValueExpression("/menu.jsp(78,0) 'true'",_el_expressionfactory.createValueExpression("true",boolean.class)));
    _jspx_th_d_005fgraph_005fmenubar_005f0.setJspId("jsp_1741556418_3");
    int _jspx_eval_d_005fgraph_005fmenubar_005f0 = _jspx_th_d_005fgraph_005fmenubar_005f0.doStartTag();
    if (_jspx_th_d_005fgraph_005fmenubar_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_d_005fgraph_005fmenubar_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005fgraph_005fmenubar_005f0);
      return true;
    }
    _jspx_th_d_005fgraph_005fmenubar_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005fgraph_005fmenubar_005f0);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenubar_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menubar
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuBarTag _jspx_th_d_005fgraph_005fmenubar_005f1 = new com.sun.javaee.blueprints.components.ui.taglib.GraphMenuBarTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_d_005fgraph_005fmenubar_005f1);
    _jspx_th_d_005fgraph_005fmenubar_005f1.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenubar_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /menu.jsp(84,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f1.setId("menu3");
    // /menu.jsp(84,0) name = selectedClass type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f1.setSelectedClass(new org.apache.jasper.el.JspValueExpression("/menu.jsp(84,0) 'tree-control-selected'",_el_expressionfactory.createValueExpression("tree-control-selected",java.lang.String.class)));
    // /menu.jsp(84,0) name = unselectedClass type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f1.setUnselectedClass(new org.apache.jasper.el.JspValueExpression("/menu.jsp(84,0) 'tree-control-unselected'",_el_expressionfactory.createValueExpression("tree-control-unselected",java.lang.String.class)));
    // /menu.jsp(84,0) name = immediate type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = boolean methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f1.setImmediate(new org.apache.jasper.el.JspValueExpression("/menu.jsp(84,0) 'true'",_el_expressionfactory.createValueExpression("true",boolean.class)));
    _jspx_th_d_005fgraph_005fmenubar_005f1.setJspId("jsp_1741556418_4");
    int _jspx_eval_d_005fgraph_005fmenubar_005f1 = _jspx_th_d_005fgraph_005fmenubar_005f1.doStartTag();
    if (_jspx_eval_d_005fgraph_005fmenubar_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_d_005fgraph_005fmenubar_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_d_005fgraph_005fmenubar_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_d_005fgraph_005fmenubar_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f0(_jspx_th_d_005fgraph_005fmenubar_005f1, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_d_005fgraph_005fmenubar_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_d_005fgraph_005fmenubar_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_d_005fgraph_005fmenubar_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_d_005fgraph_005fmenubar_005f1.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005fgraph_005fmenubar_005f1);
      return true;
    }
    _jspx_th_d_005fgraph_005fmenubar_005f1.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005fgraph_005fmenubar_005f1);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenunode_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005fmenubar_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menunode
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag _jspx_th_d_005fgraph_005fmenunode_005f0 = (com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel.get(com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag.class);
    _jspx_th_d_005fgraph_005fmenunode_005f0.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenunode_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005fmenubar_005f1);
    // /menu.jsp(86,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f0.setName("Menu");
    // /menu.jsp(86,4) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f0.setLabel("Menu 3");
    int _jspx_eval_d_005fgraph_005fmenunode_005f0 = _jspx_th_d_005fgraph_005fmenunode_005f0.doStartTag();
    if (_jspx_eval_d_005fgraph_005fmenunode_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_d_005fgraph_005fmenunode_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_d_005fgraph_005fmenunode_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_d_005fgraph_005fmenunode_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f1(_jspx_th_d_005fgraph_005fmenunode_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("       ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f6(_jspx_th_d_005fgraph_005fmenunode_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        int evalDoAfterBody = _jspx_th_d_005fgraph_005fmenunode_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_d_005fgraph_005fmenunode_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_d_005fgraph_005fmenunode_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel.reuse(_jspx_th_d_005fgraph_005fmenunode_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel.reuse(_jspx_th_d_005fgraph_005fmenunode_005f0);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenunode_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005fmenunode_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menunode
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag _jspx_th_d_005fgraph_005fmenunode_005f1 = (com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fexpanded.get(com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag.class);
    _jspx_th_d_005fgraph_005fmenunode_005f1.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenunode_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005fmenunode_005f0);
    // /menu.jsp(87,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f1.setName("File");
    // /menu.jsp(87,8) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f1.setLabel("File 3");
    // /menu.jsp(87,8) name = expanded type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f1.setExpanded(true);
    int _jspx_eval_d_005fgraph_005fmenunode_005f1 = _jspx_th_d_005fgraph_005fmenunode_005f1.doStartTag();
    if (_jspx_eval_d_005fgraph_005fmenunode_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_d_005fgraph_005fmenunode_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_d_005fgraph_005fmenunode_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_d_005fgraph_005fmenunode_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f2(_jspx_th_d_005fgraph_005fmenunode_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f3(_jspx_th_d_005fgraph_005fmenunode_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f4(_jspx_th_d_005fgraph_005fmenunode_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f5(_jspx_th_d_005fgraph_005fmenunode_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_d_005fgraph_005fmenunode_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_d_005fgraph_005fmenunode_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_d_005fgraph_005fmenunode_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fexpanded.reuse(_jspx_th_d_005fgraph_005fmenunode_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fexpanded.reuse(_jspx_th_d_005fgraph_005fmenunode_005f1);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenunode_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005fmenunode_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menunode
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag _jspx_th_d_005fgraph_005fmenunode_005f2 = (com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag.class);
    _jspx_th_d_005fgraph_005fmenunode_005f2.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenunode_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005fmenunode_005f1);
    // /menu.jsp(88,12) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f2.setName("File-New");
    // /menu.jsp(88,12) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f2.setLabel("New 3");
    // /menu.jsp(88,12) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f2.setAction("demo-test.faces");
    int _jspx_eval_d_005fgraph_005fmenunode_005f2 = _jspx_th_d_005fgraph_005fmenunode_005f2.doStartTag();
    if (_jspx_th_d_005fgraph_005fmenunode_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f2);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenunode_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005fmenunode_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menunode
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag _jspx_th_d_005fgraph_005fmenunode_005f3 = (com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag.class);
    _jspx_th_d_005fgraph_005fmenunode_005f3.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenunode_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005fmenunode_005f1);
    // /menu.jsp(89,12) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f3.setName("File-Open");
    // /menu.jsp(89,12) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f3.setLabel("Open 3");
    // /menu.jsp(89,12) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f3.setAction("demo-test.faces");
    int _jspx_eval_d_005fgraph_005fmenunode_005f3 = _jspx_th_d_005fgraph_005fmenunode_005f3.doStartTag();
    if (_jspx_th_d_005fgraph_005fmenunode_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f3);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenunode_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005fmenunode_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menunode
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag _jspx_th_d_005fgraph_005fmenunode_005f4 = (com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fenabled_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag.class);
    _jspx_th_d_005fgraph_005fmenunode_005f4.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenunode_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005fmenunode_005f1);
    // /menu.jsp(90,12) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f4.setName("File-Close");
    // /menu.jsp(90,12) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f4.setLabel("Close 3");
    // /menu.jsp(90,12) name = enabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f4.setEnabled(false);
    int _jspx_eval_d_005fgraph_005fmenunode_005f4 = _jspx_th_d_005fgraph_005fmenunode_005f4.doStartTag();
    if (_jspx_th_d_005fgraph_005fmenunode_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fenabled_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fenabled_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f4);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenunode_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005fmenunode_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menunode
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag _jspx_th_d_005fgraph_005fmenunode_005f5 = (com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag.class);
    _jspx_th_d_005fgraph_005fmenunode_005f5.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenunode_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005fmenunode_005f1);
    // /menu.jsp(91,12) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f5.setName("File-Exit");
    // /menu.jsp(91,12) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f5.setLabel("Exit 3");
    // /menu.jsp(91,12) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f5.setAction("demo-test.faces");
    int _jspx_eval_d_005fgraph_005fmenunode_005f5 = _jspx_th_d_005fgraph_005fmenunode_005f5.doStartTag();
    if (_jspx_th_d_005fgraph_005fmenunode_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f5);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenunode_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005fmenunode_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menunode
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag _jspx_th_d_005fgraph_005fmenunode_005f6 = (com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel.get(com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag.class);
    _jspx_th_d_005fgraph_005fmenunode_005f6.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenunode_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005fmenunode_005f0);
    // /menu.jsp(94,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f6.setName("Edit");
    // /menu.jsp(94,7) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f6.setLabel("Edit 3");
    int _jspx_eval_d_005fgraph_005fmenunode_005f6 = _jspx_th_d_005fgraph_005fmenunode_005f6.doStartTag();
    if (_jspx_eval_d_005fgraph_005fmenunode_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_d_005fgraph_005fmenunode_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_d_005fgraph_005fmenunode_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_d_005fgraph_005fmenunode_005f6.doInitBody();
      }
      do {
        out.write("\n");
        out.write("           ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f7(_jspx_th_d_005fgraph_005fmenunode_005f6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("           ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f8(_jspx_th_d_005fgraph_005fmenunode_005f6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("           ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f9(_jspx_th_d_005fgraph_005fmenunode_005f6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("       ");
        int evalDoAfterBody = _jspx_th_d_005fgraph_005fmenunode_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_d_005fgraph_005fmenunode_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_d_005fgraph_005fmenunode_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel.reuse(_jspx_th_d_005fgraph_005fmenunode_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel.reuse(_jspx_th_d_005fgraph_005fmenunode_005f6);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenunode_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005fmenunode_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menunode
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag _jspx_th_d_005fgraph_005fmenunode_005f7 = (com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag.class);
    _jspx_th_d_005fgraph_005fmenunode_005f7.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenunode_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005fmenunode_005f6);
    // /menu.jsp(95,11) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f7.setName("Edit-Cut");
    // /menu.jsp(95,11) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f7.setLabel("Cut 3");
    // /menu.jsp(95,11) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f7.setAction("demo-test.faces");
    int _jspx_eval_d_005fgraph_005fmenunode_005f7 = _jspx_th_d_005fgraph_005fmenunode_005f7.doStartTag();
    if (_jspx_th_d_005fgraph_005fmenunode_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f7);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenunode_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005fmenunode_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menunode
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag _jspx_th_d_005fgraph_005fmenunode_005f8 = (com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag.class);
    _jspx_th_d_005fgraph_005fmenunode_005f8.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenunode_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005fmenunode_005f6);
    // /menu.jsp(96,11) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f8.setName("Edit-Copy");
    // /menu.jsp(96,11) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f8.setLabel("Copy 3");
    // /menu.jsp(96,11) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f8.setAction("demo-test.faces");
    int _jspx_eval_d_005fgraph_005fmenunode_005f8 = _jspx_th_d_005fgraph_005fmenunode_005f8.doStartTag();
    if (_jspx_th_d_005fgraph_005fmenunode_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f8);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenunode_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005fmenunode_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menunode
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag _jspx_th_d_005fgraph_005fmenunode_005f9 = (com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fenabled_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag.class);
    _jspx_th_d_005fgraph_005fmenunode_005f9.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenunode_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005fmenunode_005f6);
    // /menu.jsp(97,11) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f9.setName("Edit-Paste");
    // /menu.jsp(97,11) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f9.setLabel("Paste 3");
    // /menu.jsp(97,11) name = enabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f9.setEnabled(false);
    int _jspx_eval_d_005fgraph_005fmenunode_005f9 = _jspx_th_d_005fgraph_005fmenunode_005f9.doStartTag();
    if (_jspx_th_d_005fgraph_005fmenunode_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fenabled_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fenabled_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f9);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenutree_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menutree
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuTreeTag _jspx_th_d_005fgraph_005fmenutree_005f0 = new com.sun.javaee.blueprints.components.ui.taglib.GraphMenuTreeTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_d_005fgraph_005fmenutree_005f0);
    _jspx_th_d_005fgraph_005fmenutree_005f0.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenutree_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /menu.jsp(104,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenutree_005f0.setId("menu4");
    // /menu.jsp(104,0) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = com.sun.javaee.blueprints.components.ui.model.Graph methodSignature = null 
    _jspx_th_d_005fgraph_005fmenutree_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/menu.jsp(104,0) '#{GraphBean.treeGraph}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{GraphBean.treeGraph}",com.sun.javaee.blueprints.components.ui.model.Graph.class)));
    // /menu.jsp(104,0) name = styleClass type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fgraph_005fmenutree_005f0.setStyleClass(new org.apache.jasper.el.JspValueExpression("/menu.jsp(104,0) 'tree-control'",_el_expressionfactory.createValueExpression("tree-control",java.lang.String.class)));
    // /menu.jsp(104,0) name = selectedClass type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fgraph_005fmenutree_005f0.setSelectedClass(new org.apache.jasper.el.JspValueExpression("/menu.jsp(104,0) 'tree-control-selected'",_el_expressionfactory.createValueExpression("tree-control-selected",java.lang.String.class)));
    // /menu.jsp(104,0) name = unselectedClass type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fgraph_005fmenutree_005f0.setUnselectedClass(new org.apache.jasper.el.JspValueExpression("/menu.jsp(104,0) 'tree-control-unselected'",_el_expressionfactory.createValueExpression("tree-control-unselected",java.lang.String.class)));
    // /menu.jsp(104,0) name = immediate type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = boolean methodSignature = null 
    _jspx_th_d_005fgraph_005fmenutree_005f0.setImmediate(new org.apache.jasper.el.JspValueExpression("/menu.jsp(104,0) 'true'",_el_expressionfactory.createValueExpression("true",boolean.class)));
    _jspx_th_d_005fgraph_005fmenutree_005f0.setJspId("jsp_1741556418_5");
    int _jspx_eval_d_005fgraph_005fmenutree_005f0 = _jspx_th_d_005fgraph_005fmenutree_005f0.doStartTag();
    if (_jspx_th_d_005fgraph_005fmenutree_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_d_005fgraph_005fmenutree_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005fgraph_005fmenutree_005f0);
      return true;
    }
    _jspx_th_d_005fgraph_005fmenutree_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005fgraph_005fmenutree_005f0);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenutree_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menutree
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuTreeTag _jspx_th_d_005fgraph_005fmenutree_005f1 = new com.sun.javaee.blueprints.components.ui.taglib.GraphMenuTreeTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_d_005fgraph_005fmenutree_005f1);
    _jspx_th_d_005fgraph_005fmenutree_005f1.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenutree_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /menu.jsp(109,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenutree_005f1.setId("menu5");
    // /menu.jsp(109,0) name = selectedClass type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fgraph_005fmenutree_005f1.setSelectedClass(new org.apache.jasper.el.JspValueExpression("/menu.jsp(109,0) 'tree-control-selected'",_el_expressionfactory.createValueExpression("tree-control-selected",java.lang.String.class)));
    // /menu.jsp(109,0) name = unselectedClass type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fgraph_005fmenutree_005f1.setUnselectedClass(new org.apache.jasper.el.JspValueExpression("/menu.jsp(109,0) 'tree-control-unselected'",_el_expressionfactory.createValueExpression("tree-control-unselected",java.lang.String.class)));
    // /menu.jsp(109,0) name = styleClass type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fgraph_005fmenutree_005f1.setStyleClass(new org.apache.jasper.el.JspValueExpression("/menu.jsp(109,0) 'tree-control'",_el_expressionfactory.createValueExpression("tree-control",java.lang.String.class)));
    // /menu.jsp(109,0) name = immediate type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = boolean methodSignature = null 
    _jspx_th_d_005fgraph_005fmenutree_005f1.setImmediate(new org.apache.jasper.el.JspValueExpression("/menu.jsp(109,0) 'true'",_el_expressionfactory.createValueExpression("true",boolean.class)));
    _jspx_th_d_005fgraph_005fmenutree_005f1.setJspId("jsp_1741556418_6");
    int _jspx_eval_d_005fgraph_005fmenutree_005f1 = _jspx_th_d_005fgraph_005fmenutree_005f1.doStartTag();
    if (_jspx_eval_d_005fgraph_005fmenutree_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_d_005fgraph_005fmenutree_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_d_005fgraph_005fmenutree_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_d_005fgraph_005fmenutree_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_d_005fgraph_005ftreenode_005f0(_jspx_th_d_005fgraph_005fmenutree_005f1, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_d_005fgraph_005fmenutree_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_d_005fgraph_005fmenutree_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_d_005fgraph_005fmenutree_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_d_005fgraph_005fmenutree_005f1.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005fgraph_005fmenutree_005f1);
      return true;
    }
    _jspx_th_d_005fgraph_005fmenutree_005f1.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005fgraph_005fmenutree_005f1);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005ftreenode_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005fmenutree_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_treenode
    com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag _jspx_th_d_005fgraph_005ftreenode_005f0 = (com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005fexpanded_005fenabled.get(com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag.class);
    _jspx_th_d_005fgraph_005ftreenode_005f0.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005ftreenode_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005fmenutree_005f1);
    // /menu.jsp(112,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f0.setName("Menu");
    // /menu.jsp(112,4) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f0.setLabel("Menu 5");
    // /menu.jsp(112,4) name = enabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f0.setEnabled(false);
    // /menu.jsp(112,4) name = expanded type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f0.setExpanded(true);
    int _jspx_eval_d_005fgraph_005ftreenode_005f0 = _jspx_th_d_005fgraph_005ftreenode_005f0.doStartTag();
    if (_jspx_eval_d_005fgraph_005ftreenode_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_d_005fgraph_005ftreenode_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_d_005fgraph_005ftreenode_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_d_005fgraph_005ftreenode_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_d_005fgraph_005ftreenode_005f1(_jspx_th_d_005fgraph_005ftreenode_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("       ");
        if (_jspx_meth_d_005fgraph_005ftreenode_005f6(_jspx_th_d_005fgraph_005ftreenode_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        int evalDoAfterBody = _jspx_th_d_005fgraph_005ftreenode_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_d_005fgraph_005ftreenode_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_d_005fgraph_005ftreenode_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005fexpanded_005fenabled.reuse(_jspx_th_d_005fgraph_005ftreenode_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005fexpanded_005fenabled.reuse(_jspx_th_d_005fgraph_005ftreenode_005f0);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005ftreenode_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005ftreenode_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_treenode
    com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag _jspx_th_d_005fgraph_005ftreenode_005f1 = (com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fenabled.get(com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag.class);
    _jspx_th_d_005fgraph_005ftreenode_005f1.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005ftreenode_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005ftreenode_005f0);
    // /menu.jsp(115,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f1.setName("File");
    // /menu.jsp(115,8) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f1.setLabel("File 5");
    // /menu.jsp(115,8) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f1.setIcon("folder_16_pad.gif");
    // /menu.jsp(115,8) name = enabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f1.setEnabled(false);
    int _jspx_eval_d_005fgraph_005ftreenode_005f1 = _jspx_th_d_005fgraph_005ftreenode_005f1.doStartTag();
    if (_jspx_eval_d_005fgraph_005ftreenode_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_d_005fgraph_005ftreenode_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_d_005fgraph_005ftreenode_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_d_005fgraph_005ftreenode_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_d_005fgraph_005ftreenode_005f2(_jspx_th_d_005fgraph_005ftreenode_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_d_005fgraph_005ftreenode_005f3(_jspx_th_d_005fgraph_005ftreenode_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_d_005fgraph_005ftreenode_005f4(_jspx_th_d_005fgraph_005ftreenode_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_d_005fgraph_005ftreenode_005f5(_jspx_th_d_005fgraph_005ftreenode_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("       ");
        int evalDoAfterBody = _jspx_th_d_005fgraph_005ftreenode_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_d_005fgraph_005ftreenode_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_d_005fgraph_005ftreenode_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fenabled.reuse(_jspx_th_d_005fgraph_005ftreenode_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fenabled.reuse(_jspx_th_d_005fgraph_005ftreenode_005f1);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005ftreenode_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005ftreenode_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_treenode
    com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag _jspx_th_d_005fgraph_005ftreenode_005f2 = (com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag.class);
    _jspx_th_d_005fgraph_005ftreenode_005f2.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005ftreenode_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005ftreenode_005f1);
    // /menu.jsp(118,12) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f2.setName("File-New");
    // /menu.jsp(118,12) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f2.setLabel("New 5");
    // /menu.jsp(118,12) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f2.setIcon("folder_16_pad.gif");
    // /menu.jsp(118,12) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f2.setAction("demo-test.faces");
    int _jspx_eval_d_005fgraph_005ftreenode_005f2 = _jspx_th_d_005fgraph_005ftreenode_005f2.doStartTag();
    if (_jspx_th_d_005fgraph_005ftreenode_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005ftreenode_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005ftreenode_005f2);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005ftreenode_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005ftreenode_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_treenode
    com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag _jspx_th_d_005fgraph_005ftreenode_005f3 = (com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag.class);
    _jspx_th_d_005fgraph_005ftreenode_005f3.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005ftreenode_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005ftreenode_005f1);
    // /menu.jsp(120,12) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f3.setName("File-Open");
    // /menu.jsp(120,12) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f3.setLabel("Open 5");
    // /menu.jsp(120,12) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f3.setIcon("folder_16_pad.gif");
    // /menu.jsp(120,12) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f3.setAction("/demo-test.faces");
    int _jspx_eval_d_005fgraph_005ftreenode_005f3 = _jspx_th_d_005fgraph_005ftreenode_005f3.doStartTag();
    if (_jspx_th_d_005fgraph_005ftreenode_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005ftreenode_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005ftreenode_005f3);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005ftreenode_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005ftreenode_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_treenode
    com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag _jspx_th_d_005fgraph_005ftreenode_005f4 = (com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fenabled_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag.class);
    _jspx_th_d_005fgraph_005ftreenode_005f4.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005ftreenode_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005ftreenode_005f1);
    // /menu.jsp(122,12) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f4.setName("File-Close");
    // /menu.jsp(122,12) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f4.setLabel("Close 5");
    // /menu.jsp(122,12) name = enabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f4.setEnabled(false);
    // /menu.jsp(122,12) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f4.setIcon("folder_16_pad.gif");
    int _jspx_eval_d_005fgraph_005ftreenode_005f4 = _jspx_th_d_005fgraph_005ftreenode_005f4.doStartTag();
    if (_jspx_th_d_005fgraph_005ftreenode_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fenabled_005fnobody.reuse(_jspx_th_d_005fgraph_005ftreenode_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fenabled_005fnobody.reuse(_jspx_th_d_005fgraph_005ftreenode_005f4);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005ftreenode_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005ftreenode_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_treenode
    com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag _jspx_th_d_005fgraph_005ftreenode_005f5 = (com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag.class);
    _jspx_th_d_005fgraph_005ftreenode_005f5.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005ftreenode_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005ftreenode_005f1);
    // /menu.jsp(124,12) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f5.setName("File-Exit");
    // /menu.jsp(124,12) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f5.setLabel("Exit 5");
    // /menu.jsp(124,12) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f5.setIcon("folder_16_pad.gif");
    // /menu.jsp(124,12) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f5.setAction("demo-test.faces");
    int _jspx_eval_d_005fgraph_005ftreenode_005f5 = _jspx_th_d_005fgraph_005ftreenode_005f5.doStartTag();
    if (_jspx_th_d_005fgraph_005ftreenode_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005ftreenode_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005ftreenode_005f5);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005ftreenode_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005ftreenode_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_treenode
    com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag _jspx_th_d_005fgraph_005ftreenode_005f6 = (com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fexpanded_005fenabled.get(com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag.class);
    _jspx_th_d_005fgraph_005ftreenode_005f6.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005ftreenode_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005ftreenode_005f0);
    // /menu.jsp(128,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f6.setName("Edit");
    // /menu.jsp(128,7) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f6.setLabel("Edit 5");
    // /menu.jsp(128,7) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f6.setIcon("folder_16_pad.gif");
    // /menu.jsp(128,7) name = expanded type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f6.setExpanded(true);
    // /menu.jsp(128,7) name = enabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f6.setEnabled(false);
    int _jspx_eval_d_005fgraph_005ftreenode_005f6 = _jspx_th_d_005fgraph_005ftreenode_005f6.doStartTag();
    if (_jspx_eval_d_005fgraph_005ftreenode_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_d_005fgraph_005ftreenode_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_d_005fgraph_005ftreenode_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_d_005fgraph_005ftreenode_005f6.doInitBody();
      }
      do {
        out.write(" \n");
        out.write("\n");
        out.write("           ");
        if (_jspx_meth_d_005fgraph_005ftreenode_005f7(_jspx_th_d_005fgraph_005ftreenode_005f6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("           ");
        if (_jspx_meth_d_005fgraph_005ftreenode_005f8(_jspx_th_d_005fgraph_005ftreenode_005f6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("           ");
        if (_jspx_meth_d_005fgraph_005ftreenode_005f9(_jspx_th_d_005fgraph_005ftreenode_005f6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("       ");
        int evalDoAfterBody = _jspx_th_d_005fgraph_005ftreenode_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_d_005fgraph_005ftreenode_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_d_005fgraph_005ftreenode_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fexpanded_005fenabled.reuse(_jspx_th_d_005fgraph_005ftreenode_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fexpanded_005fenabled.reuse(_jspx_th_d_005fgraph_005ftreenode_005f6);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005ftreenode_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005ftreenode_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_treenode
    com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag _jspx_th_d_005fgraph_005ftreenode_005f7 = (com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag.class);
    _jspx_th_d_005fgraph_005ftreenode_005f7.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005ftreenode_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005ftreenode_005f6);
    // /menu.jsp(131,11) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f7.setName("Edit-Cut");
    // /menu.jsp(131,11) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f7.setLabel("Cut 5");
    // /menu.jsp(131,11) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f7.setIcon("folder_16_pad.gif");
    // /menu.jsp(131,11) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f7.setAction("demo-test.faces");
    int _jspx_eval_d_005fgraph_005ftreenode_005f7 = _jspx_th_d_005fgraph_005ftreenode_005f7.doStartTag();
    if (_jspx_th_d_005fgraph_005ftreenode_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005ftreenode_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005ftreenode_005f7);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005ftreenode_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005ftreenode_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_treenode
    com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag _jspx_th_d_005fgraph_005ftreenode_005f8 = (com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag.class);
    _jspx_th_d_005fgraph_005ftreenode_005f8.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005ftreenode_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005ftreenode_005f6);
    // /menu.jsp(133,11) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f8.setName("Edit-Copy");
    // /menu.jsp(133,11) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f8.setLabel("Copy 5");
    // /menu.jsp(133,11) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f8.setIcon("folder_16_pad.gif");
    // /menu.jsp(133,11) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f8.setAction("demo-test.faces");
    int _jspx_eval_d_005fgraph_005ftreenode_005f8 = _jspx_th_d_005fgraph_005ftreenode_005f8.doStartTag();
    if (_jspx_th_d_005fgraph_005ftreenode_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005ftreenode_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005ftreenode_005f8);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005ftreenode_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005ftreenode_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_treenode
    com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag _jspx_th_d_005fgraph_005ftreenode_005f9 = (com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fenabled_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphTreeNodeTag.class);
    _jspx_th_d_005fgraph_005ftreenode_005f9.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005ftreenode_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005ftreenode_005f6);
    // /menu.jsp(135,11) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f9.setName("Edit-Paste");
    // /menu.jsp(135,11) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f9.setLabel("Paste 5");
    // /menu.jsp(135,11) name = enabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f9.setEnabled(false);
    // /menu.jsp(135,11) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005ftreenode_005f9.setIcon("folder_16_pad.gif");
    int _jspx_eval_d_005fgraph_005ftreenode_005f9 = _jspx_th_d_005fgraph_005ftreenode_005f9.doStartTag();
    if (_jspx_th_d_005fgraph_005ftreenode_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fenabled_005fnobody.reuse(_jspx_th_d_005fgraph_005ftreenode_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005ftreenode_0026_005fname_005flabel_005ficon_005fenabled_005fnobody.reuse(_jspx_th_d_005fgraph_005ftreenode_005f9);
    return false;
  }
}
