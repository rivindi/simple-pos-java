/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;


/**
 *
 * @author Student
 */
public class DBSearch {
     Statement stmt;
     ResultSet rs;
    
    public ResultSet searchLogin(String usName)
    {
        try {
            stmt = DBConnection.getStatementConnection();
            String name = usName;
             
            //Execute the query
            rs =stmt.executeQuery( "Select * From login Where username='"+name+"'");
            
        }
        
        catch (Exception e)
        {
          e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet searchusers() {
        try {
            stmt = DBConnection.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM user");
            
        }
        
        catch(Exception e)
        {
            
        }
         return rs;
    }
    
    public ResultSet editusers() {
        try {
            stmt = DBConnection.getStatementConnection();
            rs =stmt.executeQuery("SELECT * FROM user");
            
        }
        
        catch(Exception e)
        {
            
        }
         return rs;
    }
}
