// 844. Backspace String Compare

// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

// Note that after backspacing an empty text, the text will continue empty.

 


class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    public String build(String f){
        StringBuilder sb = new StringBuilder();

        for(char c : f.toCharArray()){
            if(c != '#')
            sb.append(c);
            else if(sb.length() > 0)
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}