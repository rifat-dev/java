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
public class ClockMath {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int H,M;
    float x,y;
    H=input.nextInt();
    M=input.nextInt();
    x=H*60;
    y=M*11;
    if(x>y){
        x=(x-y)/2;
        if(x>180){
            x=360-x;
            System.out.print(x);
        }else{
            System.out.print(x);
        }
    }else{
        y=(y-x)/2;
        if(y>180){
            y=360-y;
            System.out.print(y);
        }else{
            System.out.print(y);
        }
    }
   
    }
}
