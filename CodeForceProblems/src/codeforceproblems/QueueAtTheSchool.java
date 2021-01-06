

import java.util.Scanner;

public class QueueAtTheSchool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        char ch[] = s.toCharArray();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < ch.length - 1; j++) {
                if (ch[j] == 'B' && ch[j + 1] == 'G') {
                    if (count != 1) {
                        char temp = ch[j + 1];
                        ch[j + 1] = ch[j];
                        ch[j] = temp;
                        count++;
                    }else{
                        count=0;
                    }
                }else{
                    count=0;
                }
                
                if(j==ch.length-2){
                    count=0;
                }
            }
        }

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }

}
