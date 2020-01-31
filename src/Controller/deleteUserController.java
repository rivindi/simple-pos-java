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
public class deleteUserController {

    public static void deleteUser(String userID)
    {
        new Model.deleteUserRecord().deleteuser(userID);
        JOptionPane.showMessageDialog(null, "Record has Deleted Successfully");
            
    }
}
