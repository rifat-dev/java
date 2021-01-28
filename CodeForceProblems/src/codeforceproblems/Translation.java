
import java.util.Scanner;

public class Translation {

    public static void matching(char ch[], char ch1[]) {

        if (ch.length == ch1.length) {
            int match = 0;

            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == ch1[ch1.length - 1 - i]) {
                    match++;
                }
            }

            if (match != ch.length) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }else{
             System.out.println("NO");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        char ch[] = s.toCharArray();
        char ch1[] = t.toCharArray();

        matching(ch, ch1);

    }

}
