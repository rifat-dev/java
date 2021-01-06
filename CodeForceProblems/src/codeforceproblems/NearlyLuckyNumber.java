

import java.util.Scanner;


public class NearlyLuckyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char a[] =s.toCharArray();
        int lucky = 0;
        
        for (int i = 0; i < a.length; i++) {
            if(a[i]=='4' || a[i]=='7'){
                lucky++;
            }
        }
       

        if (lucky == 4 || lucky == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
