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
public class SieveOfEratosthenes {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=1000100;
        int b[]=new int[N];
        b[0]=b[1]=1;
        int i=2;
        while(i*i<N){
            if(b[i]!=1){
                for (int j =2; j*i<N; j++) {
                    b[i*i]=1;
                }
            }
            i+=1;
        }
        int input=sc.nextInt();
        int num;
        for (int j = 0; j <input; j++) {
            num=sc.nextInt();
            if(b[num]==0){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
        }
       

    }
}
