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
public class Pascal {
    static void pascalCount(int length){
        int a[][]=new int[length][length];
        for (int i = 0; i<length; i++) {
                a[0][i]=1;
                a[i][0]=1;   
        }
            for (int row = 1; row<length; row++) {
            for (int collum = 1; collum <length-row; collum++) {
             a[row][collum]=a[row][collum-1]+a[row-1][collum];
                
            }
        }
             for (int i = 0; i <length; i++) {
               for (int j = 0; j <length-i; j++) {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
            
        
       
    }
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int number;
        System.out.println("Enter any number : ");
        number=input.nextInt();
        while(number!=-1){
            if(number<-1||number>20){
                System.out.println("Plese Enter Betwen -1 to 20 :");
                number=input.nextInt();
                continue;
            }
            pascalCount(number);
           
          System.out.println("Plese Enter Betwen -1 to 20 :");
         number=input.nextInt();
        }
        
        
    }
}
