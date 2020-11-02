/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class IncompatibleCrops {
    public static void main(String[] args) {
               Scanner in=new Scanner(System.in);
        int r,c;
        int count=0;
        char a[][]=new char[625][625];
        System.out.print("Enter Row Size :");
        r=in.nextInt();
        System.out.print("Enter Colaum Size : ");
        c=in.nextInt();
        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c; j++) {
                System.out.print("Array Element"+i+j+" :");
                a[i][j]=in.next().charAt(0);
            }
        }
        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c; j++) {
                if(a[i][j]!='*'){
                   if((1<=i)&&(i<r-1)&&(1<=j)&&(j<c-1)){
                    if((a[i][j]==(a[i][j-1])) && ((a[i-1][j])==a[i][j])&&((a[i][j+1])==a[i][j]) && ((a[i+1][j])==a[i][j])){
                    count++;
                    }
                  }else if((i==0)&&(j==0)){
                      if((a[i][j+1]=='.')&&(a[i+1][j]=='.')){
                          count++;
                      }
                  }else if((i==0)&&(j==c-1)){
                      if((a[i][j-1]=='.')&&(a[i+1][j]=='.')){
                      count++;
                  }
                  }else if((i==r-1)&&(j==0)){
                      if((a[i-1][j]=='.')&&(a[i][j+1]=='.')){
                          count++;
                      }
                  }else if((i==r-1)&&(j==c-1)){
                      if((a[i-1][j]=='.')&&(a[i][j-1]=='.')){
                          count++;
                      }
                  }else if((i==0)&&(1<=j)&&(j<c-1)){
                      if((a[i][j-1]=='.')&&(a[i][j+1]=='.')&&(a[i+1][j]=='.')){
                          count++;
                      }
                  }else if((j==0)&&(1<=i)&&(i<r-1)){
                      if((a[i-1][j]=='.')&&(a[i+1][j]=='.')&&(a[i][j+1]=='.')){
                          count++;
                      }
                  }else if((i==r-1)&&(1<=j)&&(j<c-1)){
                      if((a[i][j-1]=='.')&&(a[i][j+1]=='.')&&(a[i-1][j]=='.')){
                          count++;
                      }
                  }else if((j==c-1)&&(1<=i)&&(i<r-1)){
                      if((a[i-1][j]=='.')&&(a[i+1][j]=='.')&&(a[i][j-1]=='.')){
                          count++;
                      }
                  }
                }else{
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}
