// 139. Word Break

// Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

// Note that the same word in the dictionary may be reused multiple times in the segmentation.

class Solution{
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[n] = true;

        for(int i=n; i>=0; i--){
            for(String w : wordDict){
                if(i + w.length() <= s.length() && s.substring(i, i+w.length()).equals(w)){
                    dp[i] = dp[i+w.length()];
                }
                if(dp[i]){
                    break;
                }
            }
        }
        return dp[0];
    }
}