<%-- 
    Document   : listBook
    Created on : Apr 2, 2014, 2:10:21 PM
    Author     : yanma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Book Page</title>
    </head>
    <body>
        
        
         <br/><br/>
    <h2>Book Information</h2>
    <table frame="border" width="60%">
    	<tr>
    		<td>Book Name</td>
                <td>Author</td>
                <td>Publisher</td>
                <td>Publish Date</td>
                <td>Price</td>
                <td>CategoryID</td>
    		<td>Book Description</td>
    	</tr>
    
	    <c:forEach var="book" items="${book}">
		    <tr>
	    		<td>${book.bookName }</td>
                        <td>${book.author}</td>
                        <td>${book.publisher}</td>
                        <td>${book.publishDate}</td>
                        <td>${book.price}</td>
                        <td>${book.categoryID}</td>
	    		<td>${book.description }</td>
	    		<td>
	    			<a href="">Delete</a>
	    			<a href="">Edit</a>
	    		</td>
                       
                    </tr>
	    </c:forEach>
    </table>
        
        
        
    </body>
</html>
