// 1051. Height Checker
// A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
// You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
// Return the number of indices where heights[i] != expected[i].

 


import java.util.*;

class LC1051 {

    static int check(int[] a){
        int[] b = a.clone();
        Arrays.sort(b);
        int c = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] != b[i]) c++;
        }
        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();

        System.out.println(check(a));
    }
}
