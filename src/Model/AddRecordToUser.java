/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author Student
 */
public class AddRecordToUser {
    Statement stmt;
    
    public void Student(String name , String address, String gender, String age)
    {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO student VALUES ('"+name+"','"+address+"','"+gender+"','"+age+"')");
           
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

//    public void Student(String name, String address, String gender, String age) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public void login(String UID, String username, int password, int conformpassword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Create_AddUser(String UID, String username, int password, int conformpassword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
