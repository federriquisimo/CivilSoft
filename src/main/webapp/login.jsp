<%-- 
    Document   : login
    Created on : 28/10/2023, 5:15:19 p. m.
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>CivilSoft</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="./images/favicon.png" type="image/x-icon">
        <link rel="stylesheet" href="./css/normalize.css">
        <link rel="stylesheet" href="./css/estilos.css">
        <script type="text/javascript" src="./script/civilsoft.js"></script>
    </head>
    <body>
        <%@ page import="Controller.login" %>
        <header class="hero">
        <nav class="nav container">
            

            <ul class="nav__link nav__link--menu">
                <li class="nav__items">
                    <a href="index.html" class="nav__links">Inicio</a>
                    
                    
                </li>
                <li class="nav__items">
                    <a href="" class="nav__links">Conócenos</a>
                    
                    <ul class="nav__nuevo">
                        <li >
                        <a href="why.html" class="nav__links">Por qué usar HS</a>
                        <a href="clientes.html" class="nav__links">Clientes</a>
                        </li>
                    </ul>
                    
                    
                    
                </li>
                <li class="nav__items">
                    <a href="modulos.html" class="nav__links">Módulos</a>
                    <ul class="nav__nuevo">
                        <li >
                        <a href="modulos.html" class="nav__links">Edificaciones</a>
                        <a href="inframodulos.html" class="nav__links">Infraestructura</a>
                        </li>
                    </ul>
                    
                    
                </li>
                
                <li class="nav__items">
                    <a href="modulos.html" class="nav__links">BIM</a>
                    <ul class="nav__nuevo">
                        <li >
                        <a href="openproj.html" class="nav__links">Abrir </a>
                        </li>
                    </ul>
                                        
                </li>
                
                <li class="nav__items">
                    <a href="#" class="nav__links">Pedidos</a>
                    
                    
                    <ul class="nav__nuevo">
                        <li >
                        <a href="solicitudes.html" class="nav__links">Solicitudes</a>
                        </li>
                    </ul>
                    
                </li>
                <li class="nav__items">
                    <a href="contacto.html" class="nav__links">Contactos</a>
                </li>
            </ul>
                
        </nav>

        <section class="hero__container container">
            <h1 class="hero__title">Bienvenido a CivilSoft</h1>
            <p class="hero__paragraph">Diseños con profesionalismo</p>
            
        </section>
    </header>
         
       <main>
        <section class=" container_form about">
            
           
                <div id="login">
                    
                    
                    
                    <form id="loginform" action="login" method="post">
                        <input type="text" name="usuario" placeholder="Usuario" required>
                        
                        <input type="password" name="password" placeholder="Ingresa tu contraseña"  required>
                        
                        <button type="submit" title="Ingresar" name="Ingresar" > Login</button>
                    </form>
                    <div class="pie-form">
                        <a onClick="cambiarContraseña()">¿Olvidaste tu contraseña?</a>
                        <a href="registro.jsp">¿Aún no tienes Cuenta? Registrate</a>
                    </div>
                </div>

            
            
        </section>    
       </main>
        
        <footer class="footer">
       
         <section class="footer__copy container">
            <div class="footer__social">
                <a href="#" class="footer__icons"><img src="./images/facebook.svg" class="footer__img"></a>
                <a href="#" class="footer__icons"><img src="./images/twitter.svg" class="footer__img"></a>
                <a href="#" class="footer__icons"><img src="./images/youtube.svg" class="footer__img"></a>
            </div>

            <h3 class="footer__copyright">Derechos reservados &copy; Icaro SAS</h3>
        </section>
       </footer>



    </body>
</html>