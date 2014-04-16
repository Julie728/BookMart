<%-- 
    Document   : admin
    Created on : Mar 4, 2014, 12:20:34 AM
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
  	<frame src="${pageContext.request.contextPath }/admin/head.jsp" name="head">
  
  	<frameset cols="15%,*">
	  	<frame src="${pageContext.request.contextPath }/admin/left.jsp" name="left">
	  	<frame src="${pageContext.request.contextPath }/admin/body.jsp" name="body">
  	</frameset>
  
  </frameset>
    
    
    
</html>
