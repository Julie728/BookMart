/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.web.client;

import edu.pitt.domain.Category;
import edu.pitt.service.BusinessServiceImpl;
import edu.pitt.utils.WebUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jeffwan
 */
public class CategoryServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String method = request.getParameter("method");
        
        if ("add".equals(method)) {
            add(request, response);
            return;
        }
        
        if ("listall".equals(method)) {
            listadd(request, response);
            return;
        }
        
    }
    
    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        try {
            String name = request.getParameter("name");
            String description = request.getParameter("description");
            
            Category category = new Category();
            category.setId(WebUtils.makeID());
            category.setName(name);
            category.setDescription(description);
            
            BusinessServiceImpl service = new BusinessServiceImpl();
            service.addCategory(category);
            request.setAttribute("message", "Add Category successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("message", "Add Category failed!");
        }
        
        request.getRequestDispatcher("/message.jsp").forward(request, response);
        
    }
    
    
    private void listadd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BusinessServiceImpl service = new BusinessServiceImpl();
        List<Category> list = service.getAllCategory();
        request.setAttribute("categories", list);
        request.getRequestDispatcher("/admin/listCategory.jsp").forward(request, response);
    }
    


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    

  
}
