<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Inscription</title>
<link rel="stylesheet" href="ins.css">
</head>

<body>

<form action="sins" method="post">

<div class="inscription">
<h1>Inscription </h1>

<div class="textbox">
<input type ="text" placeholder="username" name="username" value="">
</div>

<div class="textbox">
<input type ="password" placeholder="password" name="password" value="">
</div>

<div class="textbox">
<input type ="text" placeholder="adress" name="adress" value="">
</div>

<div class="textbox">
<input type ="text" placeholder="numero" name="numero" value="">
</div>


<div class="select">
   <select name="role" id="format">
   
      
      <option value="txt">client</option>
      <option value="txt">vendeur</option>
      
   </select>
</div>


<input class ="btn" type="button" name="register" value="register">
</div>


</form>
</body>
</html>