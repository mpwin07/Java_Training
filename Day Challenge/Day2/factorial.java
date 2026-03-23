// In mathematics, the factorial of a non-negative integer n, denoted as n!, is the product of all positive integers less than or equal to n. For
// example:
// 5! = 5 × 4 × 3 × 2 × 1 = 120
// 3! = 3 × 2 × 1 = 6
// 0! is defined as 1.
// Write a Java program that prompts the user to enter a non-negative integer and then calculates and displays the factorial of the given
// number.
// Use a for loop to perform the calculation.
// Make sure to handle the case when the user enters 0.
// Display the result in a clear and user-friendly way

import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
