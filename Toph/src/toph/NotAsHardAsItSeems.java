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
public class NotAsHardAsItSeems {
    public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
        String n=in.nextLine();
        char a[]=n.toCharArray();
        int top=0;
        int length=0;
        int space=0;
        int size =a.length;
        char stack[]=new char[size];
        if(size==0){
            System.out.println("No");
            System.exit(0);
        }
        for (int i = 0; i <size; i++) {
            if(a[i]==(char)32){
                space++;
                if(space%2!=0){
                    a[i]=(char)40;
                }else{
                    a[i]=(char)41;
                }
            }
        }
        for (int i = 0; i <size; i++) {
            if((a[i]=='(')||(a[i]=='{')||(a[i]=='[')){
                top++;
                stack[top]=a[i];
            }else{
                if(top==0){
                    System.exit(0);
                }else if(a[i]==')'){
                      if(stack[top]=='('){
                            top--;
                            length++;
                        }
                }else if(a[i]=='}'){
                      if(stack[top]=='{'){
                            top--;
                            length++;
                        }
                }else if(a[i]==']'){
                        if(stack[top]=='['){
                            top--;
                            length++;
                        }
                    }
                
            }
        } 
        
        System.out.println(length);
       
    }
}
