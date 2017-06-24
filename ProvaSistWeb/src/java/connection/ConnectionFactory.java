/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael Gomes
 */
public class ConnectionFactory {
    
    public Connection getConnection() {

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/SWII5_PROVA_RAFAELFERREIRAGOMES", "root", "root");
        } 
        catch(ClassNotFoundException | SQLException e) {
        
            throw new RuntimeException(e);
        
        }
    }
    
}
