/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafile;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class FileRide {
    public static void main(String[] args) {
        try{
            File ride=new File("E:/JAVA/JavaFile/Person/student.txt");
            Scanner n=new Scanner(ride);
            while(n.hasNext()){
                String array=n.next();
                System.out.println("id : "+array);
            }
            n.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
