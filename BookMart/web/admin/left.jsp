<%-- 
    Document   : left
    Created on : Mar 4, 2014, 12:21:09 AM
    Author     : jeffwan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h4>Category Management</h4>
        <a href="${pageContext.request.contextPath }/admin/addcategory.jsp" target="body">Add Category</a><br/>
        <a href="${pageContext.request.contextPath }/admin/CategoryServlet?method=listall" target="body">List Category</a>
        
        
    </body>
</html>
