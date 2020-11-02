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
public class TidyBits {
    static int m(int A){
          int b=0,m;
       while(A!=0){
            m=A%2;
            A=A/2;
            if(m!=0){
                b++;
            }             
        }
       return b;
    }
    public static int k[]=new int[1000000];
    static void prime(int A){
        k[0]=k[1]=1;
        for (int i =2; i <=sqrt(A); i++) {
            if(k[i]!=1){
                for (int j =2; j*i <=A; j++) {
                    k[i*j]=1;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int A;
        A=in.nextInt();
        int b=m(A);
        int d=0;
        int c=0;
        prime(A);
         for (int i =2; i <=A; i++) {
               if(k[i]!=1){
                   int k=i;
                while(k!=0){
                    int m1=k%2;
                    k=k/2;
                    if(m1!=0){
                        d++;
                    }
                }
                if(d==b){
                    System.out.print(i+"");
                    System.exit(0);
                }
                d=0;
               }
            }  
        
       
        
    }
}
