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
public class Student {
   private String name;
   private int roll;
   private int section;
   private static String school="victoriya school and clg";

    public Student(String name, int roll, int section) {
        this.name = name;
        this.roll = roll;
        this.section = section;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
    
    public void  display(){
        System.out.println("Section : "+this.section);
        System.out.println("Name : "+this.name);
        System.out.println("Roll : "+this.roll);
        System.out.println("School Name : "+school);
    } 
}
