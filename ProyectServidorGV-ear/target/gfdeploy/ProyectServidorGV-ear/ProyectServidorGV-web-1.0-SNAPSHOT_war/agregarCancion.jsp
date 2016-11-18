<%-- 
    Document   : agregarCancion
    Created on : 18-nov-2016, 10:19:56
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar cancion</title>
    </head>
    <body>

        <h1>Añadir una nueva cancion</h1>
        <form action="CrearCancion" method="POST">
            Nombre: <input type="text" name="nombre" value="" /><br><br>
            Album: <input type="text" name="album" value="" /><br><br>
            Artista: <input type="text" name="artista" value="" /><br><br>
            Duración: <input type="text" name="duracion" value="" /><br><br>
            Año: <input type="text" name="ano" value="" /><br><br>
            Precio: <input type="text" name="precio" value="0.99" /><br><br>
            <input type="Submit" value="Guardar"></input><br>
            

        </form>
        <a href="index.jsp">Volver a inicio</a>
    </body>
</html>
