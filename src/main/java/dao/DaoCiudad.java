/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Ciudad;
import java.util.*;
import java.sql.*;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class DaoCiudad {
    
    public DaoCiudad() {
        
    }
    
    public List<Ciudad> listarCiudades(Connection con) throws SQLException, Exception {
        Statement s = null;
        ResultSet rs = null;
        List<Ciudad> listadoCiudades = new ArrayList<>();
        try {
            String sqlQuery = "select * from city";
            s = con.createStatement();
            rs = s.executeQuery(sqlQuery);

            while (rs.next()) {
                Ciudad city = new Ciudad();
                city.setId(rs.getLong("ID"));
                city.setName(rs.getString("Name"));
                city.setDistrict(rs.getString("District"));
                city.setPopulation(rs.getLong("Population"));
                listadoCiudades.add(city);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            throw sqle;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (s != null) {
                s.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return listadoCiudades;
    }
}
