/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[] =new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        
        int sum=0;
        for (int i = 0; i <n; i++) {
           sum+=arr[i];
            
        }
        System.out.println(sum);
    }
}