
class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next == null){
            return head.next;
        }
        
        int count = 1;
        ListNode current = head; 
        
        while(current != null){
            count++;
            current = current.next;
        }
        
        int leftIndex = count - n - 1;
        
        if(leftIndex == 0){
            return head.next; 
        }
        
        current = head; 
        while(leftIndex > 1){
            
            current = current.next;
            leftIndex--;
        }
        
        current.next = current.next.next;
        return head; 
    }
}