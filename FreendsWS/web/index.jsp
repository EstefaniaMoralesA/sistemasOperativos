<%-- 
    Document   : index
    Created on : 1/05/2016, 02:21:50 AM
    Author     : Chachi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitar Amigos</title>
    </head>
    <body>
        <form action="FriendsService.jsp">
            <strong>ID del usuario</strong>
            <input type="text" name="user" value="" />
            <input type="submit" value="Enviar" name="submit" />
        </form>
    </body>
</html>
