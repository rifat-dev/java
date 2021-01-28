
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

        if (a > d) System.out.println("Anton");
        else if(a<d) System.out.println("Danik");
        else System.out.println("Friendship");
    }
}
