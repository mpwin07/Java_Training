// 169. Majority Element
// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


class Solution {
    public int majorityElement(int[] nums) {
        int res =0, count =0;
        for(int i :nums){
            if(count == 0){
                res = i;
            }
            count += (res==i) ? 1 : -1;
        }
        return res;
        
    }
}