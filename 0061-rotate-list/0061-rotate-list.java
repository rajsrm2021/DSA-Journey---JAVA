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

         if(head == null||head.next == null||k == 0) return head;

        int len = 1;
        ListNode dummy = head;

        while(dummy.next != null){
            dummy = dummy.next;
            len++;
        }

        if(k%len ==0) return head;

       dummy.next = head;

       k = k%len;
       int end = len - k;

       while(end-- != 0)  {
        dummy = dummy.next;
       }

       head = dummy.next;
       dummy.next = null;

       return head;

        
    }
}