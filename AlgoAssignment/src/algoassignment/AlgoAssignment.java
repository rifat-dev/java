/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoassignment;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class AlgoAssignment {
    public static int source;
    public static int destination;
    public static int []checked;
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("How Many Nodes?");
    int node = sc.nextInt();
    System.out.println("How Many Edges?");
    int edge = sc.nextInt();
    int [][] mat = new int [node][node];
    for(int c =0 ; c<edge; c++){
      System.out.println("Which Two Are Connected?");
      int src =sc.nextInt();
      int dst =sc.nextInt();
        System.out.println("The level of traffic :");
      int weight =sc.nextInt();
      mat[src][dst]=weight;
      mat[dst][src]=weight;
    }
    
//    Node class array
      Node array[]=new Node[mat.length];
       for (int i = 0; i <mat.length; i++) {
            array[i]= new Node(i,Integer.MAX_VALUE,-1,false);
       }
       
       
//     source input  
    System.out.println("Give Us The source node : ");
    source=sc.nextInt();
    System.out.println("Give Us The destination node : ");
    destination=sc.nextInt();
    array[source].cost=0;
    array[source].parent=-1;
    
    
//    priority queue

    PriorityQueue<Node> pq=new PriorityQueue(mat.length,new Nodecomparator());
    pq.add(array[source]);
    
    while(!pq.isEmpty()){
        Node u=pq.poll();
        for (int i = 0; i <mat.length; i++) {
            if(mat[u.node][i]>0){
                if(!array[i].checked && mat[u.node][i]+u.cost<array[i].cost){
                    array[i].cost= mat[u.node][i]+u.cost;
                    array[i].parent = u.node;
                    pq.add(array[i]);
                }
            }
        }
        array[u.node].checked=true;
    }
     
        for (int i = 0; i <array.length; i++) {
            System.out.println("The Node "+array[i].node+" Has a Parent "+array[i].parent+" cost Of "+array[i].cost);
        }
        
        ArrayList<Integer> num=new ArrayList<>();
        int i=destination;
        while(i!=source){
            if(i==destination){              
                num.add(array[i].node);
                num.add(array[i].parent);
                i=array[i].parent;
            }else{
             num.add(array[i].parent);
                i=array[i].parent;
            }
        }
        
        
        System.out.println("The best route for the Source to Destination : ");
        for (int j =num.size()-1; j>=0; j--) {
            if(j!=0){
                System.out.print(num.get(j)+"-->");
            }else{
                System.out.print(num.get(j));
            }
        }
    }
    
}
