<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado Paginado Ciudades</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
       <div class="contenido">
           <table class="tabla tablaCebra bordeTabla">
               <caption>Listado de Ciudades</caption>
               <tr>
                   <th scope="col">ID</th>
                   <th scope="col">NOMBRE</th>
                   <th scope="col">DISTRITO</th>
                   <th scope="col">POBLACION</th>
               </tr>
               
               <c:forEach items="${requestScope.listadoCiudades}" var="ciudad">
                   <tr>
                       <td class="textoDer">${ciudad.id}</td>
                       <td class="textoCen">${ciudad.name}</td>
                       <td class="textoCen">${ciudad.district}</td>
                       <td class="textoCen">${ciudad.population}</td>
                   </tr>
               </c:forEach>
           </table>
       </div>
    </body>
</html>
