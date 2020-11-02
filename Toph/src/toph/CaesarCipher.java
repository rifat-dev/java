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
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        input.nextLine();
        String str;
        str=input.nextLine();
        char a[]=str.toCharArray();
        for (int i = 0; i <a.length; i++) {
          if(a[i]!=(char)32){
                int num=(int)(a[i]);
            if(num-n<97){
                a[i]=(char)((a[i]-n)+26);
            }
            else{
                a[i]=(char)(a[i]-n);
            }
          }
        }
        for (int i = 0; i <a.length; i++) {
             System.out.print(a[i]+"");
        }
    }
}
