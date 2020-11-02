/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

/**
 *
 * @author Md Rifat
 */
public class BianarySearch {
    public static void main(String[] args) {
        int a[]={2,4,6,10,15,27,38,40,90,100};
        int value=100;
        int left=0,right=a.length-1,mid;
        int count=0;
        
        while(left<=right){
            mid=(left+right)/2;
            count++;
           if ((a[mid]==value)){
             System.out.println("Item found in index "+mid);
               System.out.println(count);
             return;
           } else if(a[mid]<value){
             left=mid+1;
           }else {
              right=mid-1;
           }
       }
        System.out.println("Item not found");
        
        
    }
}
