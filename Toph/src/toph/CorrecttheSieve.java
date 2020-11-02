/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static java.lang.Math.sqrt;
import java.util.Scanner;

public class CorrecttheSieve {
    public static int b[]=new int[10000100];
      static void nThprime(int N){
          for (int i = 0; i <N; i++) {
              b[i]=1;
          }
          b[0]=b[1]=0;
          for (int i =2; i <=N; i++) {
              if(b[i]==1){
                  for (int j =2; j*i<=N; j++) {
                      b[j*i]=0;
                  }
              }
          }
        }
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        int N=1000000;
        int input=sc.nextInt();
        int num;
        nThprime(N);
        for (int j = 0; j <input; j++) {
            num=sc.nextInt();
            if(b[num]==1){
                System.out.println(num+" is a prime number.");
            }else{
                System.out.println(num+" is not a prime number.");
            }
        }
    }
}
