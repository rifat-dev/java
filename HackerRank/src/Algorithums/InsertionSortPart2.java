/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithums;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class InsertionSortPart2 {
     // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {
        
        for(int i = 1; i<arr.length;i++){
            for(int j = i; j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j] ;
                    arr[j] = arr[j-1] ;
                    arr[j-1] = temp; 
                }
            }
            
            for(int k = 0; k<arr.length; k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println("");
        }
           
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }
}
