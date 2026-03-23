// 76. Minimum Window Substring
// Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
// The testcases will be generated such that the answer is unique.

import java.util.*;

class LC76 {
    public String minWindow(String s, String t) {
        if (t.length() == 0) return "";
        Map<Character, Integer> needMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            needMap.put(c, needMap.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> winMap = new HashMap<>();

        int have = 0;
        int need = needMap.size();

        int l = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            winMap.put(c, winMap.getOrDefault(c, 0) + 1);

            if (needMap.containsKey(c) && winMap.get(c).equals(needMap.get(c))) {
                have++;
            }

            while (have == need) {
                if ((r - l + 1) < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }

                char leftChar = s.charAt(l);
                winMap.put(leftChar, winMap.get(leftChar) - 1);

                if (needMap.containsKey(leftChar) && winMap.get(leftChar) < needMap.get(leftChar)) {
                    have--;
                }

                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        LC76 sol = new LC76();
        System.out.println(sol.minWindow(s, t));
    }

}