/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class ByangAdditions {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();

        int exc,i,n,c;
       
        int res=0;
        if(a.length()<=b.length()){
            n=b.length();
            exc=n-a.length();
            for(i=1;i<=exc;i++){
                a="0"+a;
            }
        }
        else{
            n=a.length();
            exc=n-b.length();
            for(i=1;i<=exc;i++){
                b="0"+b;
            }
        }
        
        char A[]= new char[n];
        char B[]= new char[n];
        int AA[]= new int[n];
        int BB[]= new int[n];
        i=0;
        c=n-1;
        while(i<n){
            A[i]=a.charAt(c);
            AA[i]=Character.getNumericValue(A[i]);

            i++;
            c--;
        }
        i=0;
        c=n-1;
        while(i<n){
            B[i]=b.charAt(c);
            BB[i]=Character.getNumericValue(B[i]);

                    i++;
                    c--;
        }
       
       for(int j=0; j<n;j++){
           int x=AA[j]+BB[j];
           if(x>9){
               res++;
               break;
           }
           else{
               res=res;
           }
           
       }
       if(res>=1){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
    }
}
