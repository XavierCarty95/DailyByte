class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode current = head; 
        ListNode prev = null; 
        
        if(head == null)return null; 
        while(current != null){
            ListNode temp = current.next; 
            current.next = prev; 
            prev = current; 
            current = temp;
        }
        
        return prev; 
        
    }
}