/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.PesronFacadeLocal;
import za.ac.tut.entities.Pesron;

/**
 *
 * @author Hello
 */
public class EditPersonServlet extends HttpServlet {

    @EJB private PesronFacadeLocal pfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id=Long.parseLong(request.getParameter("id"));
        String surname=request.getParameter("surname");
        
        Pesron person=editPerson(id,surname);
        pfl.edit(person);
        request.setAttribute("id", id);
        request.setAttribute("surname", surname);
        
        RequestDispatcher disp=request.getRequestDispatcher("edit_person_outcome.jsp");
        disp.forward(request, response);
    }

    private Pesron editPerson(Long id, String surname) {
        Pesron p=pfl.find(id);
        p.setSurname(surname);
        return p;
    }
}
