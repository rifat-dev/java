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
public class vowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write somethinng :");
        String name = input.nextLine();
        char ch[]=name.toCharArray();
        int count=0;
        for(char c : ch){
            if(c=='a'||c=='A'||c=='E'||c=='e'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                count++;
               
            }
        }
         System.out.println("vowel = "+count);
       
    }
}
