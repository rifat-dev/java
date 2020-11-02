/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class Palindorm {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        String name=n.nextLine();
        char ch[]=name.toCharArray();
        int size=ch.length;
        char c[]=new char[size];
        for (int i = 0; i!=size; i++) {
            c[size-1-i]=ch[i];
        }
        for (int i = 0; i!=size; i++) {
            if(c[i]!=ch[i]){
                System.out.println("No");
                System.exit(0);
            }
            else{
                continue;
            }  
        }
        System.out.println("Yes");
    }
}
