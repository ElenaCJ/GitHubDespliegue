/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Pais;
import java.sql.*;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class DaoPais {

    public DaoPais() {
    }

    public void registrarPais(Pais pais, Connection con) throws SQLException, Exception {
        PreparedStatement ps = null;
        
        try {
            con.setAutoCommit(false);
            String sqlQuery = "insert into country values (?,?,?,?)";
            ps = con.prepareStatement(sqlQuery);
            ps.setString(1, pais.getCode());
            ps.setString(2, pais.getName());
            ps.setString(3, pais.getContinent());
            ps.setString(4, pais.getRegion());

            con.commit();
            ps.close();
            con.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            throw sqle;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}
