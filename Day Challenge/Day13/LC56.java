import java.util.*;

public class LC56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of intervals
        int[][] intervals = new int[n][2];

        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt(); // start
            intervals[i][1] = sc.nextInt(); // end
        }

        int[][] res = merge(intervals);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }

    public static int[][] merge(int[][] intervals) {
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
}
