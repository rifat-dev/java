/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class MathandWatermelons {
    public static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        int M,K,a;
        M=in.nextInt();
        K=in.nextInt();
        a=M%K;
        System.out.println(a);
    }
}
