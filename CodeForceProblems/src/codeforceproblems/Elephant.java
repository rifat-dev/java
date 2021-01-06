

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int step=0;
        
        while(x!=0){
            if(x<=5){
                step++;
                x=0;
            }else{
                x=x-5;
                step++;
            }
        }
        
        System.out.println(step);
    }
}
