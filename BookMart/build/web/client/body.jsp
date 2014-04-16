<%-- 
    Document   : body
    Created on : Mar 4, 2014, 12:22:31 AM
    Author     : jeffwan
--%>


<%@page import="edu.pitt.domain.User"%>
<%@page import="edu.pitt.domain.Category"%>
<%@page import="edu.pitt.domain.Book"%>
<%@page import="java.util.List"%>
<%@page import="edu.pitt.service.BusinessServiceImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>client body</title>
    </head>
    <body>

        <%
            BusinessServiceImpl bs = new BusinessServiceImpl();
            List<Book> books = bs.getAllBook();
             List<User> users = bs.getAllUsers();
             out.println(users.get(0).getUserID());
        %>
        <h1>Book list here</h1>


        <%
            for (Book book : books) {

                int bookID = book.getBookID();

        %>
        <p><%=bookID%></p>
        <h4><%=book.getBookName()%></h4>
        <p><%=book.getDescription()%></p>

        <form action="bookDetail.jsp" method="post">
            <input type="hidden" name="bookID" value="<%=bookID%>"/>
            <input type="submit">
        </form>

        <%
            }
        %>

    </table>

</body>
</html>
