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
    public ListNode removeElements(ListNode head, int val) {
        ListNode travel = head;
        if(head==null){
            return head;
        }
        while(head!=null && head.val==val){
            head=head.next;
        }
        while(travel!=null && travel.next!=null){
            if(travel.next.val==val){
                travel.next = travel.next.next;
            }
            else{
                travel=travel.next;
            }
        }
        return head;
    }
}