// 1672. Richest Customer Wealth
// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.


import java.util.*;

public class LC1672 {

    public static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] acc = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                acc[i][j] = sc.nextInt();
            }
        }

        int result = maximumWealth(acc);
        System.out.println(result);
    }
}


// class Solution {
//     public int maximumWealth(int[][] accounts) {
//         int r = accounts.length;
//         int c = accounts[0].length;
//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<r;i++){
//             int sum =0 ;
//             for(int j=0;j<c;j++){
//                 sum += accounts[i][j];
//             }
//             max = Math.max(sum,max);
//         }
//         return max;
//     }
// }
