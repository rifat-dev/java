/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class PalindromicNamingConvention {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int T=n.nextInt();
        n.nextLine();
        for (int i = 0; i <T; i++) {
              String name=n.nextLine();
        char ch[]=name.toCharArray();
        int size=ch.length;
        char c[]=new char[size];
        int same=0;
        for (int j = 0; j <size; j++) {
            if(ch[j]==ch[0]){
                same++;
            }
        }
        int k=0;
        if(same==size){
            for (int j = 0; j <1; j++) {
                c[j]=ch[j];
                k++;
            }
        }else{
          for (int j = 0; j<size-1; j++) {
            c[size-1-j]=ch[j];
            k++;
             }
        }
        
        
        for (int j = 0; j <size; j++) {
            System.out.print(ch[j]+"");
        }
        System.out.print(" ");
        for (int j = 0; j <=k; j++) {
            System.out.print(c[j]+"");
        }
        }
        
        
    }
}
