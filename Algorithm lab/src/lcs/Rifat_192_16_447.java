/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcs;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class Rifat_192_16_447 {
       static int lastTwoDigits;
   static int secondLastDigit;
   static int lastDigit;
   static boolean lastDigitEven;
   static int time = 0;
   static int[] start;
   static int[] fin;
   static int[] color;
   static int[] parent;
   
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      
      //Set Selection
      System.out.println("Input the last two digits of your Student ID: ");   
      lastTwoDigits = sc.nextInt();
      System.out.println();
      lastDigitEven = false;
      secondLastDigit = lastTwoDigits/10;
      lastDigit = lastTwoDigits%10;
      System.out.println("Your Last Digit Of Your ID is: "+lastDigit);
      System.out.println("Your Second Last Digit Of Your ID is: "+secondLastDigit);
      System.out.println();
      if(lastDigit % 2 == 0){
         lastDigitEven = true;
         System.out.println("You will have to solve the BFS portion");
         System.out.println();
      }
      else{
         System.out.println("You will have to solve the DFS portion");
         System.out.println();
      }  
      
      if(secondLastDigit % 2 == 0){
         System.out.println("You will have to write the Take Input Method");
         System.out.println();
         int[][] mat = takeInput(sc); //You have to complete this method if second last digit of your ID is even.
         traverseGraph(mat);
      }
      
      else{
         System.out.println("You will have to write the printMatrix Method");
         System.out.println();
         int [][] mat = {
            {0,1,1,0,0,0,0,0,1,0},{0,0,1,1,0,0,0,0,0,0},{0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,1,0,0,0},{0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,0,1,0},{0,0,0,0,0,0,0,0,0,1},{0,0,0,0,0,1,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,1,0,0,1,0,0}
         };
         printMatrix(mat); //You have to complete this method if second last digit of your ID is odd.
         System.out.println();
         traverseGraph(mat);
      }   
   }
   
   public static int[][] takeInput(Scanner sc){
      int[][] temp = new int[10][10]; //There are 10 nodes in the graph given
      
      /*
       * ONLY FOR STUDENTS WITH EVEN LAST DIGIT IN DIU ID
       * WRITE YOUR CODE HERE TO take Matrix as Input from the graph in the question using Scanner.
       * Save it in the Temp array that has been initialized above and return it.
       */
      System.out.println("How Many Nodes?");
      int node = sc.nextInt();
      System.out.println("How Many Edges?");
      int edge = sc.nextInt();
      for(int c =0 ; c<edge; c++){
      System.out.println("Which Two Are Connected?");
      int temp1 =sc.nextInt();
      int temp2 =sc.nextInt();
      temp[temp1][temp2]=1;
    }
      
      return temp;
   }
   
   public static void printMatrix(int[][] matrix){
      
      /*
       * ONLY FOR STUDENTS WITH ODD LAST DIGIT IN DIU ID
       * Write a method to print a two dimensional array with matrix as a parameter
       * DO NOT USE the global mat variable
       */
      
   }
   
   public static void traverseGraph(int[][] matrix){
      color = new int[matrix.length];
      parent = new int[matrix.length];
      int source = lastDigit; //The source is set as your lastDigit of your ID
      
      if(lastDigitEven){ 
         
         /*
          * FOR EVEN LAST DIGIT ID STUDENTS!
          * Traverse the matrix using BFS and print the output wanted in the PDF. 
          * You have to edit in this condition and cannot write extra methods.
          */
         
         //PRINT OUTPUT OF BFS IF YOU WERE ASSIGNED TO IMPLEMENT BFS
      }
      
      else{         
         
         /*
          * FOR ODD LAST DIGIT ID STUDENTS!
          * Traverse the matrix using DFS and print the output wanted in the PDF. 
          * You do not have to edit in this. You have to edit in the dfs_visit method
          */
         
         start = new int[matrix.length];
         fin = new int[matrix.length];
         parent[source] = -1;
         dfs_ghurbo(matrix,source);
         
         for(int c=0; c<matrix.length; c++){
            if(color[c]==0){
               dfs_ghurbo(matrix,c);
            }
         }
         
         //PRINT OUTPUT OF DFS IF YOU IMPLEMENTED DFS 
        for(int c = 0; c<matrix.length; c++){
            System.out.println("Node "+c+" has a parent of "+parent[c]+" with a starting time "+start[c]+" and a finishing time "+fin[c]);
        }
      } 
   }
   
   public static void dfs_ghurbo(int[][] g,int s){
      
      /*
       * FOR ODD LAST DIGIT ID STUDENTS!
       * This is where you have to edit to make your else condition in TraverseGraph condition work for DFS
       */
       color[s]=1;
       start[s]=time;
       time++;
        for (int i = 0; i <g.length; i++) {
             if(g[s][i]==1){
               if(color[i]==0){
                   parent[i]=s;
                   dfs_ghurbo(g,i);
                }
             }             
        }
        color[s]=2;
        fin[s]=time;  
        time=time+1;
      
   }
}
