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
                ArrayList<Cancion> canciones = (ArrayList) session.getAttribute("bibliotecaUsuario");
                User usuario = (User) session.getAttribute("usuario");
                String nombreUser = usuario.getNombre();
                for (Cancion c : canciones) {

                    int id = c.getIdCancion();
                    String nombre = c.getNombre();
                    String album = c.getAlbum();
                    String artista = c.getArtista();
                    int duracion = c.getDuracion();
                    int ano = c.getAno();
                    Double precio = c.getPrecio();

            %> 
        
        <h1>Listado de Canciones de <%=nombreUser%></h1><br>
        
        

        <table border="1">
            <tr>
                <th>ID Cancion</th>
                <th>Nombre</th>
                <th>Album</th>
                <th>Artista</th>
                <th>Duración</th>
                <th>Año</th>
                <th>Precio</th>
                <th></th>
                <th></th>
            </tr>
            
            <tr>
                <td><%=id%></td>
                <td><%=nombre%></td>
                <td><%=album%></td>
                <td><%=artista%></td>
                <td><%=duracion%> s.</td>
                <td><%=ano%></td>
                <td><%=precio%> €</td>
                <td><a href="ModificarCancion?accion=editar&id=<%=id%>">Modificar</td>
                <td><a href="EliminaCancion?id=<%=id%>">Borrar</td>
            </tr>


            <%}%>

        </table>
            <br>
            <a href="index.jsp">Volver a inicio</a>
        
    </body>
</html>
