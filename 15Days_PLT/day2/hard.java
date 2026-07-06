//Wildcard Matching

import java.util.*;

class Solution {
    public boolean isMatch(String s, String p) {
        boolean dp[][] = new boolean[p.length() + 1][s.length() + 1];

        dp[0][0] = true;

        for (int i = 1; i <= p.length(); i++) {
            char pc = p.charAt(i - 1);

            if (pc == '*') {
                dp[i][0] = dp[i - 1][0];
            }

            for (int j = 1; j <= s.length(); j++) {
                char sc = s.charAt(j - 1);

                if (pc == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
                else if (pc == '?' || pc == sc) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }

        return dp[p.length()][s.length()];
    }
}

public class hard {

    static String removeQuotes(String str) {
        if (str.length() >= 2 &&
            str.charAt(0) == '"' &&
            str.charAt(str.length() - 1) == '"') {
            return str.substring(1, str.length() - 1);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String p = sc.nextLine();

        s = removeQuotes(s);
        p = removeQuotes(p);

        Solution sol = new Solution();
        boolean result = sol.isMatch(s, p);

        System.out.println(result);
    }
}