/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysearch;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class NewClass {
    static int elementserch(int arr[],int n,int value){
        for(int i=0;i<n;i++){
            if(arr[i]==value)
                return i+1;
        }
        return -1;
    }
    
    static int deleteelement(int arr[],int n,int value){
        int pos;
        pos = elementserch(arr,n,value);
        if(pos==-1){
            System.out.println("value not found");
            return n;
        }
        for(int i=pos-1;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        return n-1;
        
    }
           
    
    public static void main(String[] args) {
        int arr[]=new int[50];
        Scanner input = new Scanner(System.in);
        int n,value;
        System.out.println("Enter Element Number : ");
        n=input.nextInt();
        System.out.println("Enter Your Value : ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter value to delete : ");
        value=input.nextInt();
        
        System.out.println("Befor value removing : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println("");
        
        n=deleteelement(arr,n,value);
        System.out.println("After value removing : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println("");
        
        
        
        
    
        
        
        
    }
    
}
