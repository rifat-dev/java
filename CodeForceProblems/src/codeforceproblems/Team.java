

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,b,c;
        int takenProblem=0;
        for (int i = 0; i <n; i++) {
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if((a==1)&&(b==1)&&(c==1)){
                takenProblem++;
            }else if((a==1)&&(b==1)&&(c==0)){
                takenProblem++;
            }else if((a==1)&&(c==1)&&(b==0)){
                takenProblem++;
            }else if((b==1)&&(c==1)&&(a==0)){
                takenProblem++;
            }else{
                continue;
            }
            
        }
        System.out.println(takenProblem);
    }
}
