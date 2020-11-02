/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

/**
 *
 * @author Md Rifat
 */
public class Test {
    public static void main(String[] args) {
        try{
            Float f1=new Float("3.0");
            int x= f1.intValue();
            byte b= f1.byteValue();
            double d=f1.byteValue();
            System.out.println(x+b+d);
            /* Here is a comment **** */
            
            
        }catch(Exception e){
            System.out.println("bad Number");
        }
            
    }
}
