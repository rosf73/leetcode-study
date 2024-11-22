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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var point: ListNode?
        var other: ListNode?
        if ((list1?.`val` ?: 101) <= (list2?.`val` ?: 101)) {
            point = list1
            other = list2
        } else {
            point = list2
            other = list1
        }
        var head = point

        while (point != null && other != null) {
            val a1 = point.next?.`val` ?: 101
            val a2 = other.`val` ?: 101
            if (a1 <= a2) {
                point = point.next
            } else {
                val temp = point.next
                point.next = other
                point = other
                other = temp
            }
        }

        return head
    }
}
