/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M11
 * Generated at: 2016-12-23 06:39:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("/WEB-INF/views/templates/header.jsp", Long.valueOf(1482397370835L));
    _jspx_dependants.put("/WEB-INF/views/templates/footer.jsp", Long.valueOf(1481460135325L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.3.RELEASE.jar", Long.valueOf(1481108329888L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1481264871228L));
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-4.1.0.RELEASE.jar", Long.valueOf(1482398824634L));
    _jspx_dependants.put("jar:file:/C:/Users/rajes/Desktop/DT/Diginext/dir_main/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Furnisets/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("jar:file:/C:/Users/rajes/Desktop/DT/Diginext/dir_main/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Furnisets/WEB-INF/lib/spring-security-taglibs-4.1.0.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1462401124000L));
    _jspx_dependants.put("jar:file:/C:/Users/rajes/Desktop/DT/Diginext/dir_main/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Furnisets/WEB-INF/lib/spring-webmvc-4.3.3.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1474276970000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE>\r\n");
      out.write("<html lang=\"en-US\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Furnisets</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"shortcut icon\"\r\n");
      out.write("\thref=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/source/files/main.css\" />\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\tfunction urlRedirectTo(obj) {\r\n");
      out.write("\t\t//if('wordpress_version1' == obj)\r\n");
      out.write("\t\t//window.location = 'https://wordpress.org/download/';\r\n");
      out.write("\t\t//if('wordpress_version2' == obj)\r\n");
      out.write("\t\t//window.location = 'https://wordpress.org/download/';\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction dynamicdropdown(listindex) {\r\n");
      out.write("\t\tdocument.getElementById(\"sub_subcategory\").length = 0;\r\n");
      out.write("\t\tdocument.getElementById(\"sub_subcategory\").options[0] = new Option(\r\n");
      out.write("\t\t\t\t\"Please select framework version\", \"\");\r\n");
      out.write("\t\tdocument.getElementById(\"subcategory\").length = 0;\r\n");
      out.write("\t\tswitch (listindex) {\r\n");
      out.write("\t\tcase \"Php\":\r\n");
      out.write("\t\t\tdocument.getElementById(\"subcategory\").options[0] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Please select framework\", \"\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"subcategory\").options[1] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Wordpress\", \"Wordpress\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"subcategory\").options[2] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Magento\", \"Magento\");\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\r\n");
      out.write("\t\tcase \"Java\":\r\n");
      out.write("\t\t\tdocument.getElementById(\"subcategory\").options[0] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Please select framework\", \"\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"subcategory\").options[1] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Strauts\", \"Strauts\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"subcategory\").options[2] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Hibernate\", \"Hibernate\");\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Javascript\":\r\n");
      out.write("\t\t\tdocument.getElementById(\"subcategory\").options[0] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Please select framework\", \"\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"subcategory\").options[1] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Prototype\", \"Prototype\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"subcategory\").options[2] = new Option(\r\n");
      out.write("\t\t\t\t\t\"jQuery\", \"jQuery\");\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Dotnet\":\r\n");
      out.write("\t\t\tdocument.getElementById(\"subcategory\").options[0] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Please select framework\", \"\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"subcategory\").options[1] = new Option(\r\n");
      out.write("\t\t\t\t\t\"VbScript\", \"VbScript\");\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tdefault:\r\n");
      out.write("\t\t\tdocument.getElementById(\"subcategory\").options[0] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Please select framework\", \"\");\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction dynamicdropdownone(listindex) {\r\n");
      out.write("\t\tdocument.getElementById(\"sub_subcategory\").length = 0;\r\n");
      out.write("\t\tswitch (listindex) {\r\n");
      out.write("\t\tcase \"Wordpress\":\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[0] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Please select framework\", \"\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[1] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Wordpress Version1\", \"wordpress_version1\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[2] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Wordpress Version2\", \"wordpress_version2\");\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\r\n");
      out.write("\t\tcase \"Magento\":\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[0] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Please select framework\", \"\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[1] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Magento Version1\", \"magento_version1\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[2] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Magento Version2\", \"magento_version2\");\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Strauts\":\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[0] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Please select framework\", \"\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[1] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Strauts Version1\", \"strauts_version1\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[2] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Strauts Version2\", \"strauts_version2\");\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\r\n");
      out.write("\t\tcase \"Hibernate\":\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[0] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Please select framework\", \"\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[1] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Hibernate Version1\", \"hibernate_version1\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[2] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Hibernate Version2\", \"hibernate_version2\");\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Prototype\":\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[0] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Please select framework\", \"\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[1] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Prototype Version1\", \"prototype_version1\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[2] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Prototype Version2\", \"prototype_version2\");\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\r\n");
      out.write("\t\tcase \"jQuery\":\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[0] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Please select framework\", \"\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[1] = new Option(\r\n");
      out.write("\t\t\t\t\t\"jQuery Version1\", \"jquery_version1\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[2] = new Option(\r\n");
      out.write("\t\t\t\t\t\"jQuery Version2\", \"jquery_version2\");\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"VbScript\":\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[0] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Please select framework\", \"\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[1] = new Option(\r\n");
      out.write("\t\t\t\t\t\"VbScript Version1\", \"vbscript_version1\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[2] = new Option(\r\n");
      out.write("\t\t\t\t\t\"VbScript Version2\", \"vbscript_version2\");\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tdefault:\r\n");
      out.write("\t\t\tdocument.getElementById(\"sub_subcategory\").options[0] = new Option(\r\n");
      out.write("\t\t\t\t\t\"Please select framework version\", \"\");\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar t1 = 0;\r\n");
      out.write("\twindow.onscroll = scroll1;\r\n");
      out.write("\r\n");
      out.write("\tfunction scroll1() {\r\n");
      out.write("\t\tvar toTop = document.getElementById('toTop');\r\n");
      out.write("\t\twindow.scrollY > 0 ? toTop.style.display = 'Block'\r\n");
      out.write("\t\t\t\t: toTop.style.display = 'none';\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction abcd() {\r\n");
      out.write("\t\tvar y1 = window.scrollY;\r\n");
      out.write("\t\ty1 = y1 - 20;\r\n");
      out.write("\t\twindow.scrollTo(0, y1);\r\n");
      out.write("\t\tif (y1 > 0) {\r\n");
      out.write("\t\t\tt1 = setTimeout(\"abcd()\", 0);\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tclearTimeout(t1);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container-fluid\" id=\"div0\">\r\n");
      out.write("\t\t<div class=\"row\" id=\"div1\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-4\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t<img class=\"img-responsive\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" alt=\"Furnisets\"\r\n");
      out.write("\t\t\t\t\tid=\"logo0\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-sm-4\"></div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t\t<p\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 100%; font-size: 140%; color: #9d9d9d; margin-bottom: 0px; margin-left: 2%;\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logintext}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br />");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logintext1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\"#myNavbar\" style=\"float: left; margin-left: 15px;\">\r\n");
      out.write("\t\t\t\t\t<span style=\"color: white;\">Menu</span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"home\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Product-Category<span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\" id=\"ul0\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"all\">All Products</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"living?catagory=Living Room\">Living Room</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"bed?catagory=Bed Room\">Bed Room</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"k&d?catagory=Kitchen and Dining\">Kitchen\r\n");
      out.write("\t\t\t\t\t\t\t\t\tand Dining</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"study?catagory=Study Room\">Study Room</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"tel\">Contact Us</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">About Us</a></li>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_sec_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"Signup\"><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"signin\"><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/signout\"><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"Mybag\"><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-shopping-cart\"></span></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"div9\">\r\n");
      out.write("\t<div id=\"div10\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<table class=\"table table-hover\" id=\"tab0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th style=\"display:none;\">Id</th>\r\n");
      out.write("\t\t\t\t\t<th>Product Name</th>\r\n");
      out.write("\t\t\t\t\t<th>Product Price</th>\r\n");
      out.write("\t\t\t\t\t<th>Quantity</th>\r\n");
      out.write("\t\t\t\t\t<th>Category</th>\r\n");
      out.write("\t\t\t\t\t<th>Detail</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- FOOTER -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<img src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" id=\"toTop\"\r\n");
      out.write("\t\t\tonclick=\"abcd()\" /> <br />\r\n");
      out.write("\t\t<p class=\"pull-right\"></p>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t&copy; 2016 Company, Inc. &middot; <a href=\"#\">Privacy</a> &middot; <a\r\n");
      out.write("\t\t\t\thref=\"#\">Terms</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/templates/header.jsp(16,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("source/images/favicon.ico");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/views/templates/header.jsp(176,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("source/images/logo.png");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    try {
      _jspx_th_sec_005fauthorize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f0.setParent(null);
      // /WEB-INF/views/templates/header.jsp(214,5) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f0.setAccess("hasRole('ROLE_ADMIN')");
      int _jspx_eval_sec_005fauthorize_005f0 = _jspx_th_sec_005fauthorize_005f0.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
        out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Admin-functions<span\r\n");
        out.write("\t\t\t\t\t\t\t\tclass=\"caret\"></span></a>\r\n");
        out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" id=\"ul0\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<li><a href=\"createprod\">Add Product</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t\t<li><a href=\"retrive\">View Product</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t\t<li><a href=\"retrive_u\">View Users</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/view.jsp(15,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("prod1");
      // /WEB-INF/views/view.jsp(15,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/view.jsp(15,4) '${product1}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${product1}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t<td style=\"display:none;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prod1.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prod1.productName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prod1.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prod1.quantity}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prod1.catagory}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td><a href=\"details?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prod1.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">Detail</a></td>\r\n");
            out.write("\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    try {
      _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f2.setParent(null);
      // /WEB-INF/views/templates/footer.jsp(5,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f2.setValue("source/images/arrow.png");
      int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
      if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    }
    return false;
  }
}
