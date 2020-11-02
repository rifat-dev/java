/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _89_Static_variable;

/**
 *
 * @author Md Rifat
 */
public class Student {
    static int count=0;
    
    Student(){
     count++;
    }
    
    void show(){
        System.out.println("Student = "+count);
    }
}
