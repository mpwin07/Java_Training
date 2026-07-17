//https://leetcode.com/problems/backspace-string-compare

import java.util.*;

public class prog {

    private static String process(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static boolean backspaceCompare(String s, String t) {
        return process(s).equals(process(t));
    }

    private static String removeQuotes(String s) {
        if (s.length() >= 2 && s.charAt(0) == '"' && s.charAt(s.length() - 1) == '"') {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = removeQuotes(sc.nextLine());
        String t = removeQuotes(sc.nextLine());

        System.out.println(backspaceCompare(s, t));

        sc.close();
    }
}