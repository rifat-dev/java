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
public class Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter something : ");
        String x=sc.nextLine();
        char y[]=x.toCharArray();
        int size=y.length;
        System.out.println("Enter :");
        String m=sc.nextLine();
        char b[]=m.toCharArray();
        
        for (int i = 0; i<size; i++) {
            if("x"=="b"){
                System.out.println("yes");
               
            }
            else{
                 System.out.println("no");
                 System.exit(0);
            }
        }
       
    }
}
