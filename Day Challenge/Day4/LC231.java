// 231. Power of Two
// Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n == 2x.

import java.util.*;
public class LC231{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<=0)
        System.out.println("false");
        else{
            if((n & (n-1)) == 0)
            System.out.println("true");
            else
            System.out.println("false");
        }
    }
}