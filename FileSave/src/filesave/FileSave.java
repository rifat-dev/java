/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesave;

import java.io.File;

/**
 *
 * @author Md Rifat
 */
public class FileSave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File drt=new File("Student");
       drt.mkdir();
       File file=new File("E:/JAVA/FileSave/student/student.txt");
       try{
           file.createNewFile();
       }catch(Exception e){
           System.out.println(e);
       }
    }
    
}
