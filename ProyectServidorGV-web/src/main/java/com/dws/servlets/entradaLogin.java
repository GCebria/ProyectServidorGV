package com.dws.servlets;

import com.dws.domain.User;
import com.dws.service.UserServiceLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class entradaLogin extends HttpServlet {

    @EJB
    private UserServiceLocal userService;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {

            String checkBoxSelected = request.getParameter("rememberBox");
            Cookie cookieUser, cookiePassword;
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");

            if (checkBoxSelected != null) {
                cookieUser = new Cookie("usuario", usuario);
                cookieUser.setMaxAge(-1);
                response.addCookie(cookieUser);

                cookiePassword = new Cookie("password", password);
                cookiePassword.setMaxAge(-1);
                response.addCookie(cookiePassword);
            }
            
            System.out.println("Entrada");
            System.out.println(usuario);
            System.out.println(password);
            
            
            User usuarioConectado = userService.comprobacionUsuario(usuario, password);
            
            System.out.println(usuarioConectado.getNombre());
            
            if (usuarioConectado == null) {
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            } else if (usuarioConectado.getIdUser().equalsIgnoreCase("1")) {
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("/usuario.jsp").forward(request, response);
            }

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
