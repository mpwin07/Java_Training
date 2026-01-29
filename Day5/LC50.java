// 50. Pow(x, n)
// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

import java.util.Scanner;
class LC50 {
    static double myPow(double x, int n) {
        return Math.pow(x,n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(myPow(x,n));
    }
}