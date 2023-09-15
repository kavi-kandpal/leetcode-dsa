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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode pre=list1;
        ListNode co=list1;
        ListNode temp=list2;
        for(int i=1;i<=a-1;i++){
            pre=pre.next;
            co=co.next;
        }
         for(int i=a-1;i<=b;i++){
            pre=pre.next;
        }
        co.next=temp;
       while(temp.next!=null){
           temp=temp.next;
       }
        temp.next=pre;
        return list1;
    }
}