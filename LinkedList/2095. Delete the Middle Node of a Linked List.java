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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)   return null;
        int n = 0;
        ListNode ptr = head;

        while(ptr!= null){
            ptr = ptr.next;
            n++;
        }

        int mid = n/2;

        ptr = head;
        for(int i=0; i<mid-1; i++){
            ptr = ptr.next;
        }

        ptr.next = ptr.next.next;

        return head;

    }
}
