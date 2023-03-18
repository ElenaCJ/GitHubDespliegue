

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro País</title>
         <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <div class="contenido">         
            <div class="formularioRegistro">
                <form name="registrarPais" action="${pageContext.request.contextPath}/Controlador" method="post">
                    <fieldset>
                        <legend>Formulario de Registro:</legend>
                        <div class="cuerpoFormulario">
                            <input type="hidden" id="operacion" name="operacion" value="registrarPais"/>
                            <div class="etiqueta">
                                <label for="code">Codigo:</label>
                            </div>
                            <div class="campo">
                                <input type="text" id="code" name="code" placeholder="Introduce iniciales pais" value="${codigo}"/>
                            </div>
                            <div class="cb"></div>
                            
                            <div class="etiqueta">
                                <label for="nombre">Nombre:</label>  
                            </div>
                            <div class="campo">
                                <input type="text" id="nombre" name="nombre" placeholder="Introduce pais" value="${nombre}"/>
                            </div>
                            <div class="cb"></div>
                            
                            <div class="etiqueta">
                                <label for="continente">Continente:</label>
                            </div>
                            <div class="campo">
                                <input type="text" id="continente" name="continente" placeholder="Introduce continente" value="${continente}"/>
                            </div>
                            <div class="cb"></div>
                            
                            <div class="etiqueta">
                                <label for="code">Region:</label>    
                            </div>
                            <div class="campo">
                                <input type="text" id="region" name="region" placeholder="Introduce region" value="${region}"/>
                            </div>
                            <div class="cb"></div>
                                
                            <div class="divBoton">
                                <input class="botonRegistro" type="submit" name="registrar" value="Registrar"/>
                            </div>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
            
            <section class="zonaMensajeria">
                <c:if test="${requestScope.confirmacion != null}">
                    <div class="mensajeConf">
                        <p><strong><c:out value="Mensaje de confirmación:"/></strong></p>
                        <p><c:out value="${requestScope.confirmacion}"/></p>
                    </div>
                </c:if>
                <c:if test="${requestScope.error != null}">
                    <div class="mensajeError">
                        <p><strong><c:out value="Error:"/></strong></p>
                        <p><c:out value="${requestScope.error}"/></p>
                    </div>
                </c:if>
            </section>
        </div>
    </body>
</html>
