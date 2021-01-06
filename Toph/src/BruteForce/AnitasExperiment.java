
import java.util.Scanner;

public class AnitasExperiment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            int arraySize = sc.nextInt();
            int goodDays = 0, badDays = 0, neutral = 0;
            int spacial = 0, none = 0, h = 0, l = 0;
            int array[] = new int[arraySize];

            for (int j = 0; j < array.length; j++) {
                array[j] = sc.nextInt();
            }

            for (int j = 1; j < arraySize; j++) {
                if (array[j - 1] < array[j]) {
                    goodDays++;
                    none++;
                    if (j != arraySize - 1) {
                        if ((array[j - 1] < array[j]) && (array[j] > array[j + 1])) {
                            spacial++;
                            if (h < l) {
                                h = l;
                                l = 0;
                            }else{
                                l=0;
                            }
                        }
                    }
                    if (spacial > 0) {
                        l++;

                    }

                } else if (array[j - 1] > array[j]) {
                    badDays++;
                    none--;
                    if (j != arraySize - 1) {
                        if ((array[j - 1] < array[j]) && (array[j] > array[j + 1])) {
                            spacial++;
                            if (h < l) {
                                h = l;
                                l = 0;
                            }else{
                                l=0;
                            }
                        }
                    }
                    if (spacial > 0) {
                        l++;
                    }
                } else if (array[j - 1] == array[j]) {
                    neutral++;
                    goodDays++;
                    badDays++;
                    if (j != arraySize - 1) {
                        if ((array[j - 1] < array[j]) && (array[j] > array[j + 1])) {
                            spacial++;
                           
                            if (h < l) {
                                h = l;
                                l = 0;
                              
                            }else{
                                l=0;
                            }
                        }
                    }
                    if (spacial > 0) {
                        l++;
                    }
                }
            }

            if (spacial > 1) {
                System.out.println(h-1);
            } else {
                if (neutral == arraySize - 1) {
                    System.out.println("neutral");
                } else if (goodDays == arraySize - 1) {
                    System.out.println("allGoodDays");
                } else if (badDays == arraySize - 1) {
                    System.out.println("allBadDays");
                } else {
                    System.out.println("none");
                }
            }
        }

    }

}
