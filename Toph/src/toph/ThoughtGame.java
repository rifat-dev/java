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
public class ThoughtGame {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int T,XI ,YI ,c = 0;
        T=inp.nextInt();
        for (int i = 0; i <T; i++) {
            XI=inp.nextInt();
            YI=inp.nextInt();
            c=(XI+YI)/2;
        if(c%2==0){
            System.out.println("Sadia will be happy.");
        }else{
            System.out.println("Oops!");
        }
        }

    }
 
}
