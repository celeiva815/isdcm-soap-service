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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <% 
        SearchVideoService s = new SearchVideoService();
        s.findVideoByTitle("thor dark");
            %>
        
    </body>
</html>
