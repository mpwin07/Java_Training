// 798. Smallest Rotation with Highest Score

// Given an array nums, you rotate it k times.

// Score = number of elements where nums[i] <= i after rotation.

// Return the k that gives maximum score.
// If multiple → return smallest k.

class Solution {
    public int bestRotation(int[] nums) {
        int n = nums.length;
        int[] change = new int[n];

        for (int i = 0; i < n; i++) {
            int low = (i + 1) % n;
            int high = (i - nums[i] + n + 1) % n;

            change[low] += 1;
            change[high] -= 1;

            if (low >= high) {
                change[0] += 1;
            }
        }

        int maxScore = 0;
        int score = 0;
        int bestK = 0;

        for (int k = 0; k < n; k++) {
            score += change[k];

            if (score > maxScore) {
                maxScore = score;
                bestK = k;
            }
        }
             
        return bestK;
    } 
}