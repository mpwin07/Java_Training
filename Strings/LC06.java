// 6 – Zigzag Conversion

// Given a string s and an integer numRows, arrange the string in a zigzag pattern across rows and return the string read row by row.

import java.util.*;

public class Main {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();

        int i = 0, dir = 1;

        for (char c : s.toCharArray()) {
            rows[i].append(c);

            if (i == 0) dir = 1;
            else if (i == numRows - 1) dir = -1;

            i += dir;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) res.append(row);

        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = sc.nextInt();

        System.out.print(convert(s, n));
    }
}