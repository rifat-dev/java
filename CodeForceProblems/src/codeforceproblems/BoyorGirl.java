
import java.util.Scanner;

public class BoyorGirl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        String name = sc.nextLine().toLowerCase();
        char ch[] = name.toCharArray();

        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] != 0) {
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        ch[j]=0;
                        count++;
                    }
                }
            }
        }

   
        int result = ch.length - count;
        if (result % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }
}
