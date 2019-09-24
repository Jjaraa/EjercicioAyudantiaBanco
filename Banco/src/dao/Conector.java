/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dci
 */
public class Conector {
    //Datos deben ser cambiados dependiendo de la base de datos que tengan creada.
    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://localhost/banco";
    static final String USER = "root";
    static final String PASS = "";
    static Connection conn = null;
    static Statement stmt = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    
    
    
    public static boolean conectarDB(){
     try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            stmt = conn.createStatement();

            
        } catch (SQLException se) {
            //Errores de jdbc
            se.printStackTrace();
            return false;
        } catch (Exception e) {

            //Errores de Class.forName
            e.printStackTrace();
            return false;
        } 
        
        return true; 
    
    }
    
   public static void cerrarConexion() throws SQLException{
        stmt.close();
        conn.close();
    }
}
