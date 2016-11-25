<%-- 
    Document   : listarUsers
    Created on : 17-nov-2016, 19:24:20
    Author     : Gerard
--%>

<%@page import="com.dws.domain.User"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de usuarios</title>
    </head>
    <body>
        <h1>Listado de usuarios</h1>

        <a href="agregarUser.jsp">Agregar Usuario</a><br>

        <table border="1">
            <tr>
                <th>ID Usuario</th>
                <th>Nombre Usuario</th>
                <th>Email</th>
                <th>Contraseña</th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
            <%
                List<User> listaUsuarios = (List) session.getAttribute("users");
                for (User u : listaUsuarios) {

                    String id = u.getIdUser();
                    String nombre = u.getNombre();
                    String email = u.getEmail();
                    String contrasena = u.getPassword();

            %>  
            <tr>
                <td><%=id%></td>
                <td><%=nombre%></td>
                <td><%=email%></td>
                <td><%=contrasena%></td>
                <td><a href="ModificarUser?accion=editar&id=<%=id%>">Modificar</td>
                <td><a href="EliminarUser?id=<%=id%>">Borrar</td>
                <td><a href="BibliotecaUser?id=<%=id%>">Ver Biblioteca</td>
            </tr>


            <%}%>

        </table>
            <br>
            <a href="index.jsp">Volver a inicio</a>
    </body>
</html>
