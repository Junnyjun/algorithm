/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun oddEvenList(head: ListNode?): ListNode? {
        if(head==null){
            return null
        }
        var h = head
        var e = head.next
        var eh = e
        while(true){
            if(e == null){
                break
            }
            if (e.next == null){
                break
            }
            h!!.next = e.next
            h = h.next
            e.next = h.next
            e = e.next
        }
        h!!.next = eh
        return head
    }
}