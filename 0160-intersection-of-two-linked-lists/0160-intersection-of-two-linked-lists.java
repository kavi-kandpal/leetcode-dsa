/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null){
            return null;
        }
        if(headB==null){
            return null;
        }
        ListNode head=headA;
        // ListNode current=headB;
        
        while(head!=null){
              ListNode current=headB;
            while(current!=null){
                if(head==current && head.val==current.val){
                    System.out.println(head.val);
                     return head;
                }
                 current=current.next;
            }
            head=head.next;
        }
        return null;
    }
}