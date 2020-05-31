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
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode front = head;
        while (front!= null){
            front = front.next;
            length++;
        }
        int counter = length/2;
        for (int i = 0; i < counter; i++){
            head = head.next;
        }
        return head;
    }
}
