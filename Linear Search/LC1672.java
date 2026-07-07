//https://leetcode.com/problems/richest-customer-wealth/


class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] row : accounts){
            int sum = 0;
            for(int col : row){
                sum += col;
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}