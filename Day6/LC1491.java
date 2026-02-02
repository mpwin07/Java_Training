// 1491. Average Salary Excluding the Minimum and Maximum Salary
// You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
// Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.


import java.util.*;

public class LC1491 {
    public static double average(int[] salary) {
        int sum = 0, min = salary[0], max = salary[0];

        for (int s : salary) {
            sum += s;
            if (s < min) min = s;
            if (s > max) max = s;
        }

        return (double)(sum - min - max) / (salary.length - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] salary = new int[n];

        for (int i = 0; i < n; i++) {
            salary[i] = sc.nextInt();
        }

        System.out.println(average(salary));
    }
}
