package DataStracture;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int h3 = sc.nextInt();
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int d1=0,d2=0,d3=0;
       
        ArrayList<Integer> stack1  = new ArrayList<>();
         ArrayList<Integer> stack2  = new ArrayList<>();
        ArrayList<Integer> stack3  = new ArrayList<>();

        for (int i = 0; i < h1; i++) {
            int n = sc.nextInt();
            stack1.add(n);
            sum1 = sum1 + n;
        }

        for (int i = 0; i < h2; i++) {
            int n = sc.nextInt();
             stack2.add(n);
            sum2 = sum2 + n;
        }

        for (int i = 0; i < h3; i++) {
            int n = sc.nextInt();
             stack3.add(n);
            sum3 = sum3 + n;
        }

        while (true) {
            if(h1==d1 || h2==d2 || h3==d3){
                System.out.println("0");
                break;
            }
            
            if (sum1 == sum2 && sum2 == sum3) {
                System.out.println(sum1);
                break;
            } 
            
            if(sum1>=sum2 && sum1>=sum3){
                int a = stack1.get(d1);
                d1++;
                sum1 = sum1 - a;
            }else if(sum2>=sum1 && sum2>=sum3){
                int a = stack2.get(d2);
                d2++;
                sum2 = sum2 - a;
            }else if(sum3>=sum1 && sum3>=sum2){
                int a = stack3.get(d3);
                d3++;
                sum3 = sum3 - a;
            }
            
           
        } 

    }
}
