// 26. Remove Duplicates from Sorted Array
// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
// Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.
// The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.



import java.util.*;

class LC26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int j = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] != a[j]) {
                j++;
                a[j] = a[i];
            }
        }

        System.out.println(j + 1);
        for (int i = 0; i <= j; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
