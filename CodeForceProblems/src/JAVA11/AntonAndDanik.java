package JAVA11;

import java.util.Scanner;

public class AntonAndDanik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String n = sc.nextLine();
        sc.close();
        int a = 0;
        int d = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'A') {
                a++;
            } else {
                d++;
            }
        }

        System.out.println(a > d ? "Anton" : d > a ? "Danik" : "Friendship");
    }
}
