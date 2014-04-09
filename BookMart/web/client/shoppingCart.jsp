<%@page import="java.util.ArrayList"%>
<%@page import="edu.pitt.domain.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>shoppingCart</title>
    </head>
    <body>
        <h1>Shopping Cart</h1>
        <table id="tblTransactions" cellpadding="6" cellspacing="0" border="1">
            <tr>
                <th>Book Name</th>
                <th>Price</th>
                <th>Operation</th>               
            </tr>
            <%
                ArrayList<Book> bookList = (ArrayList<Book>) session.getAttribute("bookList");
                if (bookList == null) {
                    out.write("<p>No item is in your shopping cart</p>");
                } else {
                    for (Book book : bookList) {
                        out.println("<tr>");
                        out.println("<td align='right'>" + book.getName());
                        out.println("<td align='right'>" + book.getPrice());
                        out.println("<td align='right'> <a href = ''>Delete</a>");
                        out.println("</tr>");
                    }
                }

            %>
        </table>    


        <form name= "shoppingCartForm" id = "shoppingCartForm" method="post" action ="OrderServlet" >
            <input type = "submit" value = "Place Order"  id = "btnSubmit">
        </form>
        
        
    </body>
</html>
