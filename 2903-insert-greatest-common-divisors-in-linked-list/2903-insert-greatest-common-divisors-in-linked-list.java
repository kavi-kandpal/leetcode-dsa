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
    public static int inset(ListNode temp,ListNode n){
        int i=1;
        int count=0;
        while(i<=temp.val && i<=n.val){
            if(temp.val%i==0 && n.val%i==0){
                count=i;
            }
            i++;
        }

        return count;
    }
    public  ListNode inser(ListNode temp,ListNode n){
        n.next=temp.next;
        temp.next=n;
        return temp;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null && head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode n=head.next;
        while(temp.next!=null){
            ListNode in=new ListNode(inset(temp,n));
            temp=inser(temp,in);
            temp=temp.next.next;
            n=n.next;
        }
        return head;
    }
}