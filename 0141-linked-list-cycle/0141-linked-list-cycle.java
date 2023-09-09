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
        ListNode current=head;
        ListNode pre=head;
    while(current!=null && current.next!=null){
        current=current.next.next;
       
        pre=pre.next;
        if(current==pre){
            return true;
        }
    }
    return false;
    }
}