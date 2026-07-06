//1518. Water Bottles

import java.util.Scanner;

public class easy {

    public int numWaterBottles(int numBottles, int numExchange) {
        //Type code here
        int res = 0, empty = 0;
        while(numBottles > 0){
            res += numBottles;
            empty += numBottles;
            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.print("Enter number of bottles: ");
        int numBottles = sc.nextInt();

        //System.out.print("Enter exchange rate: ");
        int numExchange = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.numWaterBottles(numBottles, numExchange);

        System.out.println(result);

        sc.close();
    }
}