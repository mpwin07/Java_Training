// 258. Add Digits
// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

import java.util.*;
public class LC258{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        if(n<=0)
        System.out.println("0");
        else{
            r = 1 +((n-1)%9);
            System.out.println(r);
        }
    }
}