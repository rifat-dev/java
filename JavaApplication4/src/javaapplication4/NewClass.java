/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        double height,bace,a;
        
        System.out.print("Enter Bace : ");
        bace = n.nextDouble();
        
        System.out.print("Enter Height : ");
        height = n.nextDouble();
        
        a =  (0.5*bace*height);
        System.out.println("Area :  "+a);
        
        
        
    }
    
}
