<%-- 
    Document   : bookDetail
    Created on : Apr 3, 2014, 7:58:26 PM
    Author     : yanma
--%>

<%@page import="edu.pitt.domain.Book"%>
<%@page import="edu.pitt.service.BusinessServiceImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            Book book = new Book();
//            if(request.getParameter("bookID")!=null){
                int bookID = Integer.parseInt(request.getParameter("bookID"));
                BusinessServiceImpl bs = new BusinessServiceImpl();
                book=bs.findBook(1);
//            }
        %>
        <p><%=book.getBookName()%></p>
    </body>
</html>
