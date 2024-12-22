class Solution {
    fun minimumOperations(nums: IntArray): Int {
        val n = nums.size
        var i = 0
        var count = 0
        while (i < n) {
            val visit = BooleanArray(101) { false }
            var good = true
            for (j in i..<n) {
                if (visit[nums[j]]) {
                    good = false
                    break
                }
                visit[nums[j]] = true
            }

            if (!good) {
                count++
                i += 3
            } else {
                break
            }
        }

        return count
    }
}
