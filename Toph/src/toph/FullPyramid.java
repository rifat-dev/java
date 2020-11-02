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
public class FullPyramid {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N;
        N=input.nextInt();
        for (int r =1; r<=N; r++)
        {
            for (int c = 1; c <=N-r; c++){
                System.out.print(" ");
            }
            for (int c =1; c <=r; c++) {
                if(c>1){
                    System.out.print(" *");
                }else{
                    System.out.print("*");
                }
            }
                
            System.out.println();     
      }  
    }
}
