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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode curr = slow.next;
        while(curr!=null){
            ListNode nn=curr.next;
            curr.next = prev;
            prev = curr;
            curr = nn;
        }
        while(prev!=null){
            if(head.val != prev.val){
                return false;
            }
            prev=prev.next;
            head=head.next;
        }
        return true;
    }
}