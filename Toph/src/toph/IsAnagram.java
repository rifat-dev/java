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
public class IsAnagram {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        String A=n.nextLine();
        String B=n.nextLine();
        char ch[]=A.toCharArray();
        int size=A.length();
        char ch1[]=B.toCharArray();
        int size1=B.length();
        int count=0;
        for (int i = 0; i <size; i++) {
            int j=0;
            for ( j = 0; j <size1; j++) {
                if(ch[i]==ch1[j]){
                  count++;
                }
            }
        }
        if(count==size){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
      
    }
}
