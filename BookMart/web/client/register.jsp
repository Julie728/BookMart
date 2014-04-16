<%-- 
    Document   : register
    Created on : Apr 3, 2014, 7:54:51 PM
    Author     : yanma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BookMart User Register</title>
        <link rel="stylesheet" href="../bootstrap.min.css">
    </head>
    <body align='center'>
        <h1 class="h1">Register</h1><br>
        <div class="">
            <form method="post" action="${pageContext.request.contextPath }/client/RegisterServlet?method=register">
                <label>Username: </label>
                <input type="text" id="username" name="username" placeholder="Username" class="form-control"/><br><br>
                <label>Password: </label>
                <input type="password" id="pwd"  name="pwd" placeholder="Password" class="form-control"/><br>
                <input type='text' id='usertype' name='userType' value="client" hidden />
                <br>
                <input type="submit" value="Submit" name="submit" class="btn btn-default"/>

            </form>
        </div>
        
    </body>
</html>
