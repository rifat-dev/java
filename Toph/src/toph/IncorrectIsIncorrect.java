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
public class IncorrectIsIncorrect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long A,B,C;
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        int d=0,e=0,f=0;
        long sum=A+B+C;
        if(sum%2==0){
            e=(int) (sum/2);
            f=d+e;
            System.out.println(d+"+"+e+"="+f);
        }else{
            System.out.println("Impossible");
        }
    }
}
