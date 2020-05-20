<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Spring MVC 传参方式</title>
</head>
<body>
<h2>form to param1</h2>
<form action="/param1" role="form">
    用户名：<input type="text" name="username"><br/>
    密码：<input type="text" name="password"><br/>
    <input type="submit" value="提  交">
</form>

<h2>form to param2</h2>
<form action="/param2" role="form">
    用户名：<input type="text" name="username"><br/>
    密码：<input type="text" name="password"><br/>
    <input type="submit" value="提  交">
</form>

<h2>form to param3</h2>
<form action="/param3" role="form">
    用户名：<input type="text" name="username"><br/>
    密码：<input type="text" name="password"><br/>
    <input type="submit" value="提  交">
</form>
</body>
</html>