<%-- 
    Document   : service_tester
    Created on : Apr 7, 2018, 2:13:33 PM
    Author     : Tito
--%>

<%@page import="services.SearchVideoService"%>
<%@page import="utils.MySqlConnector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Servicio SOAP</title>
    </head>
    <body>
        <h1>Bienvenido al servicio de Videos</h1>
        <p>Este sitio provee una API en SOAP para la búsqueda de videos subidos
        en el proyecto de la Fase 1. Esperamos que funcione! </p>
        <% 
        SearchVideoService s = new SearchVideoService();
        s.findVideoByYear(2018);
            %>
        
    </body>
</html>
