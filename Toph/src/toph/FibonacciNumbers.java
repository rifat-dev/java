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
public class FibonacciNumbers {
    static int fab(int N){
        if(N==0 || N==1){
            return N;
        }else{
            return fab(N-2)+fab(N-1);
        }
     
        
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N;
        N=input.nextInt();
        int result = fab(N);
        System.out.println(result);
        
        
    }
}
