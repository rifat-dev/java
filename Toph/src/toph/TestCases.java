
import java.util.Scanner;

public class TestCases {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int CPUL = sc.nextInt();
        int MEML = sc.nextInt();
        int wa[] = new int[N];
        int cpu[] = new int[N];
        int mle[] = new int[N];
        if ((N > 0) && (N < 10) && (CPUL > 0) && (CPUL < 16) && (MEML > 0) && (MEML < 512)) {
            for (int i = 0; i < N; i++) {
                wa[i] = sc.nextInt();
                cpu[i] = sc.nextInt();
                mle[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                if ((wa[i] == 0) && (cpu[i] <= CPUL) && (mle[i] <= MEML)) {
                    continue;
                } else {
                    if (wa[i] != 0) {
                        if (cpu[i] > CPUL) {
                            System.out.println("CLE");
                            System.exit(0);
                        } else if (mle[i]>MEML) {
                            System.out.println("MLE");
                            System.exit(0);
                        } else {
                            System.out.println("WA");
                            System.exit(0);
                        }
                    } else if (cpu[i] > CPUL) {
                        System.out.println("CLE");
                        System.exit(0);
                    } else {
                        System.out.println("MLE");
                        System.exit(0);
                    }
                }
            }
            System.out.println("AC");
        }
    }
}
