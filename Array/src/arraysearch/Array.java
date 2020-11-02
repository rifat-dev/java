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
public class Array {
    static int Search(int[]arr,int n,int value){
        for(int i=0;i<n;i++){
            if(value==arr[i]){
                return i+1;
            }
        }
        return -1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = new int[20];
        Scanner v = new Scanner(System.in);
        int n,value,poss;
        System.out.println("Enter Number Of Elements : ");
        n = v.nextInt();
        System.out.println("Enter Number One by One :");
        for(int i=0;i<n;i++){
            arr[i]=v.nextInt();
        }
        System.out.println("Enter Number For Search : ");
        value=v.nextInt();
        
        poss = Search(arr,n,value);
        if(poss==-1){
            System.out.println("Not Found ");
        }
        else{
            System.out.println("Index position "+poss);
        }
        
      
    }
    
}
