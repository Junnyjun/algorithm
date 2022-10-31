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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var d = ListNode(0)
        d.next = head
        var f = d
        var s = d
        for(i in 0 until n){
            f = f.next!!
        }
        while(f.next != null){
            f = f.next!!
            s = s.next!!
        }
        s.next = s.next!!.next
        return d.next
    }
}