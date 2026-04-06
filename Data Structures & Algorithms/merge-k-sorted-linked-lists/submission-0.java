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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arr = new ArrayList<>();

        for(ListNode node : lists){
            while(node!=null){
            arr.add(node.val);
            node = node.next;
            }
        }
        Collections.sort(arr);

        ListNode dummy = new ListNode(0);
        ListNode answer = dummy;

        for(int val : arr){
            answer.next = new ListNode(val);
            answer = answer.next;
        }
        return dummy.next;
    }
}
