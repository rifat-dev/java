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
public class FairDistribution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int X,Y,a,b,m,z;
        X=input.nextInt();
        Y=input.nextInt();
        a=Y/X;
        z=Y%X;
        if(z!=0){
        b=X*a;
        m=b+X;
        int result=m-Y;
        System.out.print(result);
        }
        
    }
}
