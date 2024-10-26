/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var neighbors: ArrayList<Node?> = ArrayList<Node?>()
 * }
 */

class Solution {
    private val visit = mutableMapOf<Int, Node>()
    fun cloneGraph(node: Node?): Node? {
        copyNode(node)
        return visit[1]
    }

    private fun copyNode(node: Node?) {
        if (node == null) {
            return
        }

        val newNode = Node(node.`val`).apply {
            visit[`val`] = this

            val newNeighbors = ArrayList<Node?>()
            for (n in node.neighbors) {
                if (!visit.containsKey(n?.`val`)) {
                    copyNode(n)
                }
                newNeighbors += visit[n?.`val`]
            }
            neighbors = newNeighbors
        }
    }
}
