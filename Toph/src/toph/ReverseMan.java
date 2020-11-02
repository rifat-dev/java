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
public class ReverseMan {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        String x=in.nextLine();
        char y[]=x.toCharArray();
        int size = y.length;
        char a[]=new char[size];
        for (int i = 0; i!=size; i++) {
            a[size-1-i]=y[i];
        }
        System.out.println(a);
    }
}
