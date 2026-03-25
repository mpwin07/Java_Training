// 2348. Number of Zero-Filled Subarrays

// Given an integer array nums, return the number of subarrays filled with 0.

// A subarray is a contiguous non-empty sequence of elements within an array.

 

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res =0, count =0 ;
        for(int i=0; i<nums.length; i++){
            if (nums[i] == 0)
            count += 1;
            else
            count = 0;

            res += count;
        }
        return res;
        
    }
}