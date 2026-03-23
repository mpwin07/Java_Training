// 172. Factorial Trailing Zeroes
// Given an integer n, return the number of trailing zeroes in n!.

    import java.util.*;
    public class LC172{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 0;
            if (n<5)
            System.out.println("0");
            while(n>=5){
                count = count + n/5;
                n = n/5;
            }
            System.out.println(count);
        }
    }