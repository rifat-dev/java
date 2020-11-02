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
public class LeapYears {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int Y;
        Y=input.nextInt();
        if(((Y%4)==0) && ((Y%400)!=0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
