/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class Peladorm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Write something : ");
        String name=input.nextLine();
        name=name.replace(" ","");
        char ch[]=name.toCharArray();
        int size=ch.length;
        char array[]=new char[size];
        for (int i = 0; i !=size; i++) {
            array[size-1-i]=ch[i];
            
        }
        for (int i = 0; i !=size; i++) {
            if(array[i]!=ch[i]){
                System.out.println("Not Palindorm");
                System.exit(0);
            }
            else{
                continue;
            } 
        }
        System.out.println("Palindorm");
        
        
        
    }
}
