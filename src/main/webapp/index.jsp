<%--
  Created by IntelliJ IDEA.
  User: Andrey
  Date: 30.03.2016
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${textA}
${textB}
<h1>Вход в систему</h1>
<form action="CheckUser" method="get">
    Пользователь: <input type="text" name="user" size="10"><br>
    Пароль: <input type="password" name="password" size="10"><br>
    <p>
    <table>
        <tr>
            <th><small>
                <input type="submit" name="login" value="Войти в систему">
            </small>
            <th><small>
                <input type="submit" name="registration" value="Зарегистрироваться">
            </small>
    </table>
</form>
</body>
</html>
