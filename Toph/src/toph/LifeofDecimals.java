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
public class LifeofDecimals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a[]={'1', '4', '1', '5', '9', '2', '6', '5', '3', '5', '8', '9'};
        int T=sc.nextInt();
        int count=0;
        for (int i = 0; i < T; i++) {
            int N=sc.nextInt();
            System.out.println(a[N-1]);
        }
    }
}
