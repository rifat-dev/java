/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;

/**
 *
 * @author Md Rifat
 */
public class Arraylistdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<Integer>();
        System.out.println("Size = "+num.size());
        
        num.add(10);
        num.add(20);
        num.add(40);
        num.add(30);
        num.remove(2);
        System.out.print(num);
//        method and function
        num.get(2); // index theke value newer jonno
        num.indexOf(10);// index position janar jonno
        num.remove(10); // value remove korar jonno
       num.set(0, 70);// value replice korar jonno
    }
    
}
