/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class GPACalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int n;
        double p;
        for (int i =1; i <=T; i++) {
            n=sc.nextInt();
            double sum=0;
            int count=0;
            for (int j = 0; j <n; j++) {
                p=sc.nextDouble();
                sum=sum+p;
                count++;
            }
            double result=sum/count;
            System.out.println("Case "+i+": "+new DecimalFormat("0.000").format(result));
                    
        }
    }
}
