/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primsAlgo;

//import.java.util.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class primsAlgo {
    public static int source;
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
      int temp1 =sc.nextInt();
      int temp2 =sc.nextInt();
      int temp3 =sc.nextInt();
      mat[temp1][temp2]=temp3;
      mat[temp2][temp1]=temp3;
    }
   
    
    vertex array[]=new vertex[mat.length];
       for (int i = 0; i <mat.length; i++) {
            array[i]= new vertex(i,Integer.MAX_VALUE,-1,false);
       }
       
//     source input  
    System.out.println("Give Us Tha source node : ");
    source=sc.nextInt();
    array[source].key=0;
    array[source].parent=-1;
    
    
//    priority queue

    PriorityQueue<vertex> pq = new PriorityQueue(mat.length,new vertexcomparator());
    pq.add(array[source]);
    
    while(!pq.isEmpty()){
        vertex u=pq.poll();
        for (int i = 0; i <mat.length; i++) {
            if(mat[u.name][i]>0){
                if(!array[i].checked && mat[u.name][i]<array[i].key){
                    array[i].key= mat[u.name][i];
                    array[i].parent = u.name;
                    pq.add(array[i]);
                }
            }
        }
        array[u.name].checked=true;
    }

      
        int sum=0;
        for (int i = 0; i <array.length; i++) {
            System.out.println("The Node "+array[i].name+" Has a Parent "+array[i].parent+" cost Of "+array[i].key);
            
            sum=sum+array[i].key;
        }
        
        System.out.println("sum of MST "+sum);
       
       
       
     
    }
}
