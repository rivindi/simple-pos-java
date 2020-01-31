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
public class editUserController {
        public static void editUser(String userID, String username , String gender, String designation ,String Address, String Telephone, String email, String DateOfBirth)
   {
       new Model.editUserDetail().editUser(userID, username, gender, designation, Address, Telephone, email, DateOfBirth);
          //new Model.editUserDetail(userID, username, gender, designation, Address, Telephone, email, DateOfBirth);
       
      JOptionPane.showMessageDialog(null," Record has Been Updated ", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }
}
