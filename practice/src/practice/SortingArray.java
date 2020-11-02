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
public class SortingArray {
    public static void sort(int array[],int n){
        int temp;
        for (int i = 0; i <=n-2; i++) {
            for (int j = 0; j <=n-2-i; j++) {
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void display(int array[],int n){
        for (int i = 0; i <n; i++) {
                System.out.print(array[i]+"\t");
            
        }
    }
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n;
        int array[]=new int[30];
        System.out.println("Input Array Size : ");
        n=x.nextInt();
        System.out.println("Inpute values :");
        for (int i = 0; i <n; i++) {
            array[i]=x.nextInt();
        }
        sort(array,n);
        display(array,n);
        
        
        
        
    }
}
