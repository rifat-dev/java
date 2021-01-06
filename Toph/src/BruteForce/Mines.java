/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BruteForce;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class Mines {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r, c;
        r = in.nextInt();
        c = in.nextInt();
        int count = 0;
        char a[][] = new char[r][c];

        for (int i = 0; i < r; i++) {
            String m = in.next();
            int k = 0;
            for (int j = 0; j < c; j++) {  //directly putting data into tha safety box
                a[i][j] = m.charAt(k);
                k++;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == '.') {
                    if ((1 <= i) && (i < r - 1) && (1 <= j) && (j < c - 1)) {
                        if (a[i + 1][j] == '*') {
                            count++;
                        }
                        if (a[i - 1][j] == '*') {
                            count++;
                        }
                        if (a[i][j + 1] == '*') {
                            count++;
                        }
                        if (a[i][j - 1] == '*') {
                            count++;
                        }
                        if (a[i + 1][j + 1] == '*') {
                            count++;
                        }
                        if (a[i + 1][j - 1] == '*') {
                            count++;
                        }
                        if (a[i - 1][j + 1] == '*') {
                            count++;
                        }
                        if (a[i - 1][j - 1] == '*') {
                            count++;
                        }
                    } else if ((i == 0) && (j == 0)) {
                        if (a[i + 1][j] == '*') {
                            count++;
                        }
                        if (a[i][j + 1] == '*') {
                            count++;
                        }
                        if (a[i + 1][j + 1] == '*') {
                            count++;
                        }
                    } else if ((i == 0) && (j == c - 1)) {
                        if (a[i][j - 1] == '*') {
                            count++;
                        }
                        if (a[i + 1][j] == '*') {
                            count++;
                        }
                        if (a[i + 1][j - 1] == '*') {
                            count++;
                        }
                    } else if ((i == r - 1) && (j == 0)) {
                        if (a[i - 1][j] == '*') {
                            count++;
                        }
                        if (a[i][j + 1] == '*') {
                            count++;
                        }
                        if (a[i - 1][j + 1] == '*') {
                            count++;
                        }
                    } else if ((i == r - 1) && (j == c - 1)) {
                        if (a[i - 1][j] == '*') {
                            count++;
                        }
                        if (a[i][j - 1] == '*') {
                            count++;
                        }
                        if (a[i - 1][j - 1] == '*') {
                            count++;
                        }
                    } else if ((i == 0) && (1 <= j) && (j < c - 1)) {
                        if (a[i][j + 1] == '*') {
                            count++;
                        }
                        if (a[i][j - 1] == '*') {
                            count++;
                        }
                        if (a[i + 1][j - 1] == '*') {
                            count++;
                        }
                        if (a[i + 1][j] == '*') {
                            count++;
                        }
                        if (a[i + 1][j + 1] == '*') {
                            count++;
                        }
                    } else if ((j == 0) && (1 <= i) && (i < r - 1)) {
                        if (a[i + 1][j] == '*') {
                            count++;
                        }
                        if (a[i - 1][j] == '*') {
                            count++;
                        }
                        if (a[i + 1][j + 1] == '*') {
                            count++;
                        }
                        if (a[i][j + 1] == '*') {
                            count++;
                        }
                        if (a[i - 1][j + 1] == '*') {
                            count++;
                        }
                    } else if ((i == r - 1) && (1 <= j) && (j < c - 1)) {
                        if (a[i][j + 1] == '*') {
                            count++;
                        }
                        if (a[i][j - 1] == '*') {
                            count++;
                        }
                        if (a[i - 1][j - 1] == '*') {
                            count++;
                        }
                        if (a[i - 1][j] == '*') {
                            count++;
                        }
                        if (a[i - 1][j + 1] == '*') {
                            count++;
                        }
                    } else if ((j == c - 1) && (1 <= i) && (i < r - 1)) {
                        if (a[i + 1][j] == '*') {
                            count++;
                        }
                        if (a[i - 1][j] == '*') {
                            count++;
                        }
                        if (a[i + 1][j - 1] == '*') {
                            count++;
                        }
                        if (a[i][j - 1] == '*') {
                            count++;
                        }
                        if (a[i - 1][j - 1] == '*') {
                            count++;
                        }
                    } else {
                        break;
                    }

                }
                if (count > 0) {
                    switch (count) {
                        case 1:
                            a[i][j] = '1';
                            count = 0;
                            break;
                        case 2:
                            a[i][j] = '2';
                            count = 0;
                            break;
                        case 3:
                            a[i][j] = '3';
                            count = 0;
                            break;
                        case 4:
                            a[i][j] = '4';
                            count = 0;
                            break;
                        case 5:
                            a[i][j] = '5';
                            count = 0;
                            break;
                        case 6:
                            a[i][j] = '6';
                            count = 0;
                            break;
                        case 7:
                            a[i][j] = '7';
                            count = 0;
                            break;
                        case 8:
                            a[i][j] = '8';
                            count = 0;
                            break;
                        default:
                            break;
                    }
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
