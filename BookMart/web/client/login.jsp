<%-- 
    Document   : login
    Created on : Apr 3, 2014, 7:55:36 PM
    Author     : yanma
    Description: this is a login page for both customers and admins. So, all of username, password and usertype should be
                exactly the same with the database. Otherwise, the login will be rejected.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BookMart Login</title>
    </head>
    <body>
        <h1>Welcome</h1>
        <div>
            <form action="" method="get">
                <p>Username</p>
                <input type="text" id="username" name="username" placeholder="Username" /><br>
                <p>Password</p>
                <input type="password" id="pwd"  name="pwd" placeholder="Password" /><br>
                <select name="usertype">
                    <option name="usertype" value="client">Client</option>
                    <option name="usertype" value="admin">Administrator</option>
                </select>
                <br>
                <input type="submit" value="Submit" name="submit" />
            </form>
            
            <%
                String username = 
            %>
        </div>
        
    </body>
</html>
