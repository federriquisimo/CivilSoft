/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Model.*;

@WebServlet(name = "registro", urlPatterns = {"/registro"})

public class registro extends HttpServlet {
    
protected void processRequest(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException {
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    try {
        String nombre1 = request.getParameter("nombre1");
        String nombre2= request.getParameter("nombre2");
        String ap1= request.getParameter("ap1");
        String ap2= request.getParameter("ap2");
        String email = request.getParameter("email");
        String company= request.getParameter("company1");
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        System.out.print(nombre1);
        GestorBD gestorBD = new GestorBD();
       if (gestorBD.registrar(nombre1, nombre2, ap1, ap2,email,company,usuario,password)){
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        else
        
          System.out.print("No se guardó");
          request.getRequestDispatcher("/index.html").forward(request, response);
        
    } finally {
    out.close();
    }
}

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
