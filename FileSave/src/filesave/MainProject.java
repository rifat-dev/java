/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesave;

import java.io.File;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class MainProject {
    static Scanner input=new Scanner(System.in);
    static int array;
    static Random dice=new Random();
    static int front = 0;
    static int rear = -1;
    static void register(){
       
       try{
           Formatter f=new Formatter("E:/JAVA/FileSave/student/student.txt");
           for (int i = 0; i <5; i++) {
               array=1000+dice.nextInt(8999);
          f.format("%d\t",array);
          System.out.println("Registration done! Id Number : "+array);
           }
          f.close();
        }
       catch(Exception e){
           System.out.println(e);
       }
    }
    static void show(){
      try{
          File ride=new File("E:/JAVA/FileSave/student/student.txt");
          Scanner n=new Scanner(ride);
          while(n.hasNext()){
                String array=n.next();
                System.out.println("Register IDs Are : ");
                System.out.println(array+" \t");
            }
            n.close();
          
      }catch(Exception e){
          System.out.println(e);
      }
      
    }
    public static void main(String[] args) {
           int choice,value;
        while(true){
            System.out.println("\t\t\\\\\\REGISTER FROM\\\\\\");
            System.out.println("Pleace Select Any one From Below : ");
            System.out.println("\t1.Register With Unique ID :\n\t2.Search An Existing ID :\n\t3.Withdraw Registration :\n\t4.Show All Registered IDs :\n\t5.Exit");
            System.out.print("Enter Any Choice : ");
            choice=input.nextInt();
            switch(choice){
                case 1:
                    register();
                    break;
                case 2:
                    System.out.print("Enter The ID To Be Searched : ");
                    value=input.nextInt();
                    
                    break;
                case 3:
                    System.out.print("Enter The ID To Withdraw Registration : ");
                    value=input.nextInt();
                  
                    break;
                case 4:
                    show();
                    break;
                case 5:
                    break;
                    
                    
            }
        }
    }
 
}
