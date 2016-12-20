<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавить студента</title>
</head>
<body>
<form method="post" action="/student/add">
    <table>
        <tr>
            <td>ФИО:</td>
            <td><input name="name" type="text"></td>
        </tr>
        <tr>
            <td>Номер группы:</td>
            <td><input name="groupName" type="text"></td>
        </tr>
        <tr>
            <td>Эл.почта:</td>
            <td><input name="email" type="text"></td>
        </tr>
        <tr>
            <td>Пароль:</td>
            <td><input name="password" type="password"/></td>
        </tr>
        <tr>
            <td>Повторите пароль:</td>
            <td><input name="passwordConfirm" type="password"/></td>
        </tr>

    </table>
    <button type="submit">Сохранить</button>
</form>
</body>
</html>