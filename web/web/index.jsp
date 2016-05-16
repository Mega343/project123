<%@ page import="com.goit.gojavaonline.testproject.Main" %>
<%@ page import="database.DBWorker" %><%--
  Created by IntelliJ IDEA.
  User: артур
  Date: 14.05.2016
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Онлайн калькулятор</title>
</head>
<%! private int accessCount = 0; %>
<body BGCOLOR="#ffffcc">
<center>
  <h2>Онлайн калькулятор</h2>
  <form action="CalculateServlet" >
    <fieldset style="border:1px #00BFFF solid;" >
    <p>
      Формула: <input type="text" name="formula" size=26>

    <p>
      <input type="submit" value="Расчитать">
      </p>
      </fieldset>
  </form>
</center>


<center><p> Количество обращений к странице с момента загрузки сервера: <%= ++accessCount %> </p></center>
</body>
</html>