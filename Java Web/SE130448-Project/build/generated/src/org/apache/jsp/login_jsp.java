package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sample.dtos.HouseDTO;
import sample.dtos.DetailHouseDTO;
import sample.dtos.PropertyDTO;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Login Page</title>\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/styleLogin.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.11.2/js/all.js\" />\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\" charset=\"UTF-8\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/de96c8b80a.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            String priceLowerSH = request.getParameter("priceLower");
            String priceHigherSH = request.getParameter("priceHigher");
            if (priceLowerSH == null) {
                priceLowerSH = (String) request.getAttribute("PRICELOWER");
                if (priceLowerSH == null) {
                    priceLowerSH = "1000000";
                }
            }
            if (priceHigherSH == null) {
                priceHigherSH = (String) request.getAttribute("PRICEHIGHER");
                if (priceHigherSH == null) {
                    priceHigherSH = "100000";
                }
            }
            String idCitySH = request.getParameter("idCity");
            String idWaySH = request.getParameter("idWay");
            String typeIDSH = request.getParameter("typeID");
            if (idCitySH == null) {
                idCitySH = (String) request.getAttribute("IDCITY");
                if (idCitySH == null) {
                    idCitySH = "";
                }
            }
            if (idWaySH == null) {
                idWaySH = (String) request.getAttribute("IDWAY");
                if (idWaySH == null) {
                    idWaySH = "";
                }
            }
            if (typeIDSH == null) {
                typeIDSH = (String) request.getAttribute("TYPEID");
                if (typeIDSH == null) {
                    typeIDSH = "";
                }
            }


        
      out.write("\n");
      out.write("        <form action=\"MainController\" class=\"login-form\" method=\"POST\">\n");
      out.write("            <h1>Login</h1>\n");
      out.write("            <div class=\"txtb\">\n");
      out.write("                <input type=\"text\" name=\"userID\" required=\"true\">\n");
      out.write("                <span data-placeholder=\"UserID\"></span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"txtb\">\n");
      out.write("                <input type=\"password\" name=\"password\" required=\"true\">\n");
      out.write("                <span data-placeholder=\"Password\"></span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"btnForgot\">\n");
      out.write("                <a href=\"#\">Forgot password?</a>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"hidden\" name=\"idCity\" value=\"");
      out.print(idCitySH);
      out.write("\"/>\n");
      out.write("            <input type=\"hidden\" name=\"idWay\" value=\"");
      out.print(idWaySH);
      out.write("\"/>\n");
      out.write("            <input type=\"hidden\" name=\"typeID\" value=\"");
      out.print(typeIDSH);
      out.write("\"/>\n");
      out.write("            <input type=\"hidden\" name=\"priceLower\" value=\"");
      out.print(priceLowerSH);
      out.write("\"/>\n");
      out.write("            <input type=\"hidden\" name=\"priceHigher\" value=\"");
      out.print(priceHigherSH);
      out.write("\"/>\n");
      out.write("            <input type=\"hidden\" name=\"idHouse\" value=\"");
      out.print(request.getParameter("idHouse"));
      out.write("\"/>\n");
      out.write("            <input type=\"hidden\" name=\"price\" value=\"");
      out.print(request.getParameter("price"));
      out.write("\"/>\n");
      out.write("            <input type=\"submit\" class=\"logbtn\" name=\"action\" value=\"Login\">\n");
      out.write("\n");
      out.write("            <div class=\"middle\">\n");
      out.write("                <p>\n");
      out.write("                    Or Login With\n");
      out.write("                </p>\n");
      out.write("                <a class=\"btnLoginBy\" href=\"#\">\n");
      out.write("                    <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"btnLoginBy\" href=\"#\">\n");
      out.write("                    <i class=\"fab fa-twitter\"></i>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"btnLoginBy\" href=\"#\">\n");
      out.write("                    <i class=\"fab fa-google\"></i>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"btnLoginBy\" href=\"#\">\n");
      out.write("                    <i class=\"fab fa-instagram\"></i>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"bottom-text\">\n");
      out.write("                Don't have account ? \n");
      out.write("                ");

                    String urlSignup = "MainController?action=Go to signup"
                            + "&idCity=" + idCitySH
                            + "&idWay=" + idWaySH
                            + "&typeID=" + typeIDSH
                            + "&priceLower=" + priceLowerSH
                            + "&priceHigher=" + priceHigherSH;
                
      out.write("\n");
      out.write("\n");
      out.write("                <a href=\"");
      out.print(urlSignup);
      out.write("\">Sign up</a>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"MainController?action=Search\">Back to Home Page</a> <br>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(\".txtb input\").on(\"focus\", function () {\n");
      out.write("                $(this).addClass(\"focus\");\n");
      out.write("            });\n");
      out.write("            $(\".txtb input\").on(\"blur\", function () {\n");
      out.write("                if ($(this).val() == \"\")\n");
      out.write("                    $(this).removeClass(\"focus\");\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
