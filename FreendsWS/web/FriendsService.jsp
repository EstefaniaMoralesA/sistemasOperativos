<%-- 
    Document   : FriendsService
    Created on : 25/04/2016, 08:14:13 PM
    Author     : Chachi
--%>

<%@page import="java.io.*,java.util.*,java.sql.*"%>
<%@page import="javax.servlet.http.*,javax.servlet.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.parser.JSONParser"%>


<sql:query dataSource="jdbc/Freends" var="result">
    SELECT * FROM usuarios, amigos WHERE id_usuario ='<%= request.getParameter("user")%>' AND amigos.id_amigo=usuarios.id;
</sql:query>

<%
    String jsonString = "{\"amigos\":[";
%>

<c:forEach var="row" items="${result.rows}">
    <c:set var="rowName" value="${row.nombre}"/>
    <c:set var="rowFoto" value="${row.foto}"/>
    <%
            String name = (String)pageContext.getAttribute("rowName");
            String foto = (String)pageContext.getAttribute("rowFoto");
            String amigos = "{\"nombre\":\"" + name + "\", \"foto\":\"" + foto + "\"}";
            jsonString = jsonString + amigos + ",";
    %>
</c:forEach>

<%
    jsonString = jsonString.substring(0, jsonString.length()-1);
    jsonString = jsonString + "]}";
    // out.println(jsonString);
    JSONParser parser = new JSONParser();
    JSONObject jsonObj = (JSONObject) parser.parse(jsonString);
    out.println(jsonObj);
%>
