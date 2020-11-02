/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class ASCIIProgressBar {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a;
        int b=0;
        a=in.nextDouble();
        int c=(int)a;
        b=(int)(a/10);
        if(b==2){
             System.out.print("[++........] "+c+"%");
        }else if(b==3){
             System.out.print("[+++.......] "+c+"%");
        }else if(b==4){
             System.out.print("[++++......] "+c+"%");
        }else if(b==5){
             System.out.print("[+++++.....] "+c+"%");
        }else if(b==6){
             System.out.print("[++++++....] "+c+"%");
        }else if(b==7){
             System.out.print("[+++++++...] "+c+"%");
        }else if(b==8){
             System.out.print("[++++++++..] "+c+"%");
        }else if(b==9){
             System.out.print("[+++++++++.] "+c+"%");
        }else if(b==10){
             System.out.print("[++++++++++] "+c+"%");
        }else{
            if(a<10){
                System.out.print("[..........] "+c+"%");
            }else{
                System.exit(0);
            }
        }
    }
 
}
