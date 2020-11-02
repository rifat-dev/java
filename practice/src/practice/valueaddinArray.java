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
public class valueaddinArray {
    static int [] addValue(int arr[],int n,int value,int pos){
        int newarr[]=new int[n+2];
        for (int i = 0; i <=n; i++) {
            if(i<pos-1){
                newarr[i]=arr[i];
            }
            else if(i==(pos-1)){
                newarr[i]=value;
            }
            else{
                newarr[i]=arr[i-1];
            }
            
        }
        return newarr;
    }
    

    public static void main(String[] args) {
        int arr[]=new int[20];
        Scanner input = new Scanner(System.in);
        int n,value,pos;
        System.out.println("Enter arry size : ");
        n=input.nextInt();
        System.out.println("Input value one by one : ");
        for (int i = 0; i <n ; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println("Enter value to add : ");
        value=input.nextInt();
        System.out.println("Enter possition To Add : ");
        pos=input.nextInt();
        
        
        
        System.out.println("Befor value add ");
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println("");
        
        System.out.println("After Add Value ");
        
        arr=addValue(arr,n,value,pos);
        
        for (int i = 0; i <=n; i++) {
            System.out.print(arr[i]+" ");
        }
       
        
        
    }
       
    
}
