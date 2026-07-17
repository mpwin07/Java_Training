// https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/description/

import java.util.*;

class prog {

    static class Node {
        int value;
        int row;
        int index;

        Node(int value, int row, int index) {
            this.value = value;
            this.row = row;
            this.index = index;
        }
    }

    public int[] smallestRange(List<List<Integer>> nums) {

        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.value - b.value);

        int max = Integer.MIN_VALUE;

        // Add the first element from each list
        for (int i = 0; i < nums.size(); i++) {
            int val = nums.get(i).get(0);
            pq.offer(new Node(val, i, 0));
            max = Math.max(max, val);
        }

        int start = 0;
        int end = Integer.MAX_VALUE;

        while (true) {
            Node curr = pq.poll();
            int min = curr.value;

            if ((max - min < end - start) ||
                (max - min == end - start && min < start)) {
                start = min;
                end = max;
            }

            // One list is exhausted
            if (curr.index + 1 == nums.get(curr.row).size()) {
                break;
            }

            int next = nums.get(curr.row).get(curr.index + 1);
            pq.offer(new Node(next, curr.row, curr.index + 1));
            max = Math.max(max, next);
        }

        return new int[]{start, end};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prog sol = new prog();

        String input = sc.nextLine();
        input = input.substring(input.indexOf("["));
        input = input.substring(1, input.length() - 1);

        List<List<Integer>> nums = new ArrayList<>();

        String[] lists = input.split("\\],\\[");

        for (String list : lists) {
            list = list.replace("[", "").replace("]", "");
            String[] values = list.split(",");
            List<Integer> temp = new ArrayList<>();
            for (String v : values) {
                temp.add(Integer.parseInt(v.trim()));
            }
            nums.add(temp);
        }

        int[] result = sol.smallestRange(nums);

        System.out.println("[" + result[0] + "," + result[1] + "]");

        sc.close();
    }
}