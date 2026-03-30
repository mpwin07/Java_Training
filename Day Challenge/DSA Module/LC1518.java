// 1518. Water Bottles

// You are given numBottles full water bottles and an integer numExchange.

// Each time you drink a bottle, you get an empty bottle.
// You can exchange numExchange empty bottles for 1 full bottle.

// Return the maximum number of bottles you can drink.

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;

        while (numBottles >= numExchange) {
            sum+=numBottles/numExchange;
            numBottles=(numBottles/numExchange)+(numBottles%numExchange);
        }

        return sum;
    }
}