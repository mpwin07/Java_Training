// 1051. Height Checker
// A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
// You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
// Return the number of indices where heights[i] != expected[i].

import java.util.*;

public class LC1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();        // size of array
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        System.out.println(heightChecker(h));
    }

    public static int heightChecker(int[] h) {
        int[] exp = h.clone();
        Arrays.sort(exp);

        int c = 0;
        for (int i = 0; i < h.length; i++) {
            if (h[i] != exp[i]) c++;
        }
        return c;
    }
}
