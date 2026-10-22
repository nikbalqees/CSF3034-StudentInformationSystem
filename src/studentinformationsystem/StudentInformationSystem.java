/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author ASUS
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Name: Nik Nur Balqees binti Nik Ahmad Suhaidi");
        System.out.println("Student ID: S87365");
        
       // Store two marks
        int mark1 = 85;
        int mark2 = 90;

        // Calculate total mark
        int total = mark1 + mark2;

        // Display student information
        System.out.println("Student Information System");
        System.out.println("---------------------------");
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + total);
        
         // Display result message
        if (total >= 160) {
            System.out.println("Result: Excellent");
        } else if (total >= 100) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
}
 
   