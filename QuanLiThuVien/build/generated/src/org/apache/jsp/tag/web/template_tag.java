package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList<String> _jspx_nested = null;
    java.util.ArrayList<String> _jspx_at_begin = null;
    java.util.ArrayList<String> _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String message;
  private java.lang.String link_css;
  private javax.servlet.jsp.tagext.JspFragment content;

  public java.lang.String getMessage() {
    return this.message;
  }

  public void setMessage(java.lang.String message) {
    this.message = message;
  }

  public java.lang.String getLink_css() {
    return this.link_css;
  }

  public void setLink_css(java.lang.String link_css) {
    this.link_css = link_css;
  }

  public javax.servlet.jsp.tagext.JspFragment getContent() {
    return this.content;
  }

  public void setContent(javax.servlet.jsp.tagext.JspFragment content) {
    this.content = content;
  }

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    if( getMessage() != null ) {
      _jspx_page_context.setAttribute("message", getMessage());
}
    if( getLink_css() != null ) {
      _jspx_page_context.setAttribute("link_css", getLink_css());
}
    if( getContent() != null ) {
      _jspx_page_context.setAttribute("content", getContent());
}

    try {
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Services Page - Travel by templatemo</title>\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("    <meta name=\"author\" content=\"templatemo\">\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,800,700,600,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/css/font-awesome.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/css/animate.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/css/templatemo_misc.css\"\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/css/templatemo_style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/css/reader_style.css\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/js/vendor/modernizr-2.6.1-respond-1.1.0.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/js/vendor/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.1/jquery-ui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"site-header\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"main-header\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 col-xs-10\">\r\n");
      out.write("                        <div class=\"logo\">\r\n");
      out.write("                            <a rel=\"nofollow\" href=\"http://www.templatemo.com/preview/templatemo_409_travel\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/images/logo.png\" alt=\"travel html5 website template - templatemo\" title=\"travel - free html5 template\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div> <!-- /.logo -->\r\n");
      out.write("                    </div> <!-- /.col-md-4 -->\r\n");
      out.write("                    <div class=\"col-md-8 col-sm-6 col-xs-2\">\r\n");
      out.write("                        <div class=\"main-menu\">\r\n");
      out.write("                            <ul class=\"visible-lg visible-md\">\r\n");
      out.write("                                <li><a href=\"index.html\">Trang Chủ</a></li>\r\n");
      out.write("                                <li class=\"active\"><a href=\"services.html\">Tìm Kiếm Sách</a></li>\r\n");
      out.write("                                <li><a href=\"events.html\">Đăng Ký Tập Huấn</a></li>\r\n");
      out.write("                                <li><a href=\"about.html\">Liên hệ</a></li>\r\n");
      out.write("                                <li><a href=\"contact.html\">Đăng nhập</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <a href=\"#\" class=\"toggle-menu visible-sm visible-xs\">\r\n");
      out.write("                                <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div> <!-- /.main-menu -->\r\n");
      out.write("                    </div> <!-- /.col-md-8 -->\r\n");
      out.write("                </div> <!-- /.row -->\r\n");
      out.write("            </div> <!-- /.main-header -->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12 visible-sm visible-xs\">\r\n");
      out.write("                    <div class=\"menu-responsive\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                            <li class=\"active\"><a href=\"services.html\">Services</a></li>\r\n");
      out.write("                            <li><a href=\"events.html\">Events</a></li>\r\n");
      out.write("                            <li><a href=\"about.html\">About Us</a></li>\r\n");
      out.write("                            <li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div> <!-- /.menu-responsive -->\r\n");
      out.write("                </div> <!-- /.col-md-12 -->\r\n");
      out.write("            </div> <!-- /.row -->\r\n");
      out.write("        </div> <!-- /.container -->\r\n");
      out.write("    </div> <!-- /.site-header -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"page-top\" id=\"templatemo_services\">\r\n");
      out.write("    </div> <!-- /.page-header -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"middle-content\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                ");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getContent() != null) {
        getContent().invoke(_jspx_sout);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- /.middle-content -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"partner-list\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-2 col-sm-4 col-xs-6\">\r\n");
      out.write("                    <div class=\"partner-item\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/images/partners/partner1.png\" alt=\"\">\r\n");
      out.write("                    </div> <!-- /.partner-item -->\r\n");
      out.write("                </div> <!-- /.col-md-2 -->\r\n");
      out.write("                <div class=\"col-md-2 col-sm-4 col-xs-6\">\r\n");
      out.write("                    <div class=\"partner-item\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/images/partners/partner2.png\" alt=\"\">\r\n");
      out.write("                    </div> <!-- /.partner-item -->\r\n");
      out.write("                </div> <!-- /.col-md-2 -->\r\n");
      out.write("                <div class=\"col-md-2 col-sm-4 col-xs-6\">\r\n");
      out.write("                    <div class=\"partner-item\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/images/partners/partner3.png\" alt=\"\">\r\n");
      out.write("                    </div> <!-- /.partner-item -->\r\n");
      out.write("                </div> <!-- /.col-md-2 -->\r\n");
      out.write("                <div class=\"col-md-2 col-sm-4 col-xs-6\">\r\n");
      out.write("                    <div class=\"partner-item\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/images/partners/partner1.png\" alt=\"\">\r\n");
      out.write("                    </div> <!-- /.partner-item -->\r\n");
      out.write("                </div> <!-- /.col-md-2 -->\r\n");
      out.write("                <div class=\"col-md-2 col-sm-4 col-xs-6\">\r\n");
      out.write("                    <div class=\"partner-item\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/images/partners/partner2.png\" alt=\"\">\r\n");
      out.write("                    </div> <!-- /.partner-item -->\r\n");
      out.write("                </div> <!-- /.col-md-2 -->\r\n");
      out.write("                <div class=\"col-md-2 col-sm-4 col-xs-6\">\r\n");
      out.write("                    <div class=\"partner-item last\">\r\n");
      out.write("                        <img src= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/images/partners/partner3.png\" alt=\"\">\r\n");
      out.write("                    </div> <!-- /.partner-item -->\r\n");
      out.write("                </div> <!-- /.col-md-2 -->\r\n");
      out.write("            </div> <!-- /.row -->\r\n");
      out.write("        </div> <!-- /.container -->\r\n");
      out.write("    </div> <!-- /.partner-list -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"site-footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\r\n");
      out.write("                    <div class=\"footer-logo\">\r\n");
      out.write("                        <a href=\"index.html\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/images/logo.png\" alt=\"\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div> <!-- /.col-md-4 -->\r\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\r\n");
      out.write("                    <div class=\"copyright\">\r\n");
      out.write("                        <span>Copyright &copy; 2084 <a href=\"#\">Company Name</a> <!-- Credit: www.templatemo.com --></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div> <!-- /.col-md-4 -->\r\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\r\n");
      out.write("                    <ul class=\"social-icons\">\r\n");
      out.write("                        <li><a href=\"#\" class=\"fa fa-facebook\"></a></li>\r\n");
      out.write("                        <li><a href=\"#\" class=\"fa fa-twitter\"></a></li>\r\n");
      out.write("                        <li><a href=\"#\" class=\"fa fa-linkedin\"></a></li>\r\n");
      out.write("                        <li><a href=\"#\" class=\"fa fa-flickr\"></a></li>\r\n");
      out.write("                        <li><a href=\"#\" class=\"fa fa-rss\"></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div> <!-- /.col-md-4 -->\r\n");
      out.write("            </div> <!-- /.row -->\r\n");
      out.write("        </div> <!-- /.container -->\r\n");
      out.write("    </div> <!-- /.site-footer -->\r\n");
      out.write("    <script src= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/js/bootstrap.js\"></script>\r\n");
      out.write("    <script src= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/js/plugins.js\"></script>\r\n");
      out.write("    <script src= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/templates/js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}
