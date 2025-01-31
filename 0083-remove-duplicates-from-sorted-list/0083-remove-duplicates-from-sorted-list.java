class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null ){
            return head;
        }
        ListNode crr = head;

        while(crr != null && crr.next != null){
            if(crr.val == crr.next.val){
                crr.next = crr.next.next;
            }else{
                crr=crr.next;
            }
        }
        return head;
    }
   
}