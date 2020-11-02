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
public class Stringcopy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write something :");
        String str=in.nextLine();
        char ch[]=str.toCharArray();
        int size = ch.length;
        char a[]=new char[size];
        
        int i=0;
        while(i!=size){
            a[i]=ch[i];
            i++;
        }
        System.out.println(ch);
        System.out.println();
        System.out.println("After copying");
        System.out.println(a);
    }
}
