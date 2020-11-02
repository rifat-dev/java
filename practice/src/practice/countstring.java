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
public class countstring {
    public static void main(String[] args) {
        int arr[]=new int[20];
        Scanner input = new Scanner(System.in);
        int n,count=0;
        System.out.println("Enter Array size : ");
        n=input.nextInt();
        System.out.println("inpute Values : ");
        for (int i = 0; i <n ; i++) {
            arr[i]=input.nextInt();
        }
        for (int i = 0; i <n; i++) {
            for (int j =i+1; j <n; j++) {
                if (arr[i]==arr[j]) {
                    if (arr[j]!=0) {
                        arr[j]=0;
                        count++;
                        
                    }
                    
                }
                
            }
            if (arr[i]>0) {
                count++;
                System.out.println(arr[i]+" repead "+count+" Times");
                
            }
            count=0;
            
        }
        
    }
    
}
