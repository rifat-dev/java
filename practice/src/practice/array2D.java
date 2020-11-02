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
public class array2D {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int r,c;
        int a[][] = new int[100][100];
        System.out.println("Enter Row Size : ");
        r=in.nextInt();
        System.out.println("Enter collum :");
        c=in.nextInt();
        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c; j++) {
                System.out.print("Array Element "+i+j+" :");
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Elements are :");
         for (int i = 0; i <r; i++) {
            for (int j = 0; j <c; j++) {
                System.out.print(a[i][j]+"\t");
                
            }
             System.out.println();
        }
       
    }
}
