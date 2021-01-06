
package QuickSort;

import java.util.Scanner;

public class QuickSort {
    
    public static void quickSort(int arr[],int low,int high){
        
        if (low<high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
        
    }
    
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;
 
        
        for (int j = low; j <=high-1; j++) {
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;           
            }
        }
        int temp = arr[i+1];
        arr[i+1]=pivot;
        arr[high]=temp;
                  
        return (i+1);
        
    }
    
    public static void display(int arr[]){
        System.out.println("Sorted Array : ");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        
        System.out.println("Enter Value : ");
        for (int i = 0; i <size; i++) {
            array[i]=sc.nextInt();
        }
        
        quickSort(array,0,array.length-1);
        display(array);
    }
}
