/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class MixedFractions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N,D,a,b;
        N=input.nextInt();
        D=input.nextInt();
        a=N/D;
        b=N%D;
        System.out.print(a+" "+b+" "+D);
    }
}
