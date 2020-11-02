/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class Union {
        public static void sort(int c[],int k){
        int temp;
        for (int i = 0; i <k-1; i++) {
            for (int j = 0; j <k-1-i; j++) {
                if(c[j]>c[j+1]){
                    temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }
    }
    public static void display(int c[],int k){
        for (int i = 0; i <k; i++) {
                if(i!=k-1){
                    System.out.print(c[i]+" ");
                }else{
                    System.out.print(c[i]+"");
                }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int a[]=new int[N];
        int b[]=new int[M];
        int c[]=new int[N+M];
        for (int i = 0; i <N; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i <M; i++) {
            b[i]=sc.nextInt();
        }
        int k=0;
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <M; j++) {
                 if(a[i]==b[j]){
                     b[j]=0;
                 }
            }
            c[i]=a[i];
            k++;
            
        }
        for (int i =0; i <M; i++) {
            if(b[i]!=0){
                c[k]=b[i];
                k++;
            }
        }
        
        sort(c,k);
        display(c,k);
        
    }
}
