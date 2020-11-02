/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package margSort;

import java.util.Scanner;

public class margSort {

    static void marge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int leftSide[] = new int[n1];
        int rightSide[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftSide[i] = arr[l + i];
        }

        for (int i = 0; i < n2; i++) {
            rightSide[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0, k = l;

        while ((i < n1) && (j < n2)) {
            if (leftSide[i] <= rightSide[j]) {
                arr[k] = leftSide[i];
                i++;
            } else {
                arr[k] = rightSide[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftSide[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightSide[j];
            j++;
            k++;
        }

    }

    static void sort(int arr[], int l, int r) {
        if (r > l) {
            int m = (r + l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);

            marge(arr, l, m, r);
        }
    }

    static void print(int arr[]) {
        System.out.println("Sorted : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Inpute values : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sort(array, 0, array.length-1);
        print(array);

    }
}
