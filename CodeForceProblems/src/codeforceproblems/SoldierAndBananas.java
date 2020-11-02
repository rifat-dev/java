

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int totallAmount=0;
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        
        for (int i = 1; i <=w; i++) {
            totallAmount=i*k+totallAmount;
        }
        
        if((totallAmount-n)>0){
            System.out.println(totallAmount-n);
        }else{
            System.out.println("0");
        }
        
    }
}
