package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/tlds/mytags.tld");
    _jspx_dependants.add("/WEB-INF/tags/template.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_me_template_0(_jspx_page_context))
        return;
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_me_template_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  me:template
    org.apache.jsp.tag.web.template_tag _jspx_th_me_template_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.template_tag.class) : new org.apache.jsp.tag.web.template_tag();
    _jspx_th_me_template_0.setJspContext(_jspx_page_context);
    javax.servlet.jsp.tagext.JspFragment _jspx_temp0 = new AddBook_jspHelper( 0, _jspx_page_context, _jspx_th_me_template_0, null);
    _jspx_th_me_template_0.setContent(_jspx_temp0);
    _jspx_th_me_template_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("em");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <option>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.tenTacGia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private class AddBook_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public AddBook_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/templates/css/css_myself.css\" />\r\n");
      out.write("        <form class=\"subscribeForm ticket-item\" method=\"post\">\r\n");
      out.write("            <h3 class=\"widget-title text-center\" style=\"display:block\">Thêm sách mới</h3>\r\n");
      out.write("            <h4>Thông tin sách</h4><br>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-6 col-sm-12 col-md-push-1\">\r\n");
      out.write("                    <span>Tên sách: </span><input id=\"subscribe\" type=\"text\"><br/>\r\n");
      out.write("                    <span>Tập: </span>\t\t<input type=\"text\"/><br/>\r\n");
      out.write("                    <span>Cuốn:</span>\t\t<input type=\"text\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6 col-sm-12 col-md-push-1\">\r\n");
      out.write("                    <div style=\"float: left\"><br/>\r\n");
      out.write("                        <a class=\"ticket-btn\">Hiển thị mã vạch</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div style=\"float:right; margin-right:40%\">\r\n");
      out.write("                        <h5 class=\"text-center\">Mã vạch</h5><br/>\r\n");
      out.write("                        <img src=\"images/about_1.jpg\" width=\"150\" height=\"80\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6 col-sm-12 col-md-push-1\">\r\n");
      out.write("                    <p>Nội dung tóm tắt:</p><br>\r\n");
      out.write("                    <textarea rows=\"10\" cols=\"65\"></textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6 col-sm-12 col-md-push-1\">\r\n");
      out.write("                    <div style=\"float: left\"><br/><br/><br/><br/>\t\r\n");
      out.write("                            <a class=\"ticket-btn\">Brown...</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div style=\"float:right; margin-right:40%\">\r\n");
      out.write("                            <h5 class=\"text-center\">Mục lục</h5><br/>\r\n");
      out.write("                        <img src=\"images/about_1.jpg\" width=\"200\" height=\"250\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <h4>Thông tin tác giả - Nhà xuất bản</h4>\r\n");
      out.write("            <div class=\"row text-center\">\r\n");
      out.write("                    <span>Tác giả: </span>\r\n");
      out.write("                <select>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("                    <option>a</option>\r\n");
      out.write("                    <option>a</option>\r\n");
      out.write("                    <option>a</option>\r\n");
      out.write("                </select>\r\n");
      out.write("                <span>Quốc tịch: </span>\r\n");
      out.write("                <label>nnnn</label><br/><br/>\r\n");
      out.write("                <span>Nhà xuất bản: </span>\r\n");
      out.write("                <select>\r\n");
      out.write("                    <option>a</option>\r\n");
      out.write("                    <option>a</option>\r\n");
      out.write("                    <option>a</option>\r\n");
      out.write("                </select>\r\n");
      out.write("                <span>Quốc gia: </span>\r\n");
      out.write("                <label>nnnn</label>\r\n");
      out.write("            </div><br/>\r\n");
      out.write("            <h4>Thông tin nhóm sách - Chủ đề</h4>\r\n");
      out.write("            <div class=\"row\" style=\"margin-left:31%\">\r\n");
      out.write("                    <span>Nhóm sách: </span>\r\n");
      out.write("                <select>\r\n");
      out.write("                    <option>a</option>\r\n");
      out.write("                    <option>a</option>\r\n");
      out.write("                    <option>a</option>\r\n");
      out.write("                </select><br/><br/>\r\n");
      out.write("                <span>Chủ đề: </span>\r\n");
      out.write("                <select>\r\n");
      out.write("                    <option>a</option>\r\n");
      out.write("                    <option>a</option>\r\n");
      out.write("                    <option>a</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            </div><br/>\r\n");
      out.write("            <h4>Vị trí sách trên kệ</h4><br/>\r\n");
      out.write("            <div class=\"row subsOption\">\r\n");
      out.write("                <div class=\"col-md-4 col-md-push-1\">\r\n");
      out.write("                    <span>Tầng: </span>\r\n");
      out.write("                    <select>\r\n");
      out.write("                        <option>a</option>\r\n");
      out.write("                        <option>a</option>\r\n");
      out.write("                        <option>a</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 col-md-push-1\">\r\n");
      out.write("                    <span>Ngăn: </span>\r\n");
      out.write("                    <select>\r\n");
      out.write("                        <option>a</option>\r\n");
      out.write("                        <option>a</option>\r\n");
      out.write("                        <option>a</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div class=\"col-md-4 col-md-push-1\">\r\n");
      out.write("                    <span>Kệ: </span>\r\n");
      out.write("                    <select>\r\n");
      out.write("                        <option>a</option>\r\n");
      out.write("                        <option>a</option>\r\n");
      out.write("                        <option>a</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\" style=\"margin-top:30px\">\r\n");
      out.write("                    <div class=\"col-md-2 col-md-push-3\">\r\n");
      out.write("                                            <a class=\"ticket-btn\">Thêm</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                    <div class=\"col-md-2 col-md-push-6\">\r\n");
      out.write("                                            <a class=\"ticket-btn\">Thoát</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
