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
public class DecentArrays {
    public static void main(String[] args) {
        Scanner inpu=new Scanner(System.in);
        int N;
        int count=0;
        N=inpu.nextInt();
        int array[]=new int[N];
        for (int i = 0; i <N; i++) {
            array[i]=inpu.nextInt();
        }
        for (int i = 0; i <N-1; i++) {
               if(array[i]>array[i+1]){
                   System.out.print("No");
                   System.exit(0);
               }
        }
        System.out.print("Yes");

    }
}
