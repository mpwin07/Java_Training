// 42. Trapping Rain Water
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

import java.util.*;

class LC42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int l = 0, r = n - 1;
        int lmax = 0, rmax = 0, water = 0;

        while (l < r) {
            if (h[l] < h[r]) {
                if (h[l] >= lmax)
                    lmax = h[l];
                else
                    water += lmax - h[l];
                l++;
            } else {
                if (h[r] >= rmax)
                    rmax = h[r];
                else
                    water += rmax - h[r];
                r--;
            }
        }

        System.out.println(water);
    }
}
