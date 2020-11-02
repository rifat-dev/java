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
public class PascalTringle {
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
        int N,m;
        N=input.nextInt(); 
         int sum=0;
        for (int r =0; r<N; r++)
        { 
            m=1;
           
            for (int c =0; c <=r; c++) {
                if(r==N-1){
                sum=sum+m;
                m=m*(r-c)/(c+1);
                }
            }        
      }
        System.out.println(sum);
        
    }
}
