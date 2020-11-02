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
public class SofdorAliGotMail {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str;
        str=input.nextLine();
        char a[]=str.toCharArray();
         for (int i = 0; i <a.length; i++) {
          if(a[i]!=(char)32){
                int num=(int)(a[i]);
            if(num==90){
                a[i]=(char)((a[i])-25);
            }
            else{
                a[i]=(char)(a[i]+1);
            }
          }
        }
        System.out.print(""+(char)34);
        for (int i = 0; i <a.length; i++) {
             System.out.print(a[i]+"");
        }
        System.out.print(""+(char)34);
       System.out.println();
       System.out.print("Grachen");
      
    }
}
