/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babuleSort;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class Babulsort {
//    public static int swap(int a,int b){
//        int temp;
//        temp = a;
//        a=b;
//        b=temp;
//        return a;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int arraySize=sc.nextInt();
        
        int array[]=new int[arraySize];
        System.out.println("Enter value : ");
        for (int i = 0; i < arraySize; i++) {
            array[i]=sc.nextInt();
        }
        
        for (int i = 0; i <arraySize-1; i++) {
            int flag=0;
            for (int j = 0; j <arraySize-1; j++) {
                if(array[j]>array[j+1]){
                   int temp=array[j];
                   array[j]=array[j+1];
                   array[j+1]=temp;
                   flag+=1;
                }               
            }    
            if(flag==0){
                break;
            }
        }
        
        for (int i = 0; i <arraySize; i++) {
            System.out.print(array[i]+" ");
        }
         
    }
}
