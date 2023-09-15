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
    ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode prev=null;
        ListNode next=null;
        while(current!=null){
   next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    public ListNode removeNodes(ListNode head) {
        head= reverseList(head);
        ListNode temp=head;
        int max=temp.val;
        while(temp.next!=null){
            if(max>temp.next.val){
                ListNode pre=temp.next;
                temp.next=pre.next;
            }
            else{
                max=temp.next.val;
                temp=temp.next;
                
            }

        }
         head= reverseList(head);
        return head;
    }
}