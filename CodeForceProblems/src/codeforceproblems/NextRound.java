

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class NextRound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int score=0;
        int array[]= new int[n+1];
        for (int i = 1; i <=n; i++) {
            array[i]=sc.nextInt();
        }
        int number =array[k];
        for (int i =1; i <=n; i++) {
            if(array[i]>0&&(array[i]>=number)){
                score++;
            }
        }
        System.out.println(score);
        
        
        
    }
}
