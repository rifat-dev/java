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
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        for (int i =3; i <=num; i++) {
            for (int j =2; j <i; j++) {
                if(i%j==0){
                   count++;
                }
            }
            if(count==0){
               System.out.print(i+" ");
            }
            count=0;
        }
    }
}
