// Write a Java program to count how many factors a given number has

import java.util.*;
public class factorscount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0)
            count += 1;
        }
        count++;
        System.out.println(count);

    }
}