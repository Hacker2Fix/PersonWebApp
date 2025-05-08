<%-- 
    Document   : search_person_outcome
    Created on : 07-Apr-2025, 21:55:36
    Author     : Hello
--%>

<%@page import="za.ac.tut.entities.Pesron"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search person outcome Page</title>
    </head>
    <body>
        <h1>Search person outcome</h1>
        <%
            Pesron p=(Pesron)request.getAttribute("person");
            String name=p.getName();
            String surname=p.getSurname();
            String gender=p.getGender();
            String g="Femal";
            
            if(gender.equalsIgnoreCase("m")){
                g="Male";
            }
        %>
        <p>Search result below.</p>
        <table>
            <tr>
                <td><b><%=name%></b></td>
                <td><b><%=surname%></b></td>
                <td><b><%=g%></b></td>
            </tr>
        </table>
            <br>
            <br>
        <a href="menu.html"><button>To Menu</button></a>
    </body>
</html>
