//798. Smallest Rotation with Highest Score

import java.util.Scanner;

class hard {
    public int bestRotation(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n];

        for (int i = 0; i < n; i++) {
            int low = (i + 1) % n;
            int high = (i - nums[i] + n + 1) % n;

            diff[low] += 1;
            diff[high] -= 1;

            if (low >= high) {
                diff[0] += 1;
            }
        }

        int maxScore = 0, score = 0, ans = 0;

        for (int i = 0; i < n; i++) {
            score += diff[i];
            if (score > maxScore) {
                maxScore = score;
                ans = i;
            }
        }

        return ans;
    }
}

public class BestRotationProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        int N = sc.nextInt();
        int[] nums = new int[N];

        // Read array elements
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        // Call solution
        Solution sol = new Solution();
        int result = sol.bestRotation(nums);

        // Output result
        System.out.println(result);

        sc.close();
    }
}
