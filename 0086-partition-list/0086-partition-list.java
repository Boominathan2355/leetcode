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
    public ListNode partition(ListNode head, int x) {
        ListNode slist = new ListNode();
        ListNode blist = new ListNode();
        ListNode s = slist;
        ListNode b = blist;

        while(head!=null){
            if(head.val < x){
                s.next = head;
                s = s.next;
            }else{
                b.next = head;
                b = b.next;
            }
            head=head.next;
        }
        s.next = blist.next;
        b.next = null;

        return slist.next;
        
    }
}