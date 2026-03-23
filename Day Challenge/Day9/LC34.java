// 34. Find First and Last Position of Element in Sorted Array
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

import java.util.*;

public class LC34 {

    public static int first(int[] a, int t) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == t) {
                ans = m;
                r = m - 1;
            } else if (a[m] < t) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }

    public static int last(int[] a, int t) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == t) {
                ans = m;
                l = m + 1;
            } else if (a[m] < t) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int f = first(nums, target);
        int l = last(nums, target);

        System.out.println(f + " " + l);
    }
}
