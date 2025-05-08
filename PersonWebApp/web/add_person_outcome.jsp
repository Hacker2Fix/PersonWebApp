<%-- 
    Document   : add_person_outcome
    Created on : 07-Apr-2025, 11:13:56
    Author     : Hello
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add person outcome Page</title>
    </head>
    <body>
        <h1>Add person outcome</h1>
        <%
            String name=(String)request.getAttribute("name");
            String surname=(String)request.getAttribute("surname");
        %>
        <p><%=name%> <%=surname%> has been stored in the database.</p>
        <a href="menu.html"><button>To Menu</button></a>
    </body>
</html>
