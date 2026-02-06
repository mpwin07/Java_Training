// 414. Third Maximum Number
// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 


import java.util.*;

public class LC414 {

    public static int thirdMax(int[] nums) {
        Integer max = null;
        Integer s_max = null;
        Integer t_max = null;

        for (Integer num : nums) {

            if ((max != null && num.equals(max)) ||
                (s_max != null && num.equals(s_max)) ||
                (t_max != null && num.equals(t_max))) {
                continue;
            }

            if (max == null || num > max) {
                t_max = s_max;
                s_max = max;
                max = num;
            }
            else if (s_max == null || num > s_max) {
                t_max = s_max;
                s_max = num;
            }
            else if (t_max == null || num > t_max) {
                t_max = num;
            }
        }

        if (t_max == null)
            return max;
        return t_max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(thirdMax(nums));
    }
}
