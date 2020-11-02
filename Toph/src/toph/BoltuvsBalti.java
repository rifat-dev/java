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
public class BoltuvsBalti {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    long X,Y,N,M,Z=0,b=0;
    
    X=input.nextInt();
    Y=input.nextInt();
    N=input.nextInt();
    M=input.nextInt();
        if((0<=X)&&(X<Y)&&(Y<=1000000000)){
             for (int i=(int) X; i<=Y; i++) {
            Z=Z+i;
        }
        }
        System.out.println("Sum of "+X+" to "+Y+" is -> "+Z+";");
        if((0<=X)&&(X<Y)&&(Y<=1000000000)){
             for (int i=(int) N; i<=M; i++) {
            b=b+i;
        }
        }
        System.out.print("Sum of "+N+" to "+M+" is -> "+b+";");
    
    }
}
