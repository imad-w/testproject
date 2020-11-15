<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

  <head>
    <meta charset="utf-8">
    <title>login</title>
    <link rel="stylesheet" href="index.css">
  </head>
  
  
  <body>
<div class="login-box">
  <h1>Login</h1>
  
  <div class="textbox">
    <i class="fas fa-user"></i>
    <input type="text" placeholder="Username">
  </div>

  <div class="textbox">
    <i class="fas fa-lock"></i>
    <input type="password" placeholder="Password">
  </div>

  <input type="button" class="btn" value="Sign in">
</div>

<form action="http://localhost:8080/yaya/ins.jsp">
    <input type="submit" class="btn1" value="new acount" />
</form>
  </body>
</html>