/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class Nthprime {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        int N,b=0,k=0;
        N = input.nextInt();
        for (int i =1; i <500000; i++) {
            for (int j =1; j <500000; j++) {
                if(i%j==0){
                b++;
            }
          }
            if(b==2){
                k++;
                if(k==N){
                    System.out.println(i+"");
                    System.exit(0);
                }
            }
            b=0;
       }
    }
}
