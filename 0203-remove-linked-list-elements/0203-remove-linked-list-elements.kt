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
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
                var h0 = head
        var a = ListNode(0)
        var h = a
        while(h0!=null){
            if (h0.`val` != `val`){
                h.next = ListNode(h0.`val`)
                h = h.next
            }
            h0 = h0.next
        }
        return a.next
    }
    }
