/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.lab;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class DFS1 {
      //global time variable
  public static int time = 0;

  //global arrays: color, start, fin, par
  public static int[] color;
  public static int[] start;
  public static int[] fin;
  public static int[] par;
  public static int[]n;
  public static int[]indnum;
  
  
  public static void sort(int n[]){
       int temp;
        for (int i = 0; i <=n.length-2; i++) {
            for (int j = 0; j<=n.length-2-i; j++) {
                if(n[j]<n[j+1]){
                    temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
  }
  public static void index(int n[],int fin[]){
      for (int i = 0; i <n.length; i++) {
          for (int j = 0; j <fin.length; j++) {
              if(n[i]==fin[j]){
                  indnum[i]=j;
              }
          }
      } 
  }
  public static void view(int indnum[]){
      for (int i = 0; i <indnum.length; i++) {
          System.out.print(indnum[i]+"->");
      }
      System.out.println();
  }
  public static void sortview(int n[]){
      for (int i = 0; i <n.length; i++) {
          System.out.print(n[i]+"->");
      } 
  }


  public static void main(String[] args) {

    //Input Graph
    Scanner sc = new Scanner (System.in);
    System.out.println("How Many Nodes?");
    int node = sc.nextInt();
    System.out.println("How Many Edges?");
    int edge = sc.nextInt();
    int [][] mat = new int [node][node];
    for(int c =0 ; c<mat.length; c++){
      System.out.println("Which Two Are Connected?");
      int temp1 =sc.nextInt();
      int temp2 =sc.nextInt();
      mat[temp1][temp2]=1;
    }

    //Initialize the declared arrays
    color = new int[mat.length];
    fin = new int[mat.length];
    start = new int[mat.length];
    par = new int[mat.length];
    indnum=new int[mat.length];

    //Taking a source as input
    System.out.println("What is the source?");
    int source = sc.nextInt();
    par[source] = -1;
    dfs_visit(mat,source);

    //Ensuring that the whole graph is visited even in the case of a disjointed node
    for(int c=0; c<mat.length; c++){
      if(color[c]==0){
        dfs_visit(mat,c);
      }
    }

    //Print the output
      printInfo(mat);
      n=new int[mat.length];
      for (int i = 0; i <mat.length; i++) {
         n[i]=fin[i];
      }
      sort(n);
      index(n,fin);
      view(indnum);
      sortview(n);
      

  }

  public static void printInfo(int[][] g){
    for(int c = 0; c<g.length; c++){
      System.out.println("Node "+c+" has a parent of "+par[c]+" with a starting time "+start[c]+" and a finishing time "+fin[c]);
    }
  }

  public static void dfs_visit(int[][] g,int s){
    color[s] = 1;
    start[s] = time;
    time = time + 1;
    
    for(int c = 0; c<g.length; c++){
      if(g[s][c]==1){
        if(color[c] == 0){
          par[c] = s;
          dfs_visit(g,c);
        }
      }
    }
    color[s] = 2;
    fin[s] = time;
    time=time+1;
  }

}
