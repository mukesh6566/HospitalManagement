/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-13 06:11:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <!-- Latest compiled and minified CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery library -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Latest compiled JavaScript -->\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("      \r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\r\n");
      out.write("<script defer src=\"https://use.fontawesome.com/releases/v5.0.8/js/all.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <title>Log In|Hospital Management System</title>\r\n");
      out.write("      \r\n");
      out.write("      <style>\r\n");
      out.write("          body{\r\n");
      out.write("              background-image: url(resources/img/doctor.jpg);\r\n");
      out.write("          }\r\n");
      out.write("      \r\n");
      out.write("          .navbar-default{\r\n");
      out.write("              background-color: rgb(8, 111, 202);\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("          a:hover{\r\n");
      out.write("              color: aliceblue;\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("         a:visited{\r\n");
      out.write("              color: aliceblue;\r\n");
      out.write("          }\r\n");
      out.write("          .navbar-default .navbar-brand{\r\n");
      out.write("              color: aliceblue;\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("          .navbar-default .navbar-nav>li>a {\r\n");
      out.write("              color: aliceblue;\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("          .navbar-default .navbar-nav>li>a:hover{\r\n");
      out.write("              color: aliceblue;\r\n");
      out.write("          }\r\n");
      out.write("           .navbar-default .navbar-nav>li>a:visited{\r\n");
      out.write("              color: aliceblue;\r\n");
      out.write("          }\r\n");
      out.write("        /*  \r\n");
      out.write("          .panel-default>.panel-heading{\r\n");
      out.write("              background-color: rgb(8, 111, 202);\r\n");
      out.write("              color: aliceblue;\r\n");
      out.write("          }*/\r\n");
      out.write("          \r\n");
      out.write("          .col-lg-6{\r\n");
      out.write("              float: right;\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("      </style>\r\n");
      out.write("      \r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("      \r\n");
      out.write("      <nav class=\"navbar navbar-default\">\r\n");
      out.write("             <div class=\"navbar-header\">\r\n");
      out.write("              <a class=\"navbar-brand\" href=\"#\">HOSPITAL MANAGEMENT SYSTEM</a>\r\n");
      out.write("            </div>\r\n");
      out.write("          <div class=\"container-fluid\">\r\n");
      out.write("             \r\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("         \r\n");
      out.write("          \r\n");
      out.write("          <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Select Language <span class=\"caret\"></span></a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("              <li><a href=\"#\">English</a></li>\r\n");
      out.write("              <li><a href=\"#\">Nepali</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("        \r\n");
      out.write("              \r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("  \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"col-lg-6\">\r\n");
      out.write("          <div class=\"panel panel-info\">\r\n");
      out.write("          \r\n");
      out.write("              <div class=\"panel-heading\">Log In</div>\r\n");
      out.write("                  <div class=\"panel-body\">\r\n");
      out.write("                      <div class=\"form-group \">\r\n");
      out.write("                             \r\n");
      out.write("                          <select class=\"form-control\" id=\"sel1\">\r\n");
      out.write("                                <option>Admin</option>\r\n");
      out.write("                                <option>Doctor</option>\r\n");
      out.write("                                <option>Nurse</option>\r\n");
      out.write("                                <option>Patient</option>\r\n");
      out.write("                              </select><br>\r\n");
      out.write("                          \r\n");
      out.write("                          \r\n");
      out.write("                          \r\n");
      out.write("                          \r\n");
      out.write("                              <div class=\"input-group\">\r\n");
      out.write("                               <div class=\"input-group-addon\">\r\n");
      out.write("                                <i class=\"fas fa-envelope\"></i> \r\n");
      out.write("                               </div>\r\n");
      out.write("                               <input class=\"form-control\" id=\"email\" name=\"email\" type=\"email\" placeholder=\"Email\" required=\"required\"/>\r\n");
      out.write("                              </div><br>\r\n");
      out.write("                             \r\n");
      out.write("                           <div class=\"input-group\">\r\n");
      out.write("                               <div class=\"input-group-addon\">\r\n");
      out.write("                                <i class=\"fas fa-unlock\"></i> \r\n");
      out.write("                               </div>\r\n");
      out.write("                               <input class=\"form-control\" id=\"pass\" name=\"password\" type=\"password\" placeholder=\"Password\" required=\"required\"/>\r\n");
      out.write("                              </div><br>\r\n");
      out.write("                          \r\n");
      out.write("                       \r\n");
      out.write("                                   <button type=\"button\" class=\"btn btn-primary btn-lg btn-block\">Log In</button><br>\r\n");
      out.write("                         <a href=\"#\" style=\"color:black; text-decoration:none\">Forgot Password?</a>\r\n");
      out.write("                            \r\n");
      out.write("                          \r\n");
      out.write("                          \r\n");
      out.write("                          \r\n");
      out.write("                          \r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                             \r\n");
      out.write("                      \r\n");
      out.write("                      \r\n");
      out.write("                      \r\n");
      out.write("                      \r\n");
      out.write("                      \r\n");
      out.write("                      \r\n");
      out.write("                      \r\n");
      out.write("\r\n");
      out.write("              </div><!--panel-body closing-->\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}