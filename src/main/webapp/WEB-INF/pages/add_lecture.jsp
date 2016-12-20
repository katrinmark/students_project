<%--
  Created by IntelliJ IDEA.
  User: Ekaterina
  Date: 18.12.2016
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавить группу</title>
</head>
<body>
<form method="post" action="/lecture/add">
    <table>
        <tr>
        <td>Название лекции:</td>
        <td><input name="name" type="text"></td>
    </tr>
    </table>
    <button type="submit">Сохранить</button>
</form>
</body>
</html>
