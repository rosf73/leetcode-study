class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableSetOf<List<Int>>()

        for (i in 0..<(nums.size-2)) {
            val target = nums[i]
            val cache = hashMapOf<Int, Int>()

            for (j in (i+1)..<nums.size) {
                if (-target - nums[j] in cache) {
                    result.add(listOf(target, -target - nums[j], nums[j]).sorted())
                }
                cache[nums[j]] = j
            }
        }

        return result.toList()
    }
}
