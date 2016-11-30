<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <style>
            div.login {
                position: absolute;
                top: 50%;
                left:50%;
                transform: translate(-50%, -50%);
                -webkit-transform: translate(-50%, -50%);
                border: 2px solid grey;
                border-radius: 22px;
                background-color: lightgrey;
            }
        </style>
    </head>
    <body style="background-color: beige">
        <%
            Cookie cookies[] = request.getCookies();
            String usuario = "", password = "";
            if (cookies != null) {
                for (Cookie lista : cookies) {
                    if (lista.getName().equalsIgnoreCase("usuario")) {
                        usuario = lista.getValue();
                    }
                    if (lista.getName().equalsIgnoreCase("password")) {
                        password = lista.getValue();
                    }
                }
            }
        %>
        <div class="login">
            <div style="padding: 50px;">
                <h1 style="font-family: Arial;text-align: center;margin-top: -10px;margin-bottom: 50px;">Login</h1>
                <form action="entradaLogin" method="post">
                    <p style="font-family: Arial;margin-bottom: 5px;text-align: center">Usuario</p>
                    <input style="margin-bottom: 5px;" type="text" name="usuario" value="<%=usuario%>" />
                    <p style="font-family: Arial;margin-bottom: 5px;text-align: center">Contraseña</p> 
                    <input style="margin-bottom: 15px;" type="password" name="password" value="<%=password%>" /><br>
                    <p style="font-family: Arial"><input style="font-family: Arial" name="rememberBox" type="checkbox" />Recordar datos</p>
                    <input style="margin-left: 60px;margin-top: 10px;" type="submit" name="button" value="Entrar" />
                </form>
            </div>
        </div>
    </body>
</html>