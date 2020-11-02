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
public class DFS {
    public static int color[];
    public static int time = 0;
    public static int start[];
    public static int fin[];
    public static int par[];
    
   public static void dfs(int mat[][],int s){
        color[s]=1;
        start[s]=time;
        time++;
        for (int i = 0; i <mat.length; i++) {
             if(mat[s][i]==1){
               if(color[i]==0){
                   par[i]=s;
                   dfs(mat,i);
                }
             }             
        }
        color[s]=2;
        fin[s]=time;  
        time=time+1;
    }
   
   public static void printinfo(int mat[][]){
       for (int i = 0; i <mat.length; i++) {
           System.out.println("Node"+i+" has a parent of "+par[i]+" with a starting "+start[i]+" and finishing time "+fin[i]+"");
       }
   }
    
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int node=sc.nextInt();
        int edges=sc.nextInt();
        int mat[][]=new int[node][node];
        for (int i = 0; i <mat.length; i++) {
            int src=sc.nextInt();
            int dst=sc.nextInt();
            mat[src][dst]=1;
        }
       
       color=new int[mat.length];
       start=new int[mat.length];
       fin=new int[mat.length];
       par=new int[mat.length];
       
        System.out.println("Enter Source");
        int Source=sc.nextInt();
        par[Source]=-1;
        dfs(mat,Source);
        
        
       for (int i = 0; i <mat.length; i++) {
            if(color[i]==0){
                dfs(mat,i);
            }
       }
       printinfo(mat);
    }
}
