/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class MagicOfSqure {
    static int isPrime(int n){
        int c= (int) sqrt(n);
        for (int i =2; i <=c; i++) {
            if((n%i)==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
       int k = isPrime(n);
       if(k==0){
           System.out.println("Not Prime");
       }else{
           System.out.println("Prime");
       }
    }
}
