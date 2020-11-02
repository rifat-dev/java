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
public class Stack {
    public static int stack[]=new int[30];
    public static int size=5;
    public static int top=-1;
    public static Scanner in = new Scanner(System.in);
    
    public static void push()
    {
        if(top==size-1){
            System.out.println("Stack overflow");
        }
        else{
            top++;
            System.out.println("Enter value :");
            stack[top]=in.nextInt();
        }
    }
    public static void pop()
    {
        if(top==-1){
            System.out.println("Stack Overflow");
        }
        else{
            System.out.println("Delete "+stack[top]);
            top--;
        }
    }
    public static void top()
    {
        if(top==-1){
            System.out.println("overflow");
        }
        else{
            System.out.println("top value "+stack[top]);
        }
    }
    public static void display()
    {
        if(top==-1)
        {
            System.out.println("Overflow");
        }
        else{
            for (int i = 0; i <=top; i++) {
                System.out.println();
                System.out.println(stack[i]+"");
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int choice;
        while(true){
            System.out.println("1.push\n2.pop\n3.top\n4.Display\n5.Exit");
            System.out.println("Enter Choice : ");
            choice=in.nextInt();
            switch(choice){
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    top();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    break;
            }
        }
    }
}
