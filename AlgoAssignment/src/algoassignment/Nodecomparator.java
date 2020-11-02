/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoassignment;

import java.util.Comparator;

/**
 *
 * @author Md Rifat
 */
public class Nodecomparator implements Comparator<Node> {
    public int compare(Node v1, Node v2){
        if(v1.cost>v2.cost) return 1;
        else if(v1.cost<v2.cost) return -1;
        return 0;
    }
}
