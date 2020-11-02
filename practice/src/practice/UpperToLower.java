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
public class UpperToLower {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
     System.out.println("Write something Uppercase :"); 
    String str=input.nextLine();
    char ch[]=str.toCharArray();
    int size=ch.length;
    
        for (int i = 0; i <size; i++) {
            if(ch[i]!=' '){
                ch[i]=(char)(ch[i]+32);
            }
        }
        System.out.println("Lower case :");
        System.out.println(ch);
    }
    
}
