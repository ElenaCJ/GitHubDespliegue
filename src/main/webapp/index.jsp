<%@page language ="java"  contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
         <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <div class="contenido">
            <nav>
                <button class="navegacion">
                    <a href="${pageContext.request.contextPath}/RegistrarPais.jsp">Registrar Ciudad</a>
                </button>
                <button class="navegacion">
                    <a href="${pageContext.request.contextPath}/Controlador?operacion=listarCiudades">Listado Ciudades</a>
                </button>
            </nav>
        </div>
    </body>
</html>
