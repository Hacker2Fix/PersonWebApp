/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class GetListServlet extends HttpServlet {

    @EJB private PesronFacadeLocal pfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Pesron> personList =pfl.findAll();
        request.setAttribute("personList", personList);
        
        RequestDispatcher disp=request.getRequestDispatcher("List_outcome.jsp");
        disp.forward(request, response);
    }

}
