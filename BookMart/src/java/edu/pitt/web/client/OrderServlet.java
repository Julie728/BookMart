/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.web.client;

import edu.pitt.domain.Book;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.pitt.domain.Order;
import edu.pitt.domain.User;
import java.util.Date;
import edu.pitt.service.BusinessServiceImpl;
import java.util.List;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 *
 * @author Liu
 */
public class OrderServlet extends HttpServlet {

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

        if (method.equals("add")) {
            add(request, response);
            return;
        }

        if (method.equals("listall")) {
            listall(request, response);
            return;
        }

        if (method.equals("delete")) {
            delete(request, response);
            return;
        }

        if (method.equals("update")) {
            update(request, response);
            return;
        }
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            BusinessServiceImpl service = new BusinessServiceImpl();
            Book book;
            int userId; // = Integer.parseInt(request.getParameter("userId"));
            String purchasedBooks = "";
            Date date = new Date();
            Double amount = 0.00;
            HttpSession session = request.getSession(true);
            ArrayList<Book> bookList = (ArrayList<Book>) session.getAttribute("bookList");
            User authenticatedUser = (User) session.getAttribute("authenticatedUser");
            userId = authenticatedUser.getUserID();
            if (bookList == null) {
                //if shopping cart is empty, cannot place order
                request.setAttribute("message", "Shopping cart is empty!");
            } else {

                //compute purchasedBooks and amount
                book = bookList.get(0);
                purchasedBooks = Integer.toString(book.getId());
                amount += book.getPrice();
                for (int i = 1; i < bookList.size(); i++) {
                    book = bookList.get(i);
                    purchasedBooks = "," + Integer.toString(bookList.get(i).getId());
                    amount += book.getPrice();
                }
            }

            Order order = new Order();
            order.setUserId(userId);
            order.setDate(date);
            order.setAmount(amount);
            order.setPurchasedBooks(purchasedBooks);
            service.addOrder(order);
            request.setAttribute("message", "Place order successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("message", "Place order failed!");
        }
        request.getRequestDispatcher("/message.jsp").forward(request, response);

    }

    private void listall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BusinessServiceImpl service = new BusinessServiceImpl();
        List<Order> list = service.getAllOrders();
        request.setAttribute("orders", list);
        request.getRequestDispatcher("/admin/listOrder.jsp").forward(request, response);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int orderId = Integer.parseInt(request.getParameter("orderId"));
            BusinessServiceImpl service = new BusinessServiceImpl();
            Order order = service.findOrder(orderId);
            service.deleteOrder(order);

            request.setAttribute("message", "Delete order successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("message", "Delete order failed!");
        }

        request.getRequestDispatcher("/message.jsp").forward(request, response);

    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int orderId = Integer.parseInt(request.getParameter("orderId"));
            Date date = new Date();
            Double amount = Double.parseDouble(request.getParameter("amount"));
            String purchasedBooks = request.getParameter("purchasedBooks");

            Order order = new Order();
            order.setDate(date);
            order.setAmount(amount);
            order.setPurchasedBooks(purchasedBooks);

            BusinessServiceImpl service = new BusinessServiceImpl();
            service.updateOrder(order);
            request.setAttribute("message", "Update order successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("message", "Update order failed!");
        }

        request.getRequestDispatcher("/message.jsp").forward(request, response);

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
