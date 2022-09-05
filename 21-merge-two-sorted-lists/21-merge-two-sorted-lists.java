public class Solution {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode result = new ListNode(0); // (1)
    ListNode head = result;
    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) { // (2)
        head.next = list1;
        list1 = list1.next;
      } else {
        head.next = list2;
        list2 = list2.next;
      }
      head = head.next;
    }
    if (list1 != null) { // (3)
      head.next = list1;
    } else {
      head.next = list2;
    }
    return result.next;
  }
}