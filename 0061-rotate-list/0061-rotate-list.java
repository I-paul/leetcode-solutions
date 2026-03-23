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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr = head;
        int c =1;
        while(curr.next!=null){
            c+=1;
            curr=curr.next;
        }
        ListNode temp=head;
        k=k%c;
        if(k==0){
            return head;
        }
        for(int i=1; i<c-k;i++){
            temp=temp.next;
        }
        ListNode nhead=temp.next;
        temp.next=null;
        curr.next=head;
        return nhead;
    }
}