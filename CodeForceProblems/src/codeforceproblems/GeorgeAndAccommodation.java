
import java.util.Scanner;


public class GeorgeAndAccommodation {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int room=0;
        int p,q;
         for (int i = 0; i <n; i++) {
             p = sc.nextInt();
             q = sc.nextInt();
             if(q - p >= 2){
                 room++;
             }
         }
         System.out.println(room);
    }
}
