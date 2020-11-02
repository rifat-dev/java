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
public class ArithmeticSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N,M,sum,sub=0;
        N=sc.nextInt();
        sum=N*(N+1)/2;
        M=sc.nextInt();
        for (int i = 0; i <M; i++) {
            int M1=sc.nextInt();
            sub+=M1;
        }
        System.out.println(sum-sub);
    }
}
