<%-- 
    Document   : edit_person_outcome
    Created on : 07-Apr-2025, 21:23:17
    Author     : Hello
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Person Outcome Page</title>
    </head>
    <body>
        <h1>Edit Person Outcome</h1>
        <%
            Long id=(Long)request.getAttribute("id");
            String surname=(String)request.getAttribute("surname");
        %>
        <p><%=id%> <b><%=surname%></b> is successfully changed in the database.</p>
        <a href="menu.html"><button>To Menu</button></a>
    </body>
</html>
