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
        <link rel="stylesheet" href="../bootstrap.min.css">
    </head>
    <body align='center'>
        <h1 class="h1">Welcome to your Book Market</h1><br><br>
        <div>
            <form action="" method="get">
                <label>Username: </label>
                <input type="text" id="username" name="username" placeholder="Username" class='form-control'/><br><br>
                <label>Password: </label>
                <input type="password" id="pwd"  name="pwd" placeholder="Password" class='form-control'/><br><br>
                <label>User &nbsp;type:  </label>
                <select name="usertype" class="form-control">
                    <option name="usertype" value="client">Client</option>
                    <option name="usertype" value="admin">Administrator</option>
                </select>
                <br><br>
                <input type="submit" value="Submit" name="submit" class='btn btn-default'/>&nbsp;&nbsp;&nbsp;
                <input type='reset'  value="Reset"  name='reset'  class="btn btn-default" />
            </form>
            
            
        </div>
        
    </body>
</html>
