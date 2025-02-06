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
    public ListNode reverseList(ListNode head) {
        ListNode temp=null;
        ListNode prev=null;
         prev=head;
         if(head==null)
          return head;
         temp=prev.next;
         head.next=null;
        while(temp!=null)
        {
           prev=temp;
           temp=temp.next;
           prev.next=head;
           head=prev;

        }
        
        return head;
    }
}