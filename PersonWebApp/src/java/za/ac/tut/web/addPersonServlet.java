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
public class addPersonServlet extends HttpServlet {

    @EJB private PesronFacadeLocal pfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name=request.getParameter("name");
        String surname=request.getParameter("surname");
        String gender=request.getParameter("gender");
        
        Pesron person = createPerson(name,surname,gender);
        pfl.create(person);
        request.setAttribute("name", name);
        request.setAttribute("surname", surname);
        
        RequestDispatcher disp=request.getRequestDispatcher("add_person_outcome.jsp");
        disp.forward(request, response);
    }

    private Pesron createPerson(String name, String surname, String gender) {
        Pesron p= new Pesron();
        p.setName(name);
        p.setSurname(surname);
        p.setGender(gender);
        return p;
    }

}
