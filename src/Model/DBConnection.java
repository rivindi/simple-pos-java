/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author Student
 */

public class DBConnection {
    
    static Connection conn;
    static Statement stat= null;
    
    public static Statement getStatementConnection()
    {
        try{
            //establish the connection
            String url="jdbc:mysql://localhost:3306/pos";
            
            conn= (Connection) DriverManager.getConnection(url,"root","");
            
            //create the connection
                stat= (Statement) conn.createStatement();
            
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return stat;
    }
    
    //close the connection
    
    public static void closecon() throws SQLDataException, SQLException {
        conn.close();
        
    }
}
