// 74. Search a 2D Matrix

// You are given an m x n matrix where:

// Each row is sorted
// First element of each row > last element of previous row

// Given a target, return true if found, else false.


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0,c=matrix[0].length-1;

        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return true;
            }
            if(matrix[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return false;
    }
}