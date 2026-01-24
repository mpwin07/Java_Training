// Reversing a number means rearranging its digits in the opposite order. For example:
// The reverse of 1234 is 4321
// The reverse of 9870 is 789 (since leading zeros in the reversed number are not shown)
// Write a Java program that takes an integer input from the user and then reverses its digits using a while loop.
// The program should repeatedly extract the last digit of the number using the modulus operator (%) and then build the reversed
// number.
// The loop should continue until the number becomes 0.
// Finally, display the reversed number as output.

import java.util.*;
public class rev_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n>0){
            int d = n%10;
            rev = rev*10 + d;
            n = n/10;
        }
        System.out.println(rev);
    }
}
