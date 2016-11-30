<%-- 
    Document   : BibliotecaUser
    Created on : 25-nov-2016, 10:20:52
    Author     : alumno
--%>

<%@page import="com.dws.domain.User"%>
<%@page import="com.dws.domain.Cancion"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>        
         <%
//             String nombre = (String) request.getParameter("user");
//                User usuario = (User) request.getAttribute("user");
//                ArrayList<Cancion> canciones = usuario.getBiblioteca();
             %> 
        
             <h1>Listado de Canciones de</h1><br>

        <table border="1">
            <tr>
               
                <th>Nombre</th>
                <th>Album</th>
                <th>Artista</th>
                <th>Duración</th>
                <th>Año</th>
                <th>Precio</th>
                <th></th>
            </tr>
            <% // for (Cancion c : canciones) {

//                    int id = c.getIdCancion();
//                    String nombre = c.getNombre();
//                    String album = c.getAlbum();
//                    String artista = c.getArtista();
//                    int duracion = c.getDuracion();
//                    int ano = c.getAno();
//                    Double precio = c.getPrecio();

            %> 
            
            <tr>
               <th>Nombre</th>
                <th>Album</th>
                <th>Artista</th>
                <th>Duración</th>
                <th>Año</th>
                <th>Precio</th>
                <th></th>
            </tr>
            
            
            <%//}%>
            
                 


        </table>
            <br>
            <a href="index.jsp">Volver a inicio</a>
        
    </body>
</html>
