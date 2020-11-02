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
public class LowerToUppercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write something in lowercase:");
        String str = in.nextLine();
        char ch[] = str.toCharArray();
        int size=ch.length;
        
        
        for (int i = 0; i <size; i++) {
            if(ch[i]!=' '){
              ch[i] = (char)(ch[i]-32);
            }
            
        }
        System.out.println(str);
        System.out.println();
        System.out.println(ch);
    }
}
