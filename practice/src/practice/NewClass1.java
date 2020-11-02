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
public class NewClass1 {
    public static void main(String[] args) {
         int arr[]=new int[15];
         int dup[]=new int[15];
        int count;
        Scanner v=new Scanner(System.in);
        int n;
        System.out.println("Enter size of Arr :");
        n=v.nextInt();
        System.out.println("Enter one by one arr :");
        for(int i=0;i<n;i++){
            arr[i]=v.nextInt();
            dup[i]=1;
        }
        for(int i=0;i<n;i++){
            count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    dup[j]=0;
                }
            }
            if(dup[i]!=0){
                dup[i]=count;
            }
            
        }
        for(int i=0;i<n;i++){
            if(dup[i]!=0){
                System.out.println(arr[i]+" repeated "+dup[i]+" Times");
            }
        }
    }
    
}
