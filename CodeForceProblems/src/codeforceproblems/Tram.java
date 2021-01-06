
import java.util.Scanner;


public class Tram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=0,capacity=0;
        for (int i = 0; i <n; i++) {
            a=sc.nextInt();
            a=b-a;
            b=sc.nextInt();
            b=b+a;
            if(b>capacity){
                capacity=b;
            }
        }
        System.out.println(capacity);
    }
}
