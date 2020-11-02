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
public class NthPrime {
    public static int prime[]=new int[10000100];
    static void isprime(){
	for( int i = 2 ; i <= 10000000 ; i ++ ) {
              if(prime[i]!=1){             
		for( int j = 2 ; i*j <= 10000000 ; j ++ ) {
			prime[ i*j ] = 1 ; 
		}
              }
	}  
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int N;
        int count=0;
        N=sc.nextInt();
        isprime();
        for( int i =2 ; i <=10000000 ; i ++ ) {
                 if(prime[i]==0){
                     count++;
                     if(count==N){
                         System.out.println(i+"");
                     }
                 }
	}
   
    }
}
