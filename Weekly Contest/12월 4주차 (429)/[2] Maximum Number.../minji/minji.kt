class Solution {
    fun maxDistinctElements(nums: IntArray, k: Int): Int {
        val n = nums.size
        val nums = nums.sortedArray()

        var prev = 1000000005
        var op = -k
        var move = 0
        var temp = nums[0]
        for (i in 0..<n) {
            if (i > 0 && nums[i] == prev && op < k) {
                op++
                move++
            } else if (move > 0 && nums[i] - prev > 1) {
                val diff = min(nums[i] - prev - 1, move)
                op -= diff
                if (diff == move) {
                    move = 0
                } else {
                    move -= diff
                }
            }
            prev = nums[i]

            nums[i] += op
        }
        return nums.toSet().size
    }
}
