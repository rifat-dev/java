/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class BigFactorials {
   static int fact(int n){
       int r;
       if(n==0){
           return 1;
       }
       else{
           return r =(n*fact(n-1))%10000;
       }
   }
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
           int n=scn.nextInt();
           int b =fact(n);
           System.out.println(b);
    }
}
