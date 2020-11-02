/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class BetterPass {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        char ch[]=new char[20];
        int n=input.nextInt();
        for (int i = 0; i <n; i++) {
            ch[i]=input.next().charAt(0);
        }
        ch[n]='.';
        n++;
        int i,j;
        for ( i = 0; i <n; i++) {
            if(i==0){
              ch[i] = (char)(ch[i]-32);
            }
            else if(ch[i]=='s'){
                ch[i]='$';
            }
            else if(ch[i]=='i'){
                ch[i]='!';
            }
           else if(ch[i] == 'o') {
            n++;
            for(j =n; j > i + 1; j--) {
                ch[j] = ch[j - 1];
                  }
            ch[i] = '(';
            ch[i + 1] = ')';
              }

            else{
                continue;
            }
            
        }
        for (i = 0; i <n; i++) {
            System.out.print(ch[i]+" ");
        }
    }
}
