
package JAVA11;

import java.util.Scanner;

public class Translation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        StringBuilder t = new StringBuilder(sc.nextLine()).reverse();
        
        System.out.println(t.toString().equals(s) ? "YES" : "NO" );
    }
}
