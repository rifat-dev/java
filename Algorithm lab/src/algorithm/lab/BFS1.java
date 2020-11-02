/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.lab;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class BFS1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int node=sc.nextInt();
        int edge=sc.nextInt();
        int array[][]=new int[node][node];
        for (int i = 0; i <edge; i++) {
            int src=sc.nextInt();
            int dst=sc.nextInt();
            array[src][dst]=1;
            array[dst][src]=1;
        }
        System.out.println("Matrix : ");
        for (int i = 0; i <node; i++) {
            for (int j = 0; j <node; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        int color[]=new int[array.length];
        int distance[]=new int[array.length];
        int parent[]=new int[array.length];
        
        Queue<Integer> q =new LinkedList<Integer>();
        System.out.println("Source : ");
        int s=sc.nextInt();
        
        parent[s]=-1;
        color[s]=1;
        q.add(s);
        
        while(!q.isEmpty()){
            int u=q.poll();
            for (int i = 0; i <array.length; i++) {
                if(array[u][i]==1){
                    if(color[i]==0){
                        color[i]=1;
                        distance[i]=distance[u]+1;
                        parent[i]=u;
                        q.add(i);
                    }
                }
            }
            color[u]=2;
            
        }
        
        for (int i = 0; i <color.length; i++) {
            System.out.println("Node"+i+" Level of "+distance[i]+" a parent"+parent[i]);
        }
        
        
    }
}
