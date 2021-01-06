

import java.util.Scanner;


public class ArraysDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[]=new int [n];
        int a[]=new int[n];
        
        for (int i = 0; i <n; i++) {
            array[i]=sc.nextInt();
        }
        
        for (int i = 0; i <n; i++) {
            a[i]=array[n-1-i];
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        
        
    }
}
