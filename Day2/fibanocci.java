// The Fibonacci series is a sequence of numbers in which each number is the sum of the two preceding ones. The series starts with 0 and
// 1. Therefore, the beginning of the series looks like this:
// 0, 1, 1, 2, 3, 5, 8, 13, ...
// Write a Java program that asks the user to enter how many terms of the Fibonacci series they want to display.
// Use a for loop to generate the series.
// The first two terms should always be 0 and 1.
// From the third term onwards, each term should be calculated as the sum of the previous two terms.
// Display the series in a clear and readable format

import java.util.*;
public class fibanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
