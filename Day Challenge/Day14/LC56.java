// 56. Merge Intervals
// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

import java.util.*;

public class LC56 {

    static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int n = intervals.length;
        int[][] res = new int[n][2];
        int idx = 0;

        res[0] = intervals[0];

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= res[idx][1]) {
                res[idx][1] = Math.max(res[idx][1], intervals[i][1]);
            } else {
                idx++;
                res[idx] = intervals[i];
            }
        }

        return Arrays.copyOf(res, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int[][] res = merge(arr);

        for (int[] in : res) {
            System.out.println(in[0] + " " + in[1]);
        }
    }
}
