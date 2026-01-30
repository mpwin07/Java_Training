// 11. Container With Most Water
// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.

 


import java.util.*;

class LC11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int l = 0, r = n - 1, max = 0;

        while (l < r) {
            int area = Math.min(h[l], h[r]) * (r - l);
            max = Math.max(max, area);

            if (h[l] < h[r])
                l++;
            else
                r--;
        }

        System.out.println(max);
    }
}
