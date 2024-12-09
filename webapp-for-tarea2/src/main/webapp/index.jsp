<%--
  Created by IntelliJ IDEA.
  User: rodri
  Date: 4/12/2024
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%
    List<String> errores = (List<String>)request.getAttribute("errores");
%>
<html>
<head>
    <title>Tarea</title>
</head>
<body>

<h1>Tarea 2 Api Servlet</h1>

<%
    if(errores != null && errores.size()>0){
%>
<%for (String error : errores) {%>

<p><%=error%></p>


<%}%>
<%}%>

<form action="/webapp-for-tarea2/crear" method="get">

    <div class="row mb-3">
        <label for="nombre" class="col-form-label col-sm-2">Nombre</label>
        <div class="col-sm-4">
            <input type="text" name="nombre" id="nombre" class="form-control" value="${param.nombre}">
        </div>
    </div>

    <div class="row mb-3">
        <label for="precio" class="col-form-label col-sm-2">Precio</label>
        <div class="col-sm-4">
            <input type="number" name="precio" id="precio" class="form-control" value="${param.precio}">
        </div>
    </div>

    <div class="row mb-3">
        <label for="fabricante" class="col-form-label col-sm-2">Fabricante</label>
        <div class="col-sm-4">
            <input type="text" name="fabricante" id="fabricante" class="form-control" value="${param.fabricante}">
        </div>
    </div>

    <div class="row mb-3">
        <div class="col-sm-4">
            <input type="submit" value="Enviar">
        </div>
    </div>

</form>

</body>
</html>
