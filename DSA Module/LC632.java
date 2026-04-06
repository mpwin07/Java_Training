// 632. Smallest Range Covering Elements from K Lists

// You have k lists of sorted integers in non-decreasing order. Find the smallest range that includes at least one number from each of the k lists.

// We define the range [a, b] is smaller than range [c, d] if b - a < d - c or a < c if b - a == d - c.


import java.util.*;
class Solution {
    static class Node {
        int value;
        int row;   
        int col;   
        Node(int v, int r, int c) {
            value = v;
            row = r;
            col = c;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.value - b.value);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            int val = nums.get(i).get(0);
            pq.add(new Node(val, i, 0));
            max = Math.max(max, val);
        }
        int start = 0, end = Integer.MAX_VALUE;
        while (true) {
            Node curr = pq.poll();  
            int min = curr.value;
            if (max - min < end - start) {
                start = min;
                end = max;
            }
            if (curr.col + 1 < nums.get(curr.row).size()) {
                int nextVal = nums.get(curr.row).get(curr.col + 1);
                pq.add(new Node(nextVal, curr.row, curr.col + 1));
                max = Math.max(max, nextVal);
            } else {
                break;
            }
        }
        return new int[]{start, end};
    }
}