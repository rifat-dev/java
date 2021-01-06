
//package AddHoc;
import java.util.Scanner;

public class AryasCounting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int h = 0;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if (a == b || a == c || b == c) {
                if (a < b) {
                    if (b != c) {
                        if (b < c) {
                            System.out.println("Case " + i + ": C");
                        } else {
                            System.out.println("Case " + i + ": B");
                        }
                    }else{
                        System.out.println("Case " + i + ": Confused");
                    }
                } else if (a < c) {
                    System.out.println("Case " + i + ": C");
                } else {
                    if (a != b && a != c) {
                        System.out.println("Case " + i + ": A");
                    } else {
                        System.out.println("Case " + i + ": Confused");
                    }
                }

            } else {
                if (a < b) {
                    if (b < c) {
                        System.out.println("Case " + i + ": C");
                    } else {
                        System.out.println("Case " + i + ": B");
                    }
                } else if (a < c) {
                    System.out.println("Case " + i + ": C");
                } else {
                    System.out.println("Case " + i + ": A");
                }
            }
        }
    }
}
