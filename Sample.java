// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

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
    
    // TC O(n) SC O(1)
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode previous = null;
        ListNode current = head;
        ListNode fast = head.next;
        
        while(fast!=null){
            current.next = previous;
            previous = current;
            current = fast;
            fast = fast.next;           
            
        } 
        
        current.next = previous;
      return current;  
    }
    
}


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
    //TC O(n) SC O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while(count<=n){
            fast = fast.next;
            count++;            
        }
        
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
            
        }
        
        slow.next = slow.next.next;
        
    return dummy.next;}
}


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
    //TC O(n) SC O(1)
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                hasCycle = true;
                break;
            } 
        }
        if(!hasCycle) {return null;}
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
            
        }
       return slow; 
    }
}
