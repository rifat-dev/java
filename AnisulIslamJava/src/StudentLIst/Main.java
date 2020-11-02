/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentLIst;

import java.io.File;

/**
 *
 * @author Md Rifat
 */
public class Main {
    public static void main(String[] args) {
        try{             
        File file= new File("student");
        String path = file.getAbsolutePath();
   
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
}
