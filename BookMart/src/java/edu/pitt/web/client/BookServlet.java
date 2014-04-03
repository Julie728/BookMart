/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.pitt.web.client;

import edu.pitt.domain.Book;
import edu.pitt.service.BusinessServiceImpl;
import edu.pitt.utils.WebUtils;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Book Servlet class
 * @author yanma
 */
public class BookServlet extends HttpServlet {

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
       String method = request.getParameter("method");
        
       /**
        * if request ask for add book action
        * do add book behavior
        * then return and exit
        * if request wants list all books
        * call list all method add all books to the list
        * then return the list
        */
        if ("add".equals(method)) {
            add(request, response);
            return;
        }
        
        if ("listall".equals(method)) {
            listadd(request, response);
            return;
        }
    }
    
    
    /**
     * add book from request method
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     * 
     * get all book attributes from request
     * then, set all these attributes to the new created book
     * create a new service and add the new book to the service
     * 
     * 
     */
    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        try {
            String name = request.getParameter("name");
            String author = request.getParameter("author");
            String publisher = request.getParameter("publisher");
            DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
            Date publishDate = df.parse(request.getParameter("publishDate"));
            Double price = Double.parseDouble(request.getParameter("price"));
            String category = request.getParameter("category");
            String description = request.getParameter("description");
            
            
            Book book = new Book();
            book.setId(WebUtils.makeID());
            book.setName(name);
            book.setAuthor(author);
            book.setPublisher(publisher);
            book.setPublishDate(publishDate);
            book.setPrice(price);
            book.setCategory(category);
            book.setDescription(description);
            
            BusinessServiceImpl service = new BusinessServiceImpl();
            service.addBook(book);
            request.setAttribute("message", "Add Book successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("message", "Add Book failed!");
        }
        
        request.getRequestDispatcher("/message.jsp").forward(request, response);
        
    }
    
    /**
     * list all books method
     * create a new service and use the method getAllBook to get the book list
     * set the request attribute books
     * return the book list
     */
    private void listadd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BusinessServiceImpl service = new BusinessServiceImpl();
        List<Book> list = service.getAllBook();
        request.setAttribute("books", list);
        request.getRequestDispatcher("/admin/listBook.jsp").forward(request, response);
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
