/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Md Rifat
 */
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> box=new ArrayList<>();
        box.add(30);
        box.add(20);
        box.add(10);
        box.add(40);
        box.add(10);
        System.out.println("Befor Sorting : "+box);
        
        
        //sorting 
        Collections.sort(box);
        System.out.println("After Sorting : "+box);
        
        //revarce methode
        Collections.sort(box,Collections.reverseOrder());
        System.out.println("After Revarce : "+box);
        
       

    }
}
