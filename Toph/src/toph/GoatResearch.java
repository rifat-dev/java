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
public class GoatResearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        for (int i =0; i <=N; i++) {
            String name=sc.nextLine();
            char a[]=name.toCharArray();
            int size=a.length;
            if(size%2!=0){
                for (int j = 0; j <size; j++) {
                     if(j==0){
                         System.out.print(" "+a[j]);
                     }else{
                         System.out.print(a[j]+"");
                     }
                }
            }else{
                size++;
                a[size]='a';
                for (int j = 0; j <size; j++) {
                    if(j==0){
                        System.out.println(" "+a[j]);
                    }else{
                        System.out.println(a[j]+"");
                    }
                }
            }
        }
    }
}
