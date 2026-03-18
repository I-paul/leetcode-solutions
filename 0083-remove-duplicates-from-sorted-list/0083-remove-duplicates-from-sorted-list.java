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
        ListNode Temp = head;
        while(Temp != null && Temp.next != null){
            if(Temp.val == Temp.next.val){
                Temp.next = Temp.next.next;
            }
            else{
                Temp = Temp.next;
            }
        }
        return head;
    }
}