package Java;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int a, b, n;
        for (int i = 0; i < q; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {

                if (j == 0) {
                    sum = (a + 1 * b);
                    System.out.print(sum + " ");
                    
                } else {
                    sum = (int) (sum + (Math.pow(2, j)) * b);
                    System.out.print(sum + " ");
                    
                }
            }
            sum = 0;
            System.out.println();
            
        }
    }
}
