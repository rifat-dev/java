

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limakWeight=sc.nextInt();
        int bobWeight=sc.nextInt();
        int limakNewWeight=limakWeight;
        int bobNewWeight=bobWeight;
        
        int i=0;
        while(limakNewWeight<=bobNewWeight){
            limakNewWeight=limakNewWeight*3;
            bobNewWeight=bobNewWeight*2;
            i++;
        }
        System.out.println(i);
    }
}
