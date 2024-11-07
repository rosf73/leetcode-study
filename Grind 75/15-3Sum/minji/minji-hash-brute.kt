class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableSetOf<List<Int>>()

        var temp = nums
        for (i in 0..<(nums.size-2)) {
            temp = temp.copyOfRange(1, temp.size)
            val target = nums[i]
            val cache = hashMapOf<Int, Int>()

            for (j in temp.indices) {
                if (-target - temp[j] in cache) {
                    result.add(listOf(target, -target - temp[j], temp[j]).sorted())
                }
                cache[temp[j]] = j
            }
        }

        return result.toList()
    }
}
