/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.lab;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class BFS {
    public static void view(int node,int matrix[][]){
        System.out.println("Graph Matrix ");
        for (int i =0; i <node; i++) {
            for (int j =0; j <node; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int node,edges;
        System.out.println("Enter the number of node :");
        node=input.nextInt();
        System.out.println("Enter the number of edges : ");
        edges=input.nextInt();
        int matrix[][]=new int [node][node];
        for (int i =0; i<edges; i++){
            int src=input.nextInt();
            int dst=input.nextInt();
            matrix[src][dst]=1;
            matrix[dst][src]=1;
        }
        view(node,matrix);
        int color[] =new int[matrix.length];
        int distance[]=new int[matrix.length];
        int parent[]=new int[matrix.length];
        
        Queue<Integer> q =new LinkedList<>();
        System.out.println("Select  source");
        int s=input.nextInt();
        
        color[s]=1;
        parent[s]=-1;
        q.add(s);
        while(!q.isEmpty()){
            int U=q.poll();
            for (int i =0; i <matrix.length; i++) {
               if(matrix[U][i]==1){
                   if(color[i]==0){
                       color[i]=1;
                       distance[i]=distance[U]+1;
                       parent[i]=U;
                       q.add(i);
                   }
               } 
            }
            color[U]=2;
        }
        for (int i = 0; i <color.length; i++) {
            System.out.println("Node"+i+" Level of "+distance[i]+" a parent"+parent[i]);
        }
    }
 
}
