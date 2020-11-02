/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;

/**
 *
 * @author Md Rifat
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> number =new ArrayList<Integer>();
        System.out.println(number.size());
        number.add(10);
         number.add(20);
          number.add(30);
          
          for (int i : number) {
              System.out.print(i+" ");
        }
         System.out.println();
          number.remove(1);
          for(int i : number){
              System.out.print(i+" ");
          }
         
    }
}
