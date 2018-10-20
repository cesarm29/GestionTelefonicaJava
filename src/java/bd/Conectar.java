/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author cesar1
 */
public class Conectar {
     static Connection cnn;
    private static void conectar() throws Exception {
       
            Class.forName("com.mysql.jdbc.Driver"); 
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabinas", "root", "cesar"); 
        
    }
     public static Connection getInstace()throws Exception {
            
        if (cnn == null) {
            conectar();
        }
        return cnn;
    }

}
