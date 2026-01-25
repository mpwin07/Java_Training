// Write a Java Program to Check whether a number is an Armstrong number

import java.util.*;
public class armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int b = a;
        while(b!=0){
            int rem = b%10;
            sum = sum + (rem*rem*rem);
            b = b/10;
        }
        if(sum == a){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");  
        }
    }
}