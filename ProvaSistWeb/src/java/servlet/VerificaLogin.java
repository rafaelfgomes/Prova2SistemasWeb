package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VerificaLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            
            String usuario = request.getParameter("usuario");
            String senha = request.getParameter("senha");
            
            if (usuario.equals("admin") && senha.equals("admin")) {

                  response.sendRedirect("index.html");
                
            }
            else
            {
              
                out.println("<!DOCTYPE html>");
            
                out.println("<html lang=\"pt-br\">");
            
                    out.println("<head>");
            
                        out.println("<title>Erro!!!</title>");
            
                            out.println("<meta charset=\"UTF-8\" />");
                            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />");
            
                            out.println("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />");
                            out.println("<link rel=\"stylesheet\" href=\"css/styles.css\" />");
            
                            out.println("<script src=\"js/jquery-3.2.1.min.js\"></script>");
                            out.println("<script src=\"js/bootstrap.min.js\"></script>");
            
                    out.println("</head>");
            
                    out.println("<body>");
            
                        out.println("<div class=\"container-fluid\" id=\"pagina\">");
            
                            out.println("<div class=\"row\" id=\"conteudo\">");
            
                                out.println("<p>&nbsp;</p>");
            
                                out.println("<div class=\"col-md-offset-4 col-md-8\">");
                                    out.println("<p class=\"paragrafo\">Usuário ou senha inválidos.</p>");       
                                out.println("</div>");
                                
                                out.println("<div class=\"form-group\">");
                                    
                                    out.println("<div class=\"col-md-offset-5 col-md-7\">");
                                        out.println("<button type=\"button\" class=\"btn btn-default\"><a href=\"login.jsp\">Voltar</a></button>");
                                    out.println("</div>");
                                
                                out.println("</div>");
                                
                                out.println("<p>&nbsp;</p>");
            
                            out.println("</div>");
            
                        out.println("</div>");
            
                    out.println("</body>");
            
                out.println("</html>");
            
            return;
                
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
