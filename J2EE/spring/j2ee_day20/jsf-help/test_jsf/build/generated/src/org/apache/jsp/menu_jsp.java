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
      out.write("\n");
      out.write("\n");
      //  f:view
      com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_005fview_005f0 = new com.sun.faces.taglib.jsf_core.ViewTag();
      org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_f_005fview_005f0);
      _jspx_th_f_005fview_005f0.setPageContext(_jspx_page_context);
      _jspx_th_f_005fview_005f0.setParent(null);
      _jspx_th_f_005fview_005f0.setJspId("jsp_1950301448_0");
      int _jspx_eval_f_005fview_005f0 = _jspx_th_f_005fview_005f0.doStartTag();
      if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_f_005fview_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_f_005fview_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    <html>\n");
          out.write("        <head>\n");
          out.write("            <title>Demonstration Components - Menu</title>\n");
          out.write("        </head>\n");
          out.write("        <body bgcolor=\"white\">\n");
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_h_005fform_005f0(_jspx_th_f_005fview_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            <a href='");
          out.print( request.getContextPath() + "/index.faces");
          out.write("'>Back</a> to home page.\n");
          out.write("            <a href='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/index.faces'>Back123</a> to home page.\n");
          out.write("\n");
          out.write("        </body>\n");
          out.write("    </html>\n");
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
    _jspx_th_h_005fform_005f0.setJspId("jsp_1950301448_1");
    int _jspx_eval_h_005fform_005f0 = _jspx_th_h_005fform_005f0.doStartTag();
    if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_005fform_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_d_005fstylesheet_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                Render graph as a menu bar (graph retrieved from model):<br>\n");
        out.write("                ");
        if (_jspx_meth_d_005fgraph_005fmenubar_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                <hr>\n");
        out.write("\n");
        out.write("                  Render graph as a menu bar (graph specified via JSP):<br>\n");
        out.write("                ");
        if (_jspx_meth_d_005fgraph_005fmenubar_005f1(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                <hr>\n");
        out.write("                ");
        out.write("\n");
        out.write("            ");
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
    // /menu.jsp(14,16) name = path type = javax.el.ValueExpression reqTime = false required = true fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fstylesheet_005f0.setPath(new org.apache.jasper.el.JspValueExpression("/menu.jsp(14,16) '/tree-control-test.css'",_el_expressionfactory.createValueExpression("/tree-control-test.css",java.lang.String.class)));
    _jspx_th_d_005fstylesheet_005f0.setJspId("jsp_1950301448_2");
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
    // /menu.jsp(17,16) name = id type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f0.setId("menu2");
    // /menu.jsp(17,16) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = com.sun.javaee.blueprints.components.ui.model.Graph methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/menu.jsp(17,16) '#{GraphBean.menuGraph}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{GraphBean.menuGraph}",com.sun.javaee.blueprints.components.ui.model.Graph.class)));
    // /menu.jsp(17,16) name = selectedClass type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f0.setSelectedClass(new org.apache.jasper.el.JspValueExpression("/menu.jsp(17,16) 'tree-control-selected'",_el_expressionfactory.createValueExpression("tree-control-selected",java.lang.String.class)));
    // /menu.jsp(17,16) name = unselectedClass type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f0.setUnselectedClass(new org.apache.jasper.el.JspValueExpression("/menu.jsp(17,16) 'tree-control-unselected'",_el_expressionfactory.createValueExpression("tree-control-unselected",java.lang.String.class)));
    // /menu.jsp(17,16) name = immediate type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = boolean methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f0.setImmediate(new org.apache.jasper.el.JspValueExpression("/menu.jsp(17,16) 'true'",_el_expressionfactory.createValueExpression("true",boolean.class)));
    _jspx_th_d_005fgraph_005fmenubar_005f0.setJspId("jsp_1950301448_3");
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
    // /menu.jsp(24,16) name = id type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f1.setId("menu3");
    // /menu.jsp(24,16) name = selectedClass type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f1.setSelectedClass(new org.apache.jasper.el.JspValueExpression("/menu.jsp(24,16) 'tree-control-selected'",_el_expressionfactory.createValueExpression("tree-control-selected",java.lang.String.class)));
    // /menu.jsp(24,16) name = unselectedClass type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f1.setUnselectedClass(new org.apache.jasper.el.JspValueExpression("/menu.jsp(24,16) 'tree-control-unselected'",_el_expressionfactory.createValueExpression("tree-control-unselected",java.lang.String.class)));
    // /menu.jsp(24,16) name = immediate type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = boolean methodSignature = null 
    _jspx_th_d_005fgraph_005fmenubar_005f1.setImmediate(new org.apache.jasper.el.JspValueExpression("/menu.jsp(24,16) 'true'",_el_expressionfactory.createValueExpression("true",boolean.class)));
    _jspx_th_d_005fgraph_005fmenubar_005f1.setJspId("jsp_1950301448_4");
    int _jspx_eval_d_005fgraph_005fmenubar_005f1 = _jspx_th_d_005fgraph_005fmenubar_005f1.doStartTag();
    if (_jspx_eval_d_005fgraph_005fmenubar_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_d_005fgraph_005fmenubar_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_d_005fgraph_005fmenubar_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_d_005fgraph_005fmenubar_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f0(_jspx_th_d_005fgraph_005fmenubar_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
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
    // /menu.jsp(26,20) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f0.setName("Menu");
    // /menu.jsp(26,20) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f1(_jspx_th_d_005fgraph_005fmenunode_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f6(_jspx_th_d_005fgraph_005fmenunode_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f10(_jspx_th_d_005fgraph_005fmenunode_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                    ");
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
    // /menu.jsp(28,24) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f1.setName("File");
    // /menu.jsp(28,24) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f1.setLabel("File 3");
    // /menu.jsp(28,24) name = expanded type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
        out.write("                            ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f2(_jspx_th_d_005fgraph_005fmenunode_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f3(_jspx_th_d_005fgraph_005fmenunode_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f4(_jspx_th_d_005fgraph_005fmenunode_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f5(_jspx_th_d_005fgraph_005fmenunode_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
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
    // /menu.jsp(29,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f2.setName("File-New");
    // /menu.jsp(29,28) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f2.setLabel("New 3");
    // /menu.jsp(29,28) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f2.setAction("/faces/demo-test.jsp");
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
    // /menu.jsp(30,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f3.setName("File-Open");
    // /menu.jsp(30,28) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f3.setLabel("Open 3");
    // /menu.jsp(30,28) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /menu.jsp(31,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f4.setName("File-Close");
    // /menu.jsp(31,28) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f4.setLabel("Close 3");
    // /menu.jsp(31,28) name = enabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /menu.jsp(32,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f5.setName("File-Exit");
    // /menu.jsp(32,28) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f5.setLabel("Exit 3");
    // /menu.jsp(32,28) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /menu.jsp(35,24) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f6.setName("Edit");
    // /menu.jsp(35,24) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
        out.write("                            ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f7(_jspx_th_d_005fgraph_005fmenunode_005f6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f8(_jspx_th_d_005fgraph_005fmenunode_005f6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f9(_jspx_th_d_005fgraph_005fmenunode_005f6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
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
    // /menu.jsp(36,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f7.setName("Edit-Cut");
    // /menu.jsp(36,28) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f7.setLabel("Cut 3");
    // /menu.jsp(36,28) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /menu.jsp(37,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f8.setName("Edit-Copy");
    // /menu.jsp(37,28) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f8.setLabel("Copy 3");
    // /menu.jsp(37,28) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /menu.jsp(38,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f9.setName("Edit-Paste");
    // /menu.jsp(38,28) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f9.setLabel("Paste 3");
    // /menu.jsp(38,28) name = enabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f9.setEnabled(false);
    int _jspx_eval_d_005fgraph_005fmenunode_005f9 = _jspx_th_d_005fgraph_005fmenunode_005f9.doStartTag();
    if (_jspx_th_d_005fgraph_005fmenunode_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fenabled_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fenabled_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f9);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenunode_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005fmenunode_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menunode
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag _jspx_th_d_005fgraph_005fmenunode_005f10 = (com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel.get(com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag.class);
    _jspx_th_d_005fgraph_005fmenunode_005f10.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenunode_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005fmenunode_005f0);
    // /menu.jsp(41,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f10.setName("Othes");
    // /menu.jsp(41,28) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f10.setLabel("Others");
    int _jspx_eval_d_005fgraph_005fmenunode_005f10 = _jspx_th_d_005fgraph_005fmenunode_005f10.doStartTag();
    if (_jspx_eval_d_005fgraph_005fmenunode_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_d_005fgraph_005fmenunode_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_d_005fgraph_005fmenunode_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_d_005fgraph_005fmenunode_005f10.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f11(_jspx_th_d_005fgraph_005fmenunode_005f10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f12(_jspx_th_d_005fgraph_005fmenunode_005f10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_d_005fgraph_005fmenunode_005f13(_jspx_th_d_005fgraph_005fmenunode_005f10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_d_005fgraph_005fmenunode_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_d_005fgraph_005fmenunode_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_d_005fgraph_005fmenunode_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel.reuse(_jspx_th_d_005fgraph_005fmenunode_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel.reuse(_jspx_th_d_005fgraph_005fmenunode_005f10);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenunode_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005fmenunode_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menunode
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag _jspx_th_d_005fgraph_005fmenunode_005f11 = (com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag.class);
    _jspx_th_d_005fgraph_005fmenunode_005f11.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenunode_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005fmenunode_005f10);
    // /menu.jsp(42,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f11.setName("Font");
    // /menu.jsp(42,28) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f11.setLabel("Set Font");
    // /menu.jsp(42,28) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f11.setAction("demo-test.faces");
    int _jspx_eval_d_005fgraph_005fmenunode_005f11 = _jspx_th_d_005fgraph_005fmenunode_005f11.doStartTag();
    if (_jspx_th_d_005fgraph_005fmenunode_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f11);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenunode_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005fmenunode_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menunode
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag _jspx_th_d_005fgraph_005fmenunode_005f12 = (com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag.class);
    _jspx_th_d_005fgraph_005fmenunode_005f12.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenunode_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005fmenunode_005f10);
    // /menu.jsp(43,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f12.setName("Color");
    // /menu.jsp(43,28) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f12.setLabel("Set Color");
    // /menu.jsp(43,28) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f12.setAction("demo-test.faces");
    int _jspx_eval_d_005fgraph_005fmenunode_005f12 = _jspx_th_d_005fgraph_005fmenunode_005f12.doStartTag();
    if (_jspx_th_d_005fgraph_005fmenunode_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005faction_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f12);
    return false;
  }

  private boolean _jspx_meth_d_005fgraph_005fmenunode_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_d_005fgraph_005fmenunode_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:graph_menunode
    com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag _jspx_th_d_005fgraph_005fmenunode_005f13 = (com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag) _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fenabled_005fnobody.get(com.sun.javaee.blueprints.components.ui.taglib.GraphMenuNodeTag.class);
    _jspx_th_d_005fgraph_005fmenunode_005f13.setPageContext(_jspx_page_context);
    _jspx_th_d_005fgraph_005fmenunode_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_005fgraph_005fmenunode_005f10);
    // /menu.jsp(44,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f13.setName("Icon");
    // /menu.jsp(44,28) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f13.setLabel("Set Icon");
    // /menu.jsp(44,28) name = enabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_d_005fgraph_005fmenunode_005f13.setEnabled(false);
    int _jspx_eval_d_005fgraph_005fmenunode_005f13 = _jspx_th_d_005fgraph_005fmenunode_005f13.doStartTag();
    if (_jspx_th_d_005fgraph_005fmenunode_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fenabled_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fd_005fgraph_005fmenunode_0026_005fname_005flabel_005fenabled_005fnobody.reuse(_jspx_th_d_005fgraph_005fmenunode_005f13);
    return false;
  }
}
