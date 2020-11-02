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
public class ByangAdditions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c,d,k;
        int carry=0;
        a=input.nextInt();
        b=input.nextInt();
        while((a!=0)&&(b!=0)){
        c=a%10;
        a=a/10;
        d=b%10;
        b=b/10;
        k=c+d;
        if(k>9){
            carry++;
        }
        }
        if(carry>=1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
      
       
    }
}
