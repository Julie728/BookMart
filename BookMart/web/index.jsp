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

            <frameset cols="15%,*">
                <frame src="${pageContext.request.contextPath }/client/browseLeft.jsp" name="left"/>
                <frame src="${pageContext.request.contextPath }/client/body.jsp" name="body"/>
            </frameset>

    </frameset>
    
</html>
