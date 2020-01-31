/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBConnection;
import Model.DBSearch;
import View.home;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Frame;
import java.sql.SQLException;
import View.Login;

/**
 *
 * @author Student
 */
public class LoginController {
    public static void login (String usName,String pass)
    {
        try
        {
            String username = null;//initial values of username
            String password= null; //initial value of the password
            
            ResultSet rs = (ResultSet) new DBSearch().searchLogin(usName);
            
            while(rs.next())
            {
                username =rs.getString("username"); //assigning database login name to the variable
                password = rs.getString("upassword"); //assigning data base password to the variable
              
            }
            if (username!= null && password!= null)
            {
                if (password.equals(pass))
                {
                    System.out.println ("Login Successfull");
                    //login.getFrames()[0].dispose();
                    new home().setVisible(true);
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please check the credentials","Error",JOptionPane.ERROR_MESSAGE);
                    
                }
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Please check the credentials","Error",JOptionPane.ERROR_MESSAGE);
                
            }
            DBConnection.closecon();
        }
        catch(SQLException ex)
        {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    
}
