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
public class IsPrime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N,b=0;
        N = input.nextInt();
        for (int i =2; i <N; i++) {
            if(N%i==0){
                b++;
            }
        }
        if(b==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
