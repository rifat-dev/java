/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

/**
 *
 * @author Md Rifat
 */
public class School {
    public static void main(String[] args) {
        Student std1 =new Student("Tajul Islam",123,12);
        std1.display();
        Student std2 =new Student("Tajul Islam Rifat",124,12);
        std2.display();
        Student.setSchool("Daffodial International School");
        std1.setRoll(5);
        
        System.out.println("\nAfter changing static value");
        std1.display();
        
        System.out.println("\nCreating obj array");
        Student arr[]=new Student[10];
        arr[0]=new Student("Arafat",121,8);
        
        arr[0].display();
        
       
    }
}
