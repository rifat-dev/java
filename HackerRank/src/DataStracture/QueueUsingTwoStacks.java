package DataStracture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        
        
        while(n>0){
            int choice = sc.nextInt();
            if(choice==1){
                int val = sc.nextInt();
                queue.add(val);
            }else if (choice==2){
                queue.poll();
            }else{
                System.out.println(queue.peek());
            }
            
            n--;
        }
    }
}
