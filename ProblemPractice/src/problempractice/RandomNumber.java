/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problempractice;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class RandomNumber {
    static Scanner input=new Scanner(System.in);
    static int array[]=new int[100];
    static Random dice=new Random();
    static int size=array.length;
    static int front = -1;
    static int rear = -1;
    static void register(){
        System.out.println("Enter Id : ");
        if(((rear-front)+1==size)){
            System.out.println("No Space");
        }
        else {
           rear++;
          array[rear]=dice.nextInt(99);
        }
        
        for (int i = 0; i <=rear; i++) {
           System.out.println(array[rear]+""); 
        }
        
    }
    public static void main(String[] args) {
        
     register();
      
        
        
    }
}
