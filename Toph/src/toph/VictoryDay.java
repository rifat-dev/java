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
public class VictoryDay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i = 0; i <T; i++) {
            int n=sc.nextInt();
            if(n==1){
                System.out.println("Bir Sreshtho Engine Room Artificer Mohammad Ruhul Amin: Amra Tomay Vulbo Na.");
            }else if(n==2){
                System.out.println("Bir Sreshtho Sepahi Hamidur Rahman: Amra Tomay Vulbo Na.");
            }else if(n==3){
                System.out.println("Bir Sreshtho Sepahi Muhammad Mustafa Kamal: Amra Tomay Vulbo Na.");
            }else if(n==4){
                System.out.println("Bir Sreshtho Captain Mohiuddin Jahangir: Amra Tomay Vulbo Na.");
            }else if(n==5){
                System.out.println("Bir Sreshtho Flight Lieutenant Matiur Rahman: Amra Tomay Vulbo Na.");
            }else if(n==6){
                System.out.println("Bir Sreshtho Lance Naik Munshi Abdur Rouf: Amra Tomay Vulbo Na.");
            }else if(n==7){
                System.out.println("Bir Sreshtho Lance Naik Noor Mohammad Sheikh: Amra Tomay Vulbo Na.");
            }
        }
    }
}
