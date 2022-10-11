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
        double num = 0;
        ListNode listNode = head;
        while (head != null) {
            num++;
            head = head.next;
        }
        int avg = (int) Math.floor(num / 2);
        while (listNode != null) {
            if ( avg == 0){
                return listNode;
            }
            avg --;
            listNode = listNode.next;
        }
        return listNode;
    }
}