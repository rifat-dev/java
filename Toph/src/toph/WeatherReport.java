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
public class WeatherReport {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int P=sc.nextInt();
        if((P>=70)&&(P<=100)){
            System.out.println("Bad weather.");
        }else if((P>=0)&&(P<=30)){
            System.out.println("Good weather.");
        }else if((P>30)&&(P<70)){
            System.out.println((char)34+"Confusing weather."+(char)34);
        }else{
            System.exit(0);
        }
    }
}
