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
public class NeatBrackets {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String n=input.nextLine();
        char a[]=n.toCharArray();
        int size=a.length;
        int i,b=0,c=0;
        for (int j = 0; j <size; j++) {
            if(a[j]==')'){
                b++;
            }else{
                c++;
                
            }
        }
        int m=0,k=0;
        for (i = 0; i <size; i++) {
         if(b==c){
             if(a[0]==')'){
                   System.out.print("No");
                   System.exit(0);
             }else if(a[i]=='('){
                   m++;
               }else if(a[i]==')'){
                   k++;
                   if(m==k){
                       continue;
                   }else if(m>k){
                       continue;
                   }else{
                       System.out.print("No");
                       System.exit(0);
                    }
                 }
            }else{
             System.out.print("No");
             System.exit(0);
          }
         }
        if(m==k){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
