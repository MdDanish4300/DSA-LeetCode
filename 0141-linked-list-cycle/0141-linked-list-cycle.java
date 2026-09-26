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
    public boolean hasCycle(ListNode head) {

        // Boht the pointers start from the head 
        ListNode slow = head; 
        ListNode fast = head;
        
        // Fast moves two steps at a time, so check both fast and fast.next
        while (fast != null && fast.next != null) {

            slow = slow.next;   // Moves 1 step
            fast = fast.next.next;  // Moves 2 step

            // If both meet then a cycle detected
            if (slow == fast) {
                return true;
            }
        }
        // Fast reaches the end and no cycle detected.
        return false;
    
    }
}