/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.pitt.web.client;

import edu.pitt.domain.User;
import edu.pitt.service.BusinessServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * register servlet
 * @author yanma
 * @version 04.09.2014
 * check whether username is used
 */
public class RegisterServlet extends HttpServlet {

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
        String method = request.getParameter("method");
        PrintWriter out = response.getWriter();
        if (method.equals("register")) {
            register(request, response);
        }
        
    }
        
        
    private void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String username = request.getParameter("username");
            String password = request.getParameter("pwd");
            
            BusinessServiceImpl service = new BusinessServiceImpl();
            int userID = service.findUser(username);
            if( userID !=0){
                
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet register</title>"); 
                out.println("<link rel=\"stylesheet\" href=\"../bootstrap.min.css\">");
                out.println("</head>");
                out.println("<body align='center'>");
                out.println("<h1>Sooooooorry!</h1>");
                out.println("<h3>The username has been used. Please re-register another username.</h3>");
                out.println("<h4>---><a href='/BookMart/client/register.jsp'>Back to Register Page</a><---</h4>");
                out.println("<img src='sorry.gif' />");
                out.println("</body>");
                out.println("</html>");
            }else{
                if(password.isEmpty()){
                    out.println("<script language='javascript'>alert('Please enter a password')</script>");
                }else{
                    User user = new User();
                    user.setUserName(username);
                    user.setPassword(password);
                    service.addUser(user);
                    userID = service.findUser(username);
                    String url = "index.jsp?userID="+userID;
                    response.sendRedirect(url);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

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
