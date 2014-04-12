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
    </head>
    <body>
        <h1>Register</h1>
        <div>
            <form method="post" action="RegisterServlet">
                <p>Username</p>
                <input type="text" id="username" name="username" placeholder="Username" /><br>
                <p>Password</p>
                <input type="password" id="pwd"  name="pwd" placeholder="Password" /><br>
                <p>User Type</p>
                <select name="usertype">
                    <option value="client">Client</option>
                    <option value="admin">Administrator</option>
                </select>
                <br>
                <input type="submit" value="Submit" name="submit" />

            </form>
        </div>
    </body>
</html>
