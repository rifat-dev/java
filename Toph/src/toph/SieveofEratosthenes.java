/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class SieveofEratosthenes {
    public static boolean prime[]=new boolean[1000100];
    static void isprime(){
         for (int i = 0; i <=1000000; i++) {
            prime[i]=true;
        }
        prime[0]=prime[1]=false;
        int i = 2 ;
               
        while(i*i <=1000000){
           if(prime[i]==true){
              int j=i*i;
              while(j<=1000000){
                  prime[j]=false;
                  j+=i;
              }
            }
           i++;
        }   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int reng=sc.nextInt();
        int num;
        isprime();
        for( int i = 0 ; i <reng ; i ++ ) {
		num=sc.nextInt();
		if( prime[ num ] != false ) {
	              System.out.println(num+" is a prime number.");
		}
		else {
			System.out.println(num+" is not a prime number.");
		}
	}
    }
}
