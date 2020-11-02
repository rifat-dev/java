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
public class ICPCIsComingiHot {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        long N;
        int value=100;
        int poss=0;
        int count=0;
        int a[]=new int[10000];
        N=in.nextLong();
        int i=0;
        while(N!=0){
            a[i]=(int) (N%10);
            N=N/10;
            i++;
        }
        
        for (int j =i-1; j>=0; j--) {
             count=1;
            for (int k =j-1; k>=0; k--) {
                  if(a[j]==a[k]){
                      if(a[k]!=-1){
                          a[k]=-1;
                          count++;
                      }
                  }
            }
            if(a[j]!=-1){
              if(count>1){
                 if(value>a[j]){
                  value = a[j];
               }
              }
            }
            count=0;
        }
        System.out.println(value);
    }
}
