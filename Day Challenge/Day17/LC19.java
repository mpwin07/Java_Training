// 19. Remove Nth Node From End of List
// Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

import java.util.*;

public class LC19 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both until fast reaches null
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the node
        slow.next = slow.next.next;

        return dummy.next;
    }
}
