/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

class person{
    String name;
    int num;
    
    void display(){
        System.out.println("My Name Is "+name+" Roll number "+num);
    }
}

public class Classes {
    public static void main(String[] args) {
        person p1=new person();
        p1.name="MD Rifat";
        p1.num=120;
        p1.display();
       
    }
}
