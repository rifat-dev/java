package toph;


import java.util.Scanner;


public class Maximum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max=0;
        int array[]=new int[1000];
        int N=input.nextInt();
        for (int i = 0; i <N; i++) {
            array[i]=input.nextInt();
        }
        for (int i = 0; i <N; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
        
    }
}
