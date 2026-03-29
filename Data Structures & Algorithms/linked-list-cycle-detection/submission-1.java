/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;//same
        ListNode fast = head;//same

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;//2,4,2,4
            slow = slow.next;//1,2,3,4
            
            if(fast == slow) return true;
        }
        return false;
    }
}
