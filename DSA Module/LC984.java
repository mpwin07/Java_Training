// 984. String Without AAA or BBB

// Given two integers a and b, return any string s such that:

// s has length a + b and contains exactly a 'a' letters, and exactly b 'b' letters,
// The substring 'aaa' does not occur in s, and
// The substring 'bbb' does not occur in s.


class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();

        char A = 'a', B = 'b';

        while (a > 0 || b > 0) {

            if (a > b) {
                if (a > 1) {
                    sb.append("aa");
                    a -= 2;
                } else {
                    sb.append("a");
                    a--;
                }
                if (b > 0) {
                    sb.append("b");
                    b--;
                }
            } else if (b > a) {
                if (b > 1) {
                    sb.append("bb");
                    b -= 2;
                } else {
                    sb.append("b");
                    b--;
                }
                if (a > 0) {
                    sb.append("a");
                    a--;
                }
            } else {
                if (a > 0) {
                    sb.append("a");
                    a--;
                }
                if (b > 0) {
                    sb.append("b");
                    b--;
                }
            }
        }

        return sb.toString();
    }
}