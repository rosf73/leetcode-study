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
    val visited = mutableSetOf<ListNode>()
    fun hasCycle(head: ListNode?): Boolean {
        var nextNode = head
        while (nextNode != null) {
            if (nextNode in visited) {
                return true
            }
            visited.add(nextNode)
            nextNode = nextNode.next
        }

        return false
    }
}
