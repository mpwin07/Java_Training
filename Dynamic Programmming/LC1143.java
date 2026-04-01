// 1143. Longest Common Subsequence

// Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

// A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

// For example, "ace" is a subsequence of "abcde".
// A common subsequence of two strings is a subsequence that is common to both strings.


class Solution{
    public int longestChSubsequence(String t1, String t2){
        int n1 = t1.length();
        int n2 = t2.length();

        int[][] dp = new int [n1+1][n2+1];
        for(int i=n1-1; i>=0; i--){
            for(int j=n2-1; j>=0; j--){
                if(t1.charAt(i) == t2.charAt(j)){
                    dp[i][j] = 1 + dp[i+1][j+1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j+1] , dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }
}