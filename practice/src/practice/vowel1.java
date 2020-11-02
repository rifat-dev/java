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
public class vowel1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Write something");
            String vowel=in.nextLine();
            char ch[]=vowel.toCharArray();
            int size=ch.length;
            
            int count=0;
            for (int i = 0; i <size; i++) {
            if(ch[i]=='a'||ch[i]=='A'||ch[i]=='E'||ch[i]=='e'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='u'||ch[i]=='U'){
                count++;
            }

        }
       
            System.out.println("Total Vowel ="+count);
        
    }
}
