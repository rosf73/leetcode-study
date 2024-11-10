class Solution {
    fun orangesRotting(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val visit = grid
        val dr = intArrayOf(-1,1,0,0)
        val dc = intArrayOf(0,0,-1,1)

        val deque = mutableListOf<Triple<Int, Int, Int>>()
        for (i in 0..<m) {
            for (j in 0..<n) {
                if (visit[i][j] == 2) {
                    deque.add(Triple(i, j, 0))
                }
            }
        }

        var last = 0
        while (deque.isNotEmpty()) {
            val (row, col, count) = deque.removeFirst()
            for (i in 0..3) {
                val nextR = row + dr[i]
                val nextC = col + dc[i]
                if (nextR < 0 || nextR >= m || nextC < 0 ||nextC >= n) {
                    continue
                }
                if (visit[nextR][nextC] == 0 || visit[nextR][nextC] == 2) {
                    continue
                }
                visit[nextR][nextC] = 2
                deque.add(Triple(nextR, nextC, count + 1))
                if (last < count + 1) {
                    last = count + 1
                }
            }
        }

        if (visit.any { it.any { c -> c == 1 } }) {
            return -1
        }
        return last
    }
}
