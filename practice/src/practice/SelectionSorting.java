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
public class SelectionSorting {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n,main,k,temp;
        int a[]=new int[30];
        System.out.println("Input Array Size : ");
        n=x.nextInt();
        System.out.println("Inpute values :");
        for (int i = 0; i <n; i++) {
            a[i]=x.nextInt();
        }
        
        for (int i = 0; i <=n-2; i++) {
            main=a[i];
            k=i;
            for (int j =i+1; j <=n-1; j++) {
                if(main>a[j]){
                    main=a[j];
                    k=j;
                }
               
            }
            temp=a[i];
            a[i]=a[k];
            a[k]=temp;
            
        }
        
        for (int i = 0; i <n; i++) {
            System.out.print(a[i]+" ");
        }
        
    }
    
}
