/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author Md Rifat
 */
public class Person {
    private String name;
    private int age;
    private String nid;
    private String gender;

    public Person(String name, int age, String nid, String gender) {
        this.name = name;
        this.age = age;
        this.nid = nid;
        this.gender = gender;
    }
    
    void show(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("NID : "+this.nid);
        System.out.println("Gender : "+this.gender); 

    }
    public void talking(){
        System.out.println("Every Person can talk..");
    }
    
    public void eating(){
        System.out.println("Every person can eate...");
    }
}
