/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queue;

import static java.time.Clock.system;
import java.util.Scanner;


/**
 *
 * @author Md Rifat
 */
public class Queue {
      public static int queue[]=new int[20];
    public static int size=5;
    public static int front=-1;
    public static int rear=-1;
    public static Scanner input=new Scanner(System.in);
    
    public static void enqueue(){
        if((rear-front)+1==size){
            System.out.println("There Have no space");
        }
        else{
            front=0;
            rear++;
            System.out.println("Enqueue some element :");
            queue[rear]=input.nextInt();
            
        }
    }
    public static void dequeue(){
        if(front==-1){
           
            System.out.println("There have no value to delete : ");
        }
        else{
             
            System.out.println("Delete "+queue[front]);
            front++;
            if(front>rear){
                front=rear=-1;
            }
          
        }
        
        
    }
    
    public static void main(String[] args) {

           int choice;
        while(true){
            System.out.println("1.Enqueue\n2.Dequeue\n3.Exit");
            System.out.print("Enter Your Choice : ");
            choice=input.nextInt();
            switch(choice){
                case 1:
                    enqueue();
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    break;
            }
        }
       
        
    }
    
}
