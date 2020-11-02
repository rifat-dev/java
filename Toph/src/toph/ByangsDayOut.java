/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class ByangsDayOut {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t;
        t=sc.nextLong();
        for (int i = 0; i <t; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if((a+b>=c)&&(a+c>=b)&&(b+c>=a)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
