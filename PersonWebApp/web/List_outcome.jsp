<%-- 
    Document   : List_outcome
    Created on : 07-Apr-2025, 22:19:11
    Author     : Hello
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Pesron"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get List outcome Page</title>
        <style>
            table{
                border: solid 1px black;
            }
        </style>
    </head>
    <body>
        <h1>Get List</h1>
        <%
            List<Pesron> personList=(List<Pesron>)request.getAttribute("personList");
        %>
        <p>View the entire list below:</p>
        <table>
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>SURNAME</th>
                <th>GENDER</th>
            </tr>
            <%
                for(int i=0;i<personList.size();i++){
                    Pesron p=personList.get(i);
                    Long id=p.getId();
                    String name=p.getName();
                    String surname=p.getSurname();
                    String gender=p.getGender();
                    String g="Femal";

                    if(gender.equalsIgnoreCase("m")){
                        g="Male";
                    }%>
                    <tr>
                        <td><b><%=id%></b></td>
                        <td><b><%=name%></b></td>
                        <td><b><%=surname%></b></td>
                        <td><b><%=g%></b></td>
                    </tr>
                <%}%>
               
            
                
            
        </table>
            <br>
            <br>
        <a href="menu.html"><button>To Menu</button></a>
    </body>
</html>
