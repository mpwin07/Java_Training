// 41. First Missing Positive

// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 




import java.util.*;

class Solution {
    public int firstMissingPositive(int[] A) {
        int n = A.length;

        // Step 1: Replace negatives with 0
        for (int i = 0; i < n; i++) {
            if (A[i] < 0) {
                A[i] = 0;
            }
        }

        // Step 2: Mark presence
        for (int i = 0; i < n; i++) {
            int val = Math.abs(A[i]);

            if (val >= 1 && val <= n) {
                if (A[val - 1] > 0) {
                    A[val - 1] *= -1;
                } 
                else if (A[val - 1] == 0) {
                    A[val - 1] = -(n + 1);
                }
            }
        }

        // Step 3: Find first missing positive
        for (int i = 1; i <= n; i++) {
            if (A[i - 1] >= 0) {
                return i;
            }
        }

        return n + 1;
    }
}