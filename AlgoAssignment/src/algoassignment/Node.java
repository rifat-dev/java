/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoassignment;

/**
 *
 * @author Md Rifat
 */
public class Node {
     public int node;
    public int cost;
    public int parent;
    public boolean checked;
    
    public Node(int n,int k,int p,boolean c){
        node=n;
        cost=k;
        parent=p;
        checked=c;
        
    }
}
