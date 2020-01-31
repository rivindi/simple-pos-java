/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author user
 */
public class CreateUser {
    Statement stmt;
    
    public void login(String UID , String username, String password, String conformpassword)
    {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO login VALUES ('"+UID+"','"+username+"','"+password+"','"+conformpassword+"')");
           
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void student(String name, String address, String gender, String age) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

