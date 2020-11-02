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
public class LittleMatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int A[][]=new int[3][3];
        int B[][]=new int[3][3];
        int C[][]=new int[3][3];
        for ( i =1; i <=2; i++) {
            for ( j =1; j <=2; j++) {
                A[i][j]=sc.nextInt();
            }
        }
        for ( i =1; i <=2; i++) {
            for ( j = 1; j <=2; j++) {
                B[i][j]=sc.nextInt();
            }
        }
        
        C[1][1]= A[1][1] * B[1][1] + A[1][2] * B[2][1];
        C[1][2] = A[1][1] *  B[1][2] + A[1][2] * B[2][2];
        C[2][1] = A[2][1] *  B[1][1] + A[2][2]*B[2][1];
        C[2][2] = A[2][1] *  B[1][2] + A[2][2] * B[2][2];
        
        for (int k =1; k <=2; k++) {
            for (int l =1; l <=2; l++) {
                System.out.print(C[k][l]+" ");
            }
            System.out.println();
        }
        
    }
}
