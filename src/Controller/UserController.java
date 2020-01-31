/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Student
 */
import javax.swing.JOptionPane;

public class UserController {
    
    public static void login (String UID , String username, String password, String conformpassword)
   {
       new Model.CreateUser().login(UID,username,password,conformpassword);
       
      JOptionPane.showMessageDialog(null,"You Have Create a New Your Account", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }

}