/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Two pointers start from the head
        ListNode slow = head;
        ListNode fast = head;

        // Phase 1: Detect whether a cycle exists
        // Slow moves 1 step, fast moves 2 steps
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            // If both pointers meet, a cycle definitely exists
            if (slow == fast) {

                // Phase 2: Find the beginning of the cycle
                // Move slow back to the head
                slow = head;

                // Move both pointers one step at a time
                // They will meet at the cycle's starting node
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                // This node is where the cycle begins
                return slow;
            }
        }

        // If fast reaches null, there is no cycle
        return null;

    }
}