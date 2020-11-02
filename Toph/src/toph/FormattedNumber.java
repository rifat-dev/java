/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class FormattedNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        NumberFormat myFormat = NumberFormat.getInstance();
        int A = s.nextInt();
        System.out.println(myFormat.format(A));
        
    }
}
