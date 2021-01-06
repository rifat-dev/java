/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithem;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class HeapSort {

    static void heapsort(int array[]) {
        int length = array.length;

        for (int i = length / 2 - 1; i >= 0; i--) {
            maxHeapify(array, length, i);
        }

        for (int i = length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            maxHeapify(array, i,0);
        }
    }

    static void maxHeapify(int array[], int length, int i) {
        int large = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < length && array[left] > array[large]) {
            large = left;
        }
        if (right < length && array[right] > array[large]) {
            large = right;
        }

        if (large != i) {
            int temp = array[i];
            array[i] = array[large];
            array[large] = temp;

            maxHeapify(array, length, large);
        }
    }

    static void display(int array[]) {
        System.out.println("Sorted Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Array Size: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Inpute The Values :");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        heapsort(array);
        display(array);

    }
}
