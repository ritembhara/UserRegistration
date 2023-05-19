package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class RegisterDB_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/register.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Registration Page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            *\n");
      out.write("            {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                /*background-color:red;*/\n");
      out.write("                background-image:url('Images/p2.jpg');\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("\n");
      out.write("                font-family: 'Times New Roman', Times, serif;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                   background-image:url('Images/p2.jpg');\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                color:darkblue;\n");
      out.write("            }\n");
      out.write("            input[type=submit] \n");
      out.write("            {  \n");
      out.write("                background-color:darkblue;  \n");
      out.write("                color: white;  \n");
      out.write("                border: none;  \n");
      out.write("                cursor: pointer;  \n");
      out.write("                width:25%; \n");
      out.write("                padding: 16px 20px; \n");
      out.write("                opacity: 0.9;  \n");
      out.write("                border-radius:5px;\n");
      out.write("                font-family: 'Times New Roman', Times, serif;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-variant: small-caps;\n");
      out.write("                font-size:20px;\n");
      out.write("            } \n");
      out.write("            input[type=text],input[type=password],input[type=number]\n");
      out.write("            {  \n");
      out.write("                width: 80%; \n");
      out.write("                height:100%;\n");
      out.write("            }\n");
      out.write("                input[type=text],input[type=password],input[type=number]:hover\n");
      out.write("            {   border:3px solid #60ACEF;\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("            input[type=submit]:hover\n");
      out.write("            {\n");
      out.write("                transform:scale(1.1);\n");
      out.write("                transition:2s;\n");
      out.write("            }\n");
      out.write("            .outer\n");
      out.write("            {\n");
      out.write("                border:solid 2px darkblue;\n");
      out.write("                height:500px;\n");
      out.write("                width:650px; \n");
      out.write("                margin-top:5%;\n");
      out.write("                border-radius:10px;\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("                   td:hover{\n");
      out.write("                color:lightblue;\n");
      out.write("            }\n");
      out.write("            u{\n");
      out.write("                color:lightblue;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <form action=\"RegisterDB.jsp\" method=\"post\">\n");
      out.write("                <table class=\"outer\" align=\"center\"  cellspacing=\"20px\">\n");
      out.write("                    <tr><td colspan=\"2\"><h1 align=\"center\"><u>Registration</u></h1></td></tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"right\" style=\"font-size:20px;\"><b>Name</b></td>\n");
      out.write("                        <td><input type=\"text\" name=\"n\" required /></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"right\" style=\"font-size:20px;\"><b>Address</b></td>\n");
      out.write("                        <td><input type=\"text\" name=\"add\" required /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"right\" style=\"font-size:20px;\"><b>Phone</b></td>\n");
      out.write("                        <td><input type=\"text\" name=\"pho\" size=\"10\" required /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"right\" style=\"font-size:20px;\"><b>Username</b></td>\n");
      out.write("                        <td><input type=\"text\" name=\"un\" required /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"right\" style=\"font-size:20px;\"><b>Password</b></td>\n");
      out.write("                        <td><input type=\"password\" name=\"ps\" required /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"btn\" align=\"center\">\n");
      out.write("                        <td colspan=\"2\"><input type=\"submit\" value=\"Register\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Register Page</title>\r\n");
      out.write("        <!--<style>-->\r\n");
      out.write("<!--/*        .err\r\n");
      out.write("            {\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                color:white;\r\n");
      out.write("                font-size:20px;\r\n");
      out.write("            }*/-->\r\n");
      out.write("        <!--</style>-->\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
  
            try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sneha_jain");
                String uname=request.getParameter("un");
                String passd=request.getParameter("ps");
                String nm=request.getParameter("n");
                String add =request.getParameter("add");
                String pho =request.getParameter("pho");
                PreparedStatement ps=conn.prepareStatement("Insert into userDetails(Username,Password,Name,Address,Phone) values(?,?,?,?,?)");
                ps.setString(1,uname);
                ps.setString(2,passd);
                ps.setString(3,nm);
                ps.setString(4,add);
                ps.setString(5,pho);
                ps.executeUpdate();
      out.write("\r\n");
      out.write("                <div>");
out.print("Data Inserted Successfully!");
      out.write("</div>\r\n");
      out.write("                            ");
}
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
                   
            
      out.write("\r\n");
      out.write("                      </body>\r\n");
      out.write("</html>\r\n");
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
}
