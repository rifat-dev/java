/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogramming;

import java.util.Scanner;
/**
 *
 * @author Md Rifat
 */
public class CoinCgange {
       public static int coin[];
       public static int m[];
       public static int ci[];
       
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Coin size: ");
        int c=sc.nextInt();
        coin=new int[c];
        for (int i = 0; i <c; i++) {
            System.out.println("Enter your Coins : ");
            coin[i]=sc.nextInt();
        }
        System.out.println("Enter Your Amount : ");
        int A=sc.nextInt();
        m=new int[A+1];
        ci=new int[A+1];
        m[0]=0;
        ci[0]=0;
        for (int i =1; i <=A; i++) {
            for (int j = 0; j <c; j++) {
               int  M=i-coin[j];
               if(M>=0){
                 if(m[M]!=Integer.MAX_VALUE){
                   if((m[i]>m[M]+1)||(m[i]==0)){
                     m[i]=m[M]+1;
                     ci[i]=coin[j];
                   }
                   
               }
            }else{
                  if((m[i]<1)){
                    m[i]=Integer.MAX_VALUE;
                   ci[i]=-1;
                  }
               }
        }
    }
        
        System.out.println("Output : ");
        for (int i = 0; i <=A; i++) {
            System.out.print(m[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <=A; i++) {
            System.out.print(ci[i]+" ");
        }
        System.out.println();
        System.out.println("Coin Use :");
        int i=A;
        while(i!=0){
            System.out.print(ci[i]+"->");
            i=i-ci[i];
        }
        
     
        
 }
}
