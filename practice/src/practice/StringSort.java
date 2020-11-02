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
public class StringSort {
     public static void sort(int word[]){
        int temp;
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <5; j++) {
                if(word[j]>word[j+1]){
                    temp=word[j];
                    word[j]=word[j+1];
                    word[j+1]=temp;
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
        String word[]=new String[5];
        for (int i = 0; i <5; i++) {
            word[i]=x.next();
        }
        
    }
}
