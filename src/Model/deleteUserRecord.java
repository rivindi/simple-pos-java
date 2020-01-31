/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
//import net.proteanit.sql.DbUtils;


/**
 *
 * @author user
 */
public class deleteUserRecord {
    Statement stmt;
    
    public void deleteuser(String userID)
    {
        try{
           stmt= DBConnection.getStatementConnection();
           stmt.executeUpdate("DELETE FROM user WHERE userID='"+userID+"' ");
            editUserDetail edit_user= new editUserDetail();
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
//    public void update_table(JTable jt)
//    {
//        try{
//            stmt= DBConnection.getStatementConnection();
//            jt.setModel(DbUtils.resultSetToTableModel(stmt.executeLargeUpdate("SELECT * FROM user")));
//            
//        }
//        
//        catch (Exception e){
//            e.printStackTrace();
//            
//        }
//    }
}
