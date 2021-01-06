/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStracture;

import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
          int t = in.nextInt();
          in.nextLine();
        for(int k =0 ; k < t ; k++){
            String n=in.nextLine();
            char a[]=n.toCharArray();
            int top=0;
           int size =a.length;
           char stack[]=new char[size+1];
          for (int i = 0; i <size; i++) {
            if((a[i]=='(')||(a[i]=='{')||(a[i]=='[')){
                top++;
                stack[top]=a[i];
                
            }else{
              if(a[i]==')'){
                      if(stack[top]=='('){
                            top--;
                        }else{
                            top++;
                        }
                }else if(a[i]=='}'){
                      if(stack[top]=='{'){
                            top--;
                        }else{
                            top++;
                        }
                }else if(a[i]==']'){
                        if(stack[top]=='['){
                            top--;
                        }else{
                            top++;
                        }
                    }
            }
          }
          if(top==0){
            System.out.println("YES");
          }else{
            System.out.println("NO");
          }
       }
    }
}
