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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
    if(head==null){
        return null;
    }

        // ListNode head1=head;
        ListNode pre=head;
        while(pre.next!=null){
            if(pre.next.val==val){
                pre.next=pre.next.next;
            }
            else{
                pre=pre.next;
            }
        }
        return head;
    }
}