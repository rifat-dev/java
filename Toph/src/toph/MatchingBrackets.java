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
public class MatchingBrackets {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
      
        String n=in.nextLine();
        char a[]=n.toCharArray();
        int top=0;
        int size =a.length;
        char stack[]=new char[size];
        if(size==0){
            System.out.println("No");
            System.exit(0);
        }
        for (int i = 0; i <size; i++) {
            if((a[i]=='(')||(a[i]=='{')||(a[i]=='[')){
                top++;
                stack[top]=a[i];
            }else{
                if(top==0){
                    System.out.print("No");
                    System.exit(top);
                }else if(a[i]==')'){
                      if(stack[top]=='('){
                            top--;
                        }
                }else if(a[i]=='}'){
                      if(stack[top]=='{'){
                            top--;
                        }
                }else if(a[i]==']'){
                        if(stack[top]=='['){
                            top--;
                        }
                    }
            }
        }
        if(top==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }  
        
    }
 
}
