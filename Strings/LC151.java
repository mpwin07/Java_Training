// 151 – Reverse Words in a String

// Given a string s, reverse the order of words.
// Remove leading, trailing, and extra spaces so that words are separated by a single space.


import java.util.*;

public class Main {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i != 0) res.append(" ");
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.print(reverseWords(s));
    }
}