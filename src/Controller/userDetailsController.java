/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class userDetailsController {
    
      public static void addUserDetails (String userID, String username , String gender, String designation ,String Address, String Telephone, String type , String email, String DateOfBirth)
   {
          new Model.AddUserDetails().addUserDetails(userID, username, gender, designation, Address, Telephone,type, email, DateOfBirth);
       
      JOptionPane.showMessageDialog(null," Add recodes to User ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }
      
}
