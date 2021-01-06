/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in); 
       int lineNumber = 0;
       while(sc.hasNext())
           System.out.println(++lineNumber+" "+sc.nextLine());
       sc.close();
    }
  
}
