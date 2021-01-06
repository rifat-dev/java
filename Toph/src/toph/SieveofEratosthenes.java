
import java.util.Scanner;
public class SieveofEratosthenes {

    public static int prime[] = new int[1000100];

    static void isprime() {
        for (int i = 2; i <=1000000; i++) {
            prime[i]=1;
        }
        prime[0] = prime[1] = 1;
        for (int j = 2; j * j < 1000001; j ++) {        
                for (int k = j * j; k < 1000001; k += j) {
                    prime[k] = 0;
                }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reng = sc.nextInt();
        int num;
        isprime();
        for (int i = 0; i < reng; i++) {
            num = sc.nextInt();
            if (prime[num] == 1) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}
