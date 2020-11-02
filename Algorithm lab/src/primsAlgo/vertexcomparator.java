/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primsAlgo;

import java.util.Comparator;

/**
 *
 * @author Md Rifat
 */
public class vertexcomparator implements Comparator<vertex> {
    public int compare(vertex v1, vertex v2){
        if(v1.key>v2.key) return 1;
        else if(v1.key<v2.key) return -1;
        return 0;
    }
}
