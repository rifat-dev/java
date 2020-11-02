/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeforceproblems;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class Watermelion {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int w = sc.nextInt();
        if(w%2==0 && w>2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
