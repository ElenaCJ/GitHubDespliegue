/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package datos;

import dao.DaoCiudad;
import dao.DaoPais;
import entidades.Ciudad;
import entidades.Pais;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author admin
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

@Resource (name="jdbc/ProyectoPaloma")
DataSource dataSource;
  
private static final long serialVersionUID = 1L;

public Controlador(){
super();
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String operacion = request.getParameter("operacion");
        switch (operacion) {
            case "listarCiudades":
                DaoCiudad daoC = new DaoCiudad();
                try {
                    List<Ciudad> listado = daoC.listarCiudades(dataSource.getConnection());
                    request.setAttribute("listadoCiudades", listado);
                    request.getRequestDispatcher("ListadoCiudades.jsp").forward(request, response);
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        
String operacion = request.getParameter("operacion");

        switch (operacion) {
            case "registrarPais":
                String mensajeConfirmacion = "Registro realizado correctamente.";
                String codigo = request.getParameter("code");
                request.setAttribute("codigo", codigo);
                String nombre = request.getParameter("nombre");
                request.setAttribute("nombre", nombre);
                String continente = request.getParameter("continente");
                request.setAttribute("continente", continente);
                String region = request.getParameter("region");
                request.setAttribute("region", region);
                try {
                    Pais pais = new Pais();
                    pais.setCode(codigo);
                    pais.setName(nombre);
                    pais.setContinent(continente);
                    pais.setRegion(region);
                    DaoPais daoP = new DaoPais();
                    daoP.registrarPais(pais, dataSource.getConnection());
                    request.setAttribute("confirmacion", mensajeConfirmacion);
                    request.getRequestDispatcher("RegistrarPais.jsp").forward(request, response);
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    }

 
}
