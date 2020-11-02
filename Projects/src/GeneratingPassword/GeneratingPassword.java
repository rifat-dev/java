/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneratingPassword;

// Java code to explain how to generate random 
// password 
// Here we are using random() method of util 
// class in Java 
import java.util.*;

public class GeneratingPassword {

    static char[] generatePass(int ln) {
        // A strong password has Cap_chars, Lower_chars, 
        // numeric value and symbols. So we are using all of 
        // them to generate our password 
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        String value = Capital_chars + Small_chars + numbers + symbols;

        Random num = new Random();

        char password[] = new char[ln];
        
        // Use of charAt() method : to get character value 
        // Use of nextInt() as it is scanning the value as int 
        
        for (int i = 0; i < ln; i++) {
            password[i] = value.charAt(num.nextInt(value.length()));
        }
        return password;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The length of password: ");
        int length = sc.nextInt();

        System.out.print("Your new password is : ");
        System.out.println(generatePass(length));

    }
}
