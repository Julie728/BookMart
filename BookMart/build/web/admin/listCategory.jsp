<%-- 
    Document   : listCategory
    Created on : Mar 4, 2014, 12:44:15 AM
    Author     : jeffwan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <br/><br/>
    <h2>Category Information</h2>
    <table frame="border" width="60%">
    	<tr>
    		<td>Category Name</td>
    		<td>Category Description</td>
    		<td></td>
    	</tr>
    
	    <c:forEach var="category" items="${categories}">
		    <tr>
	    		<td>${category.name }</td>
	    		<td>${category.description }</td>
	    		<td>
	    			<a href="">Delete</a>
	    			<a href="">Edit</a>
	    		</td>
                       
                    </tr>
	    </c:forEach>
    </table>
        
        
    </body>
</html>
