class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableSetOf<List<Int>>()
        val nums = nums.sorted()

        for (i in 0..<(nums.size-2)) {
            if (nums[i] > 0) break

            val target = nums[i]
            val cache = mutableSetOf<Int>()

            for (j in (i+1)..<nums.size) {
                if (-target - nums[j] in cache) {
                    result.add(listOf(target, -target - nums[j], nums[j]))
                }
                cache.add(nums[j])
            }
        }

        return result.toList()
    }
}
