/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problempractice;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class OccuringChar {
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
        System.out.println("Write something");
            String vowel=in.nextLine();
            char ch[]=vowel.toCharArray();
            int size=ch.length;
            int count=0;
            int k=0;
            char max=' ';
          char ch1[]=new char[size];
            for (int i = 0; i <size; i++) {
                count=1;
            for (int j =i+1; j <size; j++) {
                if(ch[i]==ch[j]){
                    if(ch[j]!=(char)48){
                        ch[j]=(char) 48;
                        count++;
                    }
                    
                }  
            }
            if(ch[i]!=(char)48){
                 if(count>k){
                 k=count;
                 max=ch[i];
                 
             }
            }
            
            count=0;  
      
       }
        
         System.out.println("Maximum Occurring char = "+max);
        System.out.println(k); 
    }
}
