<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>listOrder</title>
    </head>
    <body>
        
        <br/><br/>
    <h2>Order Information</h2>
    <table frame="border" width="60%">
    	<tr>
    		<td>Order Number</td>
    		<td>Order Items</td>
    		<td></td>
    	</tr>
    
	    <c:forEach var="order" items="${orders}">
		    <tr>
	    		<td>${order.orderId }</td>
	    		<td>${order.purchasedBooks }</td>
	    		<td>
	    			<a href="">Delete</a>
	    			<a href="">Edit</a>
	    		</td>
                       
                    </tr>
	    </c:forEach>
    </table>
        
        
    </body>
</html>