// 844. Backspace String Compare

// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

// Note that after backspacing an empty text, the text will continue empty.

class Solution {

    // Main function
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    // Helper function (separate, not inside above)
    public String build(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != '#') sb.append(c);
            else if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }
}