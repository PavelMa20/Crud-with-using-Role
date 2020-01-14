<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Main</title>
</head>
<body>
<h1>Main</h1>
<form action="/" method="post">
    <table border="1" cellpadding="5">

        <tr>
            <td>Login</td>
            <td><input type="text" name="login" /></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password" /></td>
        </tr>

    </table>
    <input type="submit" value="Login" /></form>
<p>Message: ${message}</p>
</body>
</html>
