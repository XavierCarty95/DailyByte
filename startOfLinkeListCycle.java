/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public ListNode getIntersection(ListNode head){
        
        ListNode slow =  head; 
        ListNode fast = head;
              
        while(fast != null && fast.next != null ){
            
             slow = slow.next;
             fast = fast.next.next;
             
            if(slow == fast){
                return slow; 
            }
        }
        
        return null;
        
        
        
    }
    public ListNode detectCycle(ListNode head) {
        
        if(head == null)return null;
        ListNode intersect = getIntersection(head);
        
        if(intersect == null){
            return null;
        }
        
        ListNode ptr1 = head; 
        ListNode ptr2 = intersect;
        
        while(ptr1 != ptr2){
            
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        return ptr2; 
    }
}