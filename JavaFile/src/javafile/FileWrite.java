/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafile;

import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class FileWrite {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int id;
        int array[]=new int[20];
        Random r=new Random();
       try{
            Formatter f=new Formatter("E:/JAVA/JavaFile/Person/student.txt");
           System.out.println("How many Student ");
           int num=input.nextInt();
       
           for (int i = 0; i <num; i++) {
               array[i]=r.nextInt(10);
               f.format("%d \n",array[i]);
           }
           f.close();
          
       }catch(Exception e){
           System.out.println(e);
       }
    }
  
}
