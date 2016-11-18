/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dws.servlets;

import com.dws.domain.Cancion;
import com.dws.service.CancionServiceLocal;
import java.io.IOException;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alumno
 */
public class CrearCancion extends HttpServlet {

    @EJB
    private CancionServiceLocal cancionService;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
//             <!--public Cancion(String idCancion, String nombre, String album, String artista, int duracion, int ano, Double precio) {-->

            
            ArrayList<Cancion> canciones = cancionService.listCanciones();
            
            int maxId = 0;
            for (Cancion cancion : canciones) {
                if (cancion.getIdCancion() >= maxId) {
                    maxId = cancion.getIdCancion();
                }
            }
            maxId++;
            String nombre = request.getParameter("nombre");
            String album = request.getParameter("album");
            String artista = request.getParameter("artista");
            int ano =Integer.parseInt(request.getParameter("ano"));
            int duracion =Integer.parseInt(request.getParameter("duracion"));
            Double precio =Double.parseDouble(request.getParameter("precio"));
            
            Cancion c = new Cancion(maxId,nombre, album, artista, duracion, ano, precio );
            canciones.add(c);
            request.getSession().setAttribute("canciones", canciones);
            
            RequestDispatcher rd = request.getRequestDispatcher("/listarCanciones.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
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
