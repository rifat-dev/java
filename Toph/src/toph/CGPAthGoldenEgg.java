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
public class CGPAthGoldenEgg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long T=sc.nextInt();
        double m,n;
        for (int i =1; i <=T; i++) {
            long C=sc.nextInt();
            double sum=0;
            double cradet=0;
            long course=0,fail=0;
            for (int j = 0; j <C; j++) {
                m=sc.nextDouble();
                n=sc.nextDouble();
                course++;
                cradet=cradet+n;
               if((m>=0)&&(m<=100)&&(n>=1)){
                if((m>=80)&&(m<=100)){
                    sum=sum+(4.00)*(n);
                }else if((m>=75)&&(m<80)){
                    sum=sum+(3.75)*(n);
                }else if((m>=70)&&(m<75)){                  
                    sum=sum+(3.50)*(n);
                }else if((m>=65)&&(m<70)){                  
                    sum=sum+(3.25)*(n);
                }else if((m>=60)&&(m<65)){
                    sum=sum+(3.00)*(n);
                }else if((m>=55)&&(m<60)){
                    sum=sum+(2.75)*(n);
                }else if((m>=50)&&(m<55)){
                    sum=sum+(2.50)*(n);
                }else if((m>=45)&&(m<50)){
                    sum=sum+(2.25)*(n);
                }else if((m>=40)&&(m<45)){
                    sum=sum+(2)*(n);
                }else{
                    fail++;
                }
               }else{
                   System.exit(0);
               }
            }
            if(fail>0){
                if(fail==1){
                    System.out.println("Case "+i+": Sorry, you have failed in 1 course!");
                }else{
                    System.out.println("Case "+i+": Sorry, you have failed in "+fail+" courses!");
                }
            }else{
               
                double result=sum/cradet;
                System.out.println("Case "+i+": "+new DecimalFormat("0.00").format(result));
               
            }
           
        }
    }
}
