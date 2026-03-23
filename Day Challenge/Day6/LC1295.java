// 1295. Find Numbers with Even Number of Digits
// Given an array nums of integers, return how many of them contain an even number of digits.

import java.util.*;

class LC1295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();        // number of elements
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 0;

        for (int x : nums) {
            int digits = String.valueOf(x).length();
            if (digits % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
