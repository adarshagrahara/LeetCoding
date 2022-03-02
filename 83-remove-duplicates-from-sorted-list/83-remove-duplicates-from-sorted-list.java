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
    public ListNode deleteDuplicates(ListNode head) {
       if (head == null || head.next == null)
            return head;
        
        ListNode pre = head;
        ListNode res = pre;
        ListNode nex = pre.next;
        
        while (nex != null){
            
            if (nex.val == pre.val){
                
                pre.next = nex.next;   
            } else {
                pre = pre.next;   
                
                
            }            
                nex = nex.next;                  
        }
        
        return res;
    }
}