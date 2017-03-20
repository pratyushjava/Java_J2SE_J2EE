package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class imagemap_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ff_005fview;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ff_005floadBundle_0026_005fvar_005fbasename_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fform;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005foutputText_0026_005fvalue_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fgraphicImage_0026_005fusemap_005furl_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005fmap_0026_005fimmediate_005fid_005fcurrent_005factionListener;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fd_005farea_0026_005fvalue_005ftargetImage_005fonmouseover_005fonmouseout_005fid_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ff_005fview = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ff_005floadBundle_0026_005fvar_005fbasename_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fform = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005foutputText_0026_005fvalue_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fgraphicImage_0026_005fusemap_005furl_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005fmap_0026_005fimmediate_005fid_005fcurrent_005factionListener = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fd_005farea_0026_005fvalue_005ftargetImage_005fonmouseover_005fonmouseout_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ff_005fview.release();
    _005fjspx_005ftagPool_005ff_005floadBundle_0026_005fvar_005fbasename_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fform.release();
    _005fjspx_005ftagPool_005fh_005foutputText_0026_005fvalue_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fgraphicImage_0026_005fusemap_005furl_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fd_005fmap_0026_005fimmediate_005fid_005fcurrent_005factionListener.release();
    _005fjspx_005ftagPool_005fd_005farea_0026_005fvalue_005ftargetImage_005fonmouseover_005fonmouseout_005fid_005fnobody.release();
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
      _jspx_th_f_005fview_005f0.setJspId("jsp_356446496_0");
      int _jspx_eval_f_005fview_005f0 = _jspx_th_f_005fview_005f0.doStartTag();
      if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_f_005fview_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_f_005fview_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\n");
          out.write("<html>\n");
          out.write("<head>\n");
          out.write("<title>Welcome to JavaServer Faces</title>\n");
          out.write("</head>\n");
          out.write("<body>\n");
          out.write("\n");
          out.write("  ");
          if (_jspx_meth_f_005floadBundle_005f0(_jspx_th_f_005fview_005f0, _jspx_page_context))
            return;
          out.write('\n');
          out.write(' ');
          out.write(' ');
          //  h:form
          com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_005fform_005f0 = new com.sun.faces.taglib.html_basic.FormTag();
          org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005fform_005f0);
          _jspx_th_h_005fform_005f0.setPageContext(_jspx_page_context);
          _jspx_th_h_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_005fview_005f0);
          _jspx_th_h_005fform_005f0.setJspId("jsp_356446496_1");
          int _jspx_eval_h_005fform_005f0 = _jspx_th_h_005fform_005f0.doStartTag();
          if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_h_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_h_005fform_005f0.doInitBody();
            }
            do {
              out.write("\n");
              out.write("  <table>\n");
              out.write("\n");
              out.write("    <tr><td>\n");
              out.write("      ");
              if (_jspx_meth_h_005foutputText_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("    </td></tr>\n");
              out.write("\n");
              out.write("    <tr><td>\n");
              out.write("\n");
              out.write("      ");
              if (_jspx_meth_h_005fgraphicImage_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\n");
              out.write("      ");
              if (_jspx_meth_d_005fmap_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\n");
              out.write("    </td></tr>\n");
              out.write("\n");
              out.write("  </table>\n");
              out.write("\n");
              out.write("<hr>\n");
              out.write("\n");
              out.write("\n");
              out.write("<a href='");
              out.print( request.getContextPath() + "/index.jsp" );
              out.write("'>Back</a> to home page.\n");
              out.write("\n");
              out.write("<h1>How to Use this Component</h1>\n");
              out.write("\n");
              out.write("<p>This component renders a clickable image map of the world and regions\n");
              out.write("can be selected to change the locale.</p>\n");
              out.write("\n");
              out.write("<p>You can mouse over and click on some parts of the world that speak\n");
              out.write("U.S. English, French, German, Finnish, and Latin American Spanish.  This\n");
              out.write("will cause the appropriate Locale to be set into the application,\n");
              out.write("causing the proper ResourceBundle lookup.</p>\n");
              out.write("\n");
              out.write("<h1>Custom Tags / Components</h1>\n");
              out.write("\n");
              out.write("<p>The <code>MapComponent</code> component is driven by the <code>map</code>\n");
              out.write("tag, and it keeps track of the the selected area on the map.  It determines\n");
              out.write("the selected area from the incoming request, and fires an\n");
              out.write("<code>AreaSelectedEvent</code> whenever the selected area is changed.  <code>AreaSelectedEvent</code>\n");
              out.write("is an <code>ActionEvent</code>.  A method binding reference expression tag attribute is \n");
              out.write("used to reference a method in the backing file bean (imagemap), and that \n");
              out.write("method listens for action events.  The listener method <code>processAreaSelected</code>,\n");
              out.write("receives the <code>ActionEvent</code> and sets the locale accordingly.\n");
              out.write("\n");
              out.write("<p>The <code>AreaComponent</code> component is driven by the <code>area</code>\n");
              out.write("tag. It uses Javascript events to visually show the selected area, and it sends\n");
              out.write("the identifier of the selected area as part of the request.  This tag must be\n");
              out.write("nested within an <code>&lt;d:map&gt;</code> tag.</p>\n");
              out.write("\n");
              out.write("<h2>JSP Attributes</h2>\n");
              out.write("\n");
              out.write("<p>Attributes described below apply to map tag.\n");
              out.write("Attributes can represent values directly or point to them via value binding\n");
              out.write("expressions except for actionListener attribute that points to a\n");
              out.write("method reference. \n");
              out.write("\n");
              out.write("<table border=\"1\">\n");
              out.write("\n");
              out.write("<tr>\n");
              out.write("<th>JSP Attribute Name</th>\n");
              out.write("<th>What it Does</th>\n");
              out.write("</tr>\n");
              out.write("\n");
              out.write("<tr>\n");
              out.write("<td><code>actionListener</code></td>\n");
              out.write("<td>Method binding reference that refers to a method that sets the locale\n");
              out.write("    from information contained in the <code>AreaSelectedEvent</code>.\n");
              out.write("</td>\n");
              out.write("</tr>\n");
              out.write("\n");
              out.write("<tr>\n");
              out.write("<td><code>immediate</code>\n");
              out.write("</td>\n");
              out.write("<td>A flag indicating that the default ActionListener should execute\n");
              out.write("      immediately (that is, during the Apply Request Values phase of the\n");
              out.write("      request processing lifecycle, instead of waiting for Invoke\n");
              out.write("      Application phase). The default value of this property must be false.\n");
              out.write("</td>\n");
              out.write("</tr>\n");
              out.write("\n");
              out.write("<tr>\n");
              out.write("<td><code>current</code></td>\n");
              out.write("<td>This refers to the current selected area on the map.\n");
              out.write("</td>\n");
              out.write("</tr>\n");
              out.write("\n");
              out.write("</table>\n");
              out.write("\n");
              out.write("<hr>\n");
              out.write("\n");
              out.write("</body>\n");
              out.write("</html>\n");
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
            return;
          }
          _jspx_th_h_005fform_005f0.release();
          org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fform_005f0);
          out.write('\n');
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

  private boolean _jspx_meth_f_005floadBundle_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_005fview_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:loadBundle
    com.sun.faces.taglib.jsf_core.LoadBundleTag _jspx_th_f_005floadBundle_005f0 = (com.sun.faces.taglib.jsf_core.LoadBundleTag) _005fjspx_005ftagPool_005ff_005floadBundle_0026_005fvar_005fbasename_005fnobody.get(com.sun.faces.taglib.jsf_core.LoadBundleTag.class);
    _jspx_th_f_005floadBundle_005f0.setPageContext(_jspx_page_context);
    _jspx_th_f_005floadBundle_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_005fview_005f0);
    // /imagemap.jsp(74,2) name = basename type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_f_005floadBundle_005f0.setBasename(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(74,2) 'demo.model.Resources'",_el_expressionfactory.createValueExpression("demo.model.Resources",java.lang.String.class)));
    // /imagemap.jsp(74,2) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_f_005floadBundle_005f0.setVar("mapBundle");
    int _jspx_eval_f_005floadBundle_005f0 = _jspx_th_f_005floadBundle_005f0.doStartTag();
    if (_jspx_th_f_005floadBundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ff_005floadBundle_0026_005fvar_005fbasename_005fnobody.reuse(_jspx_th_f_005floadBundle_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ff_005floadBundle_0026_005fvar_005fbasename_005fnobody.reuse(_jspx_th_f_005floadBundle_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005foutputText_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_005foutputText_005f0 = new com.sun.faces.taglib.html_basic.OutputTextTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005foutputText_005f0);
    _jspx_th_h_005foutputText_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005foutputText_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /imagemap.jsp(79,6) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005foutputText_005f0.setId("welcomeLabel");
    // /imagemap.jsp(79,6) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005foutputText_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(79,6) '#{mapBundle.welcomeLabel}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{mapBundle.welcomeLabel}",java.lang.Object.class)));
    _jspx_th_h_005foutputText_005f0.setJspId("jsp_356446496_2");
    int _jspx_eval_h_005foutputText_005f0 = _jspx_th_h_005foutputText_005f0.doStartTag();
    if (_jspx_th_h_005foutputText_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005foutputText_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputText_005f0);
      return true;
    }
    _jspx_th_h_005foutputText_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputText_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005fgraphicImage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:graphicImage
    com.sun.faces.taglib.html_basic.GraphicImageTag _jspx_th_h_005fgraphicImage_005f0 = new com.sun.faces.taglib.html_basic.GraphicImageTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005fgraphicImage_005f0);
    _jspx_th_h_005fgraphicImage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fgraphicImage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /imagemap.jsp(85,6) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fgraphicImage_005f0.setId("mapImage");
    // /imagemap.jsp(85,6) name = url type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005fgraphicImage_005f0.setUrl(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(85,6) '/images/world.gif'",_el_expressionfactory.createValueExpression("/images/world.gif",java.lang.String.class)));
    // /imagemap.jsp(85,6) name = usemap type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005fgraphicImage_005f0.setUsemap(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(85,6) '#worldMap'",_el_expressionfactory.createValueExpression("#worldMap",java.lang.String.class)));
    _jspx_th_h_005fgraphicImage_005f0.setJspId("jsp_356446496_3");
    int _jspx_eval_h_005fgraphicImage_005f0 = _jspx_th_h_005fgraphicImage_005f0.doStartTag();
    if (_jspx_th_h_005fgraphicImage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fgraphicImage_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fgraphicImage_005f0);
      return true;
    }
    _jspx_th_h_005fgraphicImage_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fgraphicImage_005f0);
    return false;
  }

  private boolean _jspx_meth_d_005fmap_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:map
    com.sun.javaee.blueprints.components.ui.taglib.MapTag _jspx_th_d_005fmap_005f0 = new com.sun.javaee.blueprints.components.ui.taglib.MapTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_d_005fmap_005f0);
    _jspx_th_d_005fmap_005f0.setPageContext(_jspx_page_context);
    _jspx_th_d_005fmap_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /imagemap.jsp(89,6) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fmap_005f0.setId("worldMap");
    // /imagemap.jsp(89,6) name = actionListener type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = true expectedTypeName = null methodSignature = void actionListener(javax.faces.event.ActionEvent) 
    _jspx_th_d_005fmap_005f0.setActionListener(new org.apache.jasper.el.JspMethodExpression("/imagemap.jsp(89,6) '#{imageMap.processAreaSelected}'",_el_expressionfactory.createMethodExpression(_jspx_page_context.getELContext(),"#{imageMap.processAreaSelected}",Void.TYPE,new Class[] {javax.faces.event.ActionEvent.class})));
    // /imagemap.jsp(89,6) name = immediate type = java.lang.String reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = boolean methodSignature = null 
    _jspx_th_d_005fmap_005f0.setImmediate(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(89,6) 'true'",_el_expressionfactory.createValueExpression("true",boolean.class)));
    // /imagemap.jsp(89,6) name = current type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fmap_005f0.setCurrent(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(89,6) 'NAmericas'",_el_expressionfactory.createValueExpression("NAmericas",java.lang.String.class)));
    _jspx_th_d_005fmap_005f0.setJspId("jsp_356446496_4");
    int _jspx_eval_d_005fmap_005f0 = _jspx_th_d_005fmap_005f0.doStartTag();
    if (_jspx_eval_d_005fmap_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_d_005fmap_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_d_005fmap_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_d_005fmap_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_d_005farea_005f0(_jspx_th_d_005fmap_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_d_005farea_005f1(_jspx_th_d_005fmap_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_d_005farea_005f2(_jspx_th_d_005fmap_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_d_005farea_005f3(_jspx_th_d_005fmap_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_d_005farea_005f4(_jspx_th_d_005fmap_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_d_005fmap_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_d_005fmap_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_d_005fmap_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_d_005fmap_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005fmap_005f0);
      return true;
    }
    _jspx_th_d_005fmap_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005fmap_005f0);
    return false;
  }

  private boolean _jspx_meth_d_005farea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fmap_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:area
    com.sun.javaee.blueprints.components.ui.taglib.AreaTag _jspx_th_d_005farea_005f0 = new com.sun.javaee.blueprints.components.ui.taglib.AreaTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_d_005farea_005f0);
    _jspx_th_d_005farea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_d_005farea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fmap_005f0);
    // /imagemap.jsp(94,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005farea_005f0.setId("NAmericas");
    // /imagemap.jsp(94,8) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_d_005farea_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(94,8) '#{NA}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{NA}",java.lang.Object.class)));
    // /imagemap.jsp(94,8) name = onmouseover type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005farea_005f0.setOnmouseover(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(94,8) '/images/world_namer.gif'",_el_expressionfactory.createValueExpression("/images/world_namer.gif",java.lang.String.class)));
    // /imagemap.jsp(94,8) name = onmouseout type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005farea_005f0.setOnmouseout(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(94,8) '/images/world.gif'",_el_expressionfactory.createValueExpression("/images/world.gif",java.lang.String.class)));
    // /imagemap.jsp(94,8) name = targetImage type = javax.el.ValueExpression reqTime = false required = true fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005farea_005f0.setTargetImage(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(94,8) 'mapImage'",_el_expressionfactory.createValueExpression("mapImage",java.lang.String.class)));
    _jspx_th_d_005farea_005f0.setJspId("jsp_356446496_5");
    int _jspx_eval_d_005farea_005f0 = _jspx_th_d_005farea_005f0.doStartTag();
    if (_jspx_th_d_005farea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_d_005farea_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005farea_005f0);
      return true;
    }
    _jspx_th_d_005farea_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005farea_005f0);
    return false;
  }

  private boolean _jspx_meth_d_005farea_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fmap_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:area
    com.sun.javaee.blueprints.components.ui.taglib.AreaTag _jspx_th_d_005farea_005f1 = new com.sun.javaee.blueprints.components.ui.taglib.AreaTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_d_005farea_005f1);
    _jspx_th_d_005farea_005f1.setPageContext(_jspx_page_context);
    _jspx_th_d_005farea_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fmap_005f0);
    // /imagemap.jsp(100,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005farea_005f1.setId("SAmericas");
    // /imagemap.jsp(100,8) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_d_005farea_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(100,8) '#{SA}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{SA}",java.lang.Object.class)));
    // /imagemap.jsp(100,8) name = onmouseover type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005farea_005f1.setOnmouseover(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(100,8) '/images/world_samer.gif'",_el_expressionfactory.createValueExpression("/images/world_samer.gif",java.lang.String.class)));
    // /imagemap.jsp(100,8) name = onmouseout type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005farea_005f1.setOnmouseout(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(100,8) '/images/world.gif'",_el_expressionfactory.createValueExpression("/images/world.gif",java.lang.String.class)));
    // /imagemap.jsp(100,8) name = targetImage type = javax.el.ValueExpression reqTime = false required = true fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005farea_005f1.setTargetImage(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(100,8) 'mapImage'",_el_expressionfactory.createValueExpression("mapImage",java.lang.String.class)));
    _jspx_th_d_005farea_005f1.setJspId("jsp_356446496_6");
    int _jspx_eval_d_005farea_005f1 = _jspx_th_d_005farea_005f1.doStartTag();
    if (_jspx_th_d_005farea_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_d_005farea_005f1.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005farea_005f1);
      return true;
    }
    _jspx_th_d_005farea_005f1.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005farea_005f1);
    return false;
  }

  private boolean _jspx_meth_d_005farea_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fmap_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:area
    com.sun.javaee.blueprints.components.ui.taglib.AreaTag _jspx_th_d_005farea_005f2 = new com.sun.javaee.blueprints.components.ui.taglib.AreaTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_d_005farea_005f2);
    _jspx_th_d_005farea_005f2.setPageContext(_jspx_page_context);
    _jspx_th_d_005farea_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fmap_005f0);
    // /imagemap.jsp(106,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005farea_005f2.setId("Finland");
    // /imagemap.jsp(106,8) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_d_005farea_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(106,8) '#{finA}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{finA}",java.lang.Object.class)));
    // /imagemap.jsp(106,8) name = onmouseover type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005farea_005f2.setOnmouseover(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(106,8) '/images/world_finland.gif'",_el_expressionfactory.createValueExpression("/images/world_finland.gif",java.lang.String.class)));
    // /imagemap.jsp(106,8) name = onmouseout type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005farea_005f2.setOnmouseout(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(106,8) '/images/world.gif'",_el_expressionfactory.createValueExpression("/images/world.gif",java.lang.String.class)));
    // /imagemap.jsp(106,8) name = targetImage type = javax.el.ValueExpression reqTime = false required = true fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005farea_005f2.setTargetImage(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(106,8) 'mapImage'",_el_expressionfactory.createValueExpression("mapImage",java.lang.String.class)));
    _jspx_th_d_005farea_005f2.setJspId("jsp_356446496_7");
    int _jspx_eval_d_005farea_005f2 = _jspx_th_d_005farea_005f2.doStartTag();
    if (_jspx_th_d_005farea_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_d_005farea_005f2.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005farea_005f2);
      return true;
    }
    _jspx_th_d_005farea_005f2.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005farea_005f2);
    return false;
  }

  private boolean _jspx_meth_d_005farea_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fmap_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:area
    com.sun.javaee.blueprints.components.ui.taglib.AreaTag _jspx_th_d_005farea_005f3 = new com.sun.javaee.blueprints.components.ui.taglib.AreaTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_d_005farea_005f3);
    _jspx_th_d_005farea_005f3.setPageContext(_jspx_page_context);
    _jspx_th_d_005farea_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fmap_005f0);
    // /imagemap.jsp(112,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005farea_005f3.setId("Germany");
    // /imagemap.jsp(112,8) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_d_005farea_005f3.setValue(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(112,8) '#{gerA}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{gerA}",java.lang.Object.class)));
    // /imagemap.jsp(112,8) name = onmouseover type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005farea_005f3.setOnmouseover(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(112,8) '/images/world_germany.gif'",_el_expressionfactory.createValueExpression("/images/world_germany.gif",java.lang.String.class)));
    // /imagemap.jsp(112,8) name = onmouseout type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005farea_005f3.setOnmouseout(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(112,8) '/images/world.gif'",_el_expressionfactory.createValueExpression("/images/world.gif",java.lang.String.class)));
    // /imagemap.jsp(112,8) name = targetImage type = javax.el.ValueExpression reqTime = false required = true fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005farea_005f3.setTargetImage(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(112,8) 'mapImage'",_el_expressionfactory.createValueExpression("mapImage",java.lang.String.class)));
    _jspx_th_d_005farea_005f3.setJspId("jsp_356446496_8");
    int _jspx_eval_d_005farea_005f3 = _jspx_th_d_005farea_005f3.doStartTag();
    if (_jspx_th_d_005farea_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_d_005farea_005f3.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005farea_005f3);
      return true;
    }
    _jspx_th_d_005farea_005f3.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005farea_005f3);
    return false;
  }

  private boolean _jspx_meth_d_005farea_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fmap_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:area
    com.sun.javaee.blueprints.components.ui.taglib.AreaTag _jspx_th_d_005farea_005f4 = new com.sun.javaee.blueprints.components.ui.taglib.AreaTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_d_005farea_005f4);
    _jspx_th_d_005farea_005f4.setPageContext(_jspx_page_context);
    _jspx_th_d_005farea_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fmap_005f0);
    // /imagemap.jsp(118,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005farea_005f4.setId("France");
    // /imagemap.jsp(118,8) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_d_005farea_005f4.setValue(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(118,8) '#{fraA}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{fraA}",java.lang.Object.class)));
    // /imagemap.jsp(118,8) name = onmouseover type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005farea_005f4.setOnmouseover(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(118,8) '/images/world_france.gif'",_el_expressionfactory.createValueExpression("/images/world_france.gif",java.lang.String.class)));
    // /imagemap.jsp(118,8) name = onmouseout type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005farea_005f4.setOnmouseout(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(118,8) '/images/world.gif'",_el_expressionfactory.createValueExpression("/images/world.gif",java.lang.String.class)));
    // /imagemap.jsp(118,8) name = targetImage type = javax.el.ValueExpression reqTime = false required = true fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005farea_005f4.setTargetImage(new org.apache.jasper.el.JspValueExpression("/imagemap.jsp(118,8) 'mapImage'",_el_expressionfactory.createValueExpression("mapImage",java.lang.String.class)));
    _jspx_th_d_005farea_005f4.setJspId("jsp_356446496_9");
    int _jspx_eval_d_005farea_005f4 = _jspx_th_d_005farea_005f4.doStartTag();
    if (_jspx_th_d_005farea_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_d_005farea_005f4.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005farea_005f4);
      return true;
    }
    _jspx_th_d_005farea_005f4.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_d_005farea_005f4);
    return false;
  }
}
