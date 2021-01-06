package DataStracture;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maximum = new Stack<>();

        while (n > 0) {
            int choice = sc.nextInt();
            if (choice == 1) {
                int val = sc.nextInt();
                stack.push(val);
                if (maximum.isEmpty()) {
                    maximum.push(val);
                } else {
                    if (val >= maximum.peek()) {
                        maximum.push(val);
                    }
                }
            } else if (choice == 2) {
                if (!stack.isEmpty()) {

                    int value = stack.pop();

                    if (value == maximum.peek()) {
                        maximum.pop();
                    }

                }

            } else if (choice == 3) {
                if (!maximum.isEmpty()) {
                    System.out.println(maximum.peek());
                }
            }

            n--;
        }
    }
}
