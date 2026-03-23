// 424. Longest Repeating Character Replacement
// You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
// Return the length of the longest substring containing the same letter you can get after performing the above operations.

import java.util.*;

public class LC424 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();  // uppercase string
        int k = sc.nextInt();

        int[] count = new int[26]; 
        int l = 0;
        int maxf = 0;
        int res = 0;

        for (int r = 0; r < s.length(); r++) {

            count[s.charAt(r) - 'A']++;
            maxf = Math.max(maxf, count[s.charAt(r) - 'A']);
            while ((r - l + 1) - maxf > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }

            res = Math.max(res, r - l + 1);
        }

        System.out.println(res);
    }
}
