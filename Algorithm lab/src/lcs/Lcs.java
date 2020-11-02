/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcs;

import java.util.*;

/**
 *
 * @author Md Rifat
 */
public class Lcs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 1st String : ");
        String str1=sc.next();
        char[] arr1=str1.toCharArray();
        System.out.println("Enter your 2nd String : ");
        String str2=sc.next();
        char[] arr2=str2.toCharArray();
        
        int [][] array=new int[arr1.length+1][arr2.length+1];
        
        for (int i = 1; i <array.length; i++) {
            for (int j = 1; j <array[0].length; j++) {
                if(arr1[i-1]==arr2[j-1]){
                    array[i][j]=array[i-1][j-1]+1;
                }else{
                    array[i][j]=Math.max(array[i-1][j],array[i][j-1]);
                }
            }           
        }
        
        
        System.out.println("The Length of LCS : "+array[array.length-1][array[0].length-1]);
        
    }
}
