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
public class middleElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,m,m1;
        int arr[]=new int[20];
        System.out.println("Enter arry size:");
        n=in.nextInt();
        for (int i = 0; i <n; i++) {
            arr[i]=in.nextInt();
        }
        if(n%2!=0){
            m=(n+1)/2;
            System.out.println("Meddle Element : "+m);
        }
        else{
            m=n/2;
            m1=(n+2)/2;
            System.out.println("Middel Element : "+m+m1);
        }
    }
}
