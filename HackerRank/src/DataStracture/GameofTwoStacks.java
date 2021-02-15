package DataStracture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GameofTwoStacks {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();

        for (int k = 0; k < g; k++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();

            Queue<Integer> A = new LinkedList<>();
            Queue<Integer> B = new LinkedList<>();

            for (int i = 0; i < a; i++) {
                A.add(sc.nextInt());
            }
            for (int i = 0; i < b; i++) {
                B.add(sc.nextInt());
            }

            int sum = 0;
            int moves = 0;

            while (!A.isEmpty() || !B.isEmpty()) {
               if(A.size()>B.size()){
                   sum = sum + A.poll();
                   
                   if(sum>x){                   
                       System.out.println(moves);
                       break;
                   }else{
                       moves++;   
                   }
               }else if(B.size()>A.size()){
                    sum = sum + B.poll();
                    
                   if(sum>x){                     
                       System.out.println(moves);
                       break;
                   }else{
                        moves++;
                        
                   }
               }else{
                   sum = sum + B.poll();
                   
                   if(sum>x){ 
                       System.out.println(moves);
                       break;
                   }else{
                       moves++;
                                   
                   } 
               }
            }
        }

    }
}
