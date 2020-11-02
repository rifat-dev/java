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
public class MaxAndMinemum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Write something");
            String vowel=in.nextLine();
            char ch[]=vowel.toCharArray();
            int size=ch.length;
            int count=0;
            int F=50;
            char min=' ';
            int k=0;
            char max=' ';
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
                  if(F>count){
                     F=count;
                     min=ch[i];
                 }
             }
            
            count=0;  
      
       }
        
         System.out.println("Maximum Occurring char = "+max);
        System.out.println(k); 
         System.out.println("Minimum Occurring char = "+min);
        System.out.println(F); 
    }
}
