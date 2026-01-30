/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author BED
 */
public class JavaApplication1 {

    
    public static void main(String[] args) {
        // Step 1: Create the Class
        
        Student s = new Student();
        s.name = "Kazumi Viray";
        s.age = 19;
        s.course = "BSIT";
        
        Student s2 = new Student();
        System.out.println("");
        s2.name = "Kazumi Viray";
        s2.age = 19;
        s2.course = "BSIT";
      
        
        System.out.println("Student Information");
        System.out.println("-------------------");
        s.displayInfo();
        s2.displayInfo();
    } 
}
