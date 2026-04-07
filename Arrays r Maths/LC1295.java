// 1295. Find Numbers with Even Number of Digits

// Given an array nums of integers, return how many of them contain an even number of digits.

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int n : nums){
            int digit = String.valueOf(n).length();
            if(digit % 2 == 0)
            count++;
        }
        return count;
    }

}
