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
public class NewClass {
//    static int doublevalue(int arr[],int i,int j){
//         for( i=0;i<arr.length-1;i++){
//            for( j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    
//                   
//                } 
//                return j+1;
//            }
//        }
//      
//         return i+1;
//    }

    public static void main(String[] args) {
        int arr[]=new int[15];
        int count=0;
        Scanner v=new Scanner(System.in);
        int n;
        System.out.println("Enter size of Arr :");
        n=v.nextInt();
        System.out.println("Enter one by one arr :");
        for(int i=0;i<n;i++){
            arr[i]=v.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    if(arr[j]!=-1){
                        arr[j]=-1;
                        count++;
                    }
                }
            }
            if(arr[i]>-1){
                count++;
                System.out.println(arr[i]+" repeated "+count+" Times");
            }
            count=0;
        }
        
       
        
    }
    
}
