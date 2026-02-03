// 557. Reverse Words in a String III
// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

import java.util.*;

public class LC557{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') {
                word.append(c);
            } else {
                ans.append(word.reverse());
                ans.append(" ");
                word.setLength(0);
            }
        }

        // last word
        ans.append(word.reverse());

        System.out.println(ans.toString());
    }
}
