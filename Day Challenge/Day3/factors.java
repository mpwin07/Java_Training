// Write a Java program to find and display all factors of a given number

import java.util.*;
public class factors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            if(a%i==0)
            System.out.print(i+" ");

        }
    }
}