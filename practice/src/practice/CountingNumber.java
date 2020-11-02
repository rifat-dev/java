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
public class CountingNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,count=0;
        int arr[]=new int[10];
        System.out.println("Enter value one by one ");
        arr[10]=input.nextInt();
        
        System.out.println();
        for (int i = 0; i <5; i++) {
            count++;
        }
        System.out.println(count+"");
        
        
    }
}
