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
public class AlaynaAndStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String N=sc.nextLine();
        char a[]=N.toCharArray();
        int size=a.length;
        int small=0,larg=0;
        for (int i = 0; i <size; i++) {
            int num=(int)a[i];
            if((num>=65)&&(num<=90)){
                larg++;
            }else if((num>=97)&&(num<=122)){
                small++;
            }else{
                continue;
            }
        }
        System.out.println(larg+" "+small);
        
        
    }
}
