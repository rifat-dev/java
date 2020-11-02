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
public class LittleSubarraySum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N,A,B;
        N=input.nextInt();
        A=input.nextInt();
        B=input.nextInt();
        int arr[]=new int[N];
        for (int i = 0; i <N; i++) {
            arr[i]=input.nextInt();
        }
        int sum=0;
        for (int i =A; i <=B; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
