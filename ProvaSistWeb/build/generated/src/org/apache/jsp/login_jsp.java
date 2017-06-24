package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lista de funcionários</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\" />\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\" id=\"pagina\">\n");
      out.write("            \n");
      out.write("            <div class=\"row\" id=\"titulo_login\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-12 text-center\">\n");
      out.write("                \n");
      out.write("                    <h1>Entre com seu usuário e senha</h1>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("            \n");
      out.write("            <form class=\"form-horizontal\" action=\"verificaLoginServlet\" method=\"POST\">\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    \n");
      out.write("                    <label class=\"control-label col-md-4\" for=\"usuario\">Usuário:</label>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-4\"> \n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"usuario\" id=\"usuario\" />\n");
      out.write("                    </div>                        \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    \n");
      out.write("                    <label class=\"control-label col-md-4\" for=\"senha\">Senha:</label>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-4\"> \n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"senha\" id=\"senha\" />\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-offset-4 col-md-4\">\n");
      out.write("                        \n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\">Logar</button>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>\n");
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
