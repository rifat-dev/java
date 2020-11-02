
package toph;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float sum = 0;
        float average;
        int count = 0,i=0;
        float a[]=new float[1000];
        int N=input.nextInt();
        for ( i = 0; i <N; i++) {
            a[i]=input.nextFloat();
        }
        for ( i = 0; i <N; i++) {
            count++;
        sum=(sum+a[i]);
        average=sum/count;
        System.out.println(average);
        }
       
        
        
    }
}
