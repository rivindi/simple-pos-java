/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Statement;

/**
 *
 * @author user
 */
public class editUserDetail {
    Statement stmt;
    
    public void editUser(String userID, String username , String gender, String designation ,String Address, String Telephone, String email, String DateOfBirth)
    {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE user SET  username='"+username+"',gender='"+gender+"',designation='"+designation+"',Address='"+Address+"',Telephone='"+Telephone+"',email='"+email+"',DateOfBirth='"+DateOfBirth+"'  WHERE userID='"+userID+"' ");
           
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
