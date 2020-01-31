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

public class StudentController {
    
   public static void Student (String name , String address, String gender, String age)
   {
       new Model.AddRecordToUser().Student(name,address,gender,age);
       
      JOptionPane.showMessageDialog(null,"wede hari", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
   }
}
