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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode current=head.next;
        ListNode pre=head;
        while(current!=null){
            
            if(pre.val==current.val){
                if(current.next==null){
                    pre.next=null;
                }
                current=current.next;
            }
            else{
                pre.next=current;
                pre=current;
                current=current.next;
            }
        // current=current.next;
        }
        return head;
    }
}