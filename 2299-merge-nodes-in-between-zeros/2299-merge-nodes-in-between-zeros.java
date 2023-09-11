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
    public ListNode mergeNodes(ListNode head) {
        if(head==null ||head.next==null){
            return head;
        }
       ListNode temp=new ListNode(-1);
       ListNode pre=temp;
       ListNode h=head;
       while(h!=null){
           if(h.val!=0){
           int sum=0;
           while(h.val!=0 && h.next!=null){
               sum=sum+h.val;
h=h.next;
           }
          ListNode hi=new ListNode(sum);
          pre.next=hi;
           pre=pre.next;
       }
       h=h.next;
}

 return temp.next;
        }
       
    }
