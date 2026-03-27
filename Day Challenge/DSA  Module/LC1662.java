// 1662. Check If Two String Arrays are Equivalent

// You are given two string arrays word1 and word2.

// Check if concatenating all strings in both arrays results in the same string.

// Return true or false.

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}