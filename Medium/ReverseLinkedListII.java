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
    public ListNode reverseBetween(ListNode head, int m, int n) {
    if (head.next == null) return head;
    if (m != 1){
    ListNode front = head;
    ListNode current = head;
    ListNode prev = null;
    ListNode next = null;
    for (int i = 0; i < m - 2; i++){
        prev = current;
        next = current;
        current = current.next;
    }
    ListNode connector = current;
    ListNode placeholder = current.next;
    prev = current;
    next = current;
    current = current.next;
        
    for (int k = 0; k < n-m + 1; k++){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    placeholder.next = current;
    connector.next = prev;
    return head;
    }
    else {
    ListNode front = head;
    ListNode current = head;
    ListNode prev = null;
    ListNode next = null;
    for (int k = 0; k < n-m + 1; k++){
     next = current.next;
     current.next = prev;
     prev = current;
     current = next;
    }
    front.next = current;
    head = prev;
    return head;
    }
    }
}
