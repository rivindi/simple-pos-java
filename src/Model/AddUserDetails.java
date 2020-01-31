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
public class AddUserDetails {
    
     Statement stmt;
    
    public void addUserDetails(String userID, String username , String gender, String designation ,String Address, String Telephone,String type, String email, String DateOfBirth)
    {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO user VALUES ('"+userID+"','"+username+"','"+gender+"','"+designation+"','"+Address+"','"+Telephone+"','"+type+"','"+email+"','"+DateOfBirth+"')");
           
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
