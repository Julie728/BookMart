<%-- 
    Document   : index
    Created on : Mar 3, 2014, 11:44:19 PM
    Author     : jeffwan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   
    
    <frameset rows="25%,*">
  	<frame src="${pageContext.request.contextPath }/client/head.jsp" name="head">
  	<frame src="${pageContext.request.contextPath }/client/IndexServlet?method=getAll" name="body">
    </frameset>
    
</html>
