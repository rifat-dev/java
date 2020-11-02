/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafile;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Md Rifat
 */
public class JavaFile {

    public static void main(String[] args) throws IOException {
       File dir=new File("Person");
       dir.mkdir();
       File file1=new File("E:/JAVA/JavaFile/Person/student.txt");
       
       try{
             file1.createNewFile();
       }catch(Exception e){
           System.out.println(e);
       }
    }
    
}
