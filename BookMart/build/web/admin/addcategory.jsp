<%-- 
    Document   : addcategory
    Created on : Mar 4, 2014, 12:35:31 AM
    Author     : jeffwan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Category Page</title>
    </head>
    <body>
        
        <form action="${pageContext.request.contextPath }/admin/CategoryServlet?method=add" method="post">
            Category Name:<input type="text" name="categoryName"><br/>
            Category Description: <textarea rows="5" cols="40" name="description"></textarea><br/>
            <input type="submit" value="Add">
        </form>
        
    </body>
</html>
