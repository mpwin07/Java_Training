// 912. Sort an Array
// Given an array of integers nums, sort the array in ascending order and return it.
// You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

import java.util.*;

public class LC912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // size
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sortArray(nums);

        for (int x : nums) {
            System.out.print(x + " ");
        }
    }

    public static void sortArray(int[] nums) {
        Arrays.sort(nums);
    }
}
