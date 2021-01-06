

import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u = 0, l = 0;
        String word = sc.nextLine();
        char ch[] = word.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int num = (int) ch[i];
            if ((num >= 65) && (num <= 90)) {
                u++;
            } else if ((num >= 97) && (num <= 122)) {
                l++;
            }
        }

        if (u == l) {
            for (int i = 0; i < ch.length; i++) {
                int num = (int) ch[i];
                if ((num >= 65) && (num <= 90)) {
                    ch[i] = (char) (ch[i] + 32);
                }
            }
        } else if (u > l) {
            for (int i = 0; i < ch.length; i++) {
                
                int num = (int) ch[i];
                if ((num >= 97) && (num <= 122)) {
                   ch[i] = (char) (ch[i] - 32);
                }
            }
        }else if (l>u){
             for (int i = 0; i < ch.length; i++) {
                int num = (int) ch[i];
                if ((num >= 65) && (num <= 90)) {
                    ch[i] = (char) (ch[i] + 32);
                }
            }
        }
        
        for (int i = 0; i <ch.length; i++) {
            System.out.print(ch[i]);
        }

    }

}
