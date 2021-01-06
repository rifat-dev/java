//package AddHoc;

import java.util.Scanner;

public class AloynaandCanBuying {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int maxTypes = 0, minTypes = 0;
        int maxValue = 0, minValue = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] != -1) {
                count++;
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        array[j]=-1;
                        count++;
                    }
                }
                              
                if (maxTypes < count) {
                    maxTypes = count;
                    maxValue = array[i];
                    count = 0;
                } else if (maxTypes == count) {
                    if (minValue > array[i] || minValue == 0) {
                        minTypes = count;
                        minValue = array[i];
                        count = 0;
                    } else {
                        count = 0;
                    }

                }
            }
        }

        if (maxTypes == minTypes) {
            if(maxValue>minValue){
                System.out.println( minValue); 
            }else{
                System.out.println( maxValue);
            }    
        } else {
            System.out.println(maxValue);
        }

    }
}
