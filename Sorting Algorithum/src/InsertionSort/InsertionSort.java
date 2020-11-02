/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSort;

/**
 *
 * @author Md Rifat
 */
public class InsertionSort {
    public static void main(String[] args) {
        int A[]={50, 40, 30, 20,10};
        
        for (int i = 1; i <A.length; i++) {
           int key=A[i];
           int j=i-1;
           while((j>=0)&&(A[j]>key)){
               A[j+1]=A[j];
               j=j-1;
               A[j+1]=key;           
           }
        }
        
        for (int i = 0; i <A.length; i++) {
            System.out.print(A[i]+" ");
        }
  
    }
}
