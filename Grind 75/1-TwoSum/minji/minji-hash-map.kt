class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val cache = hashMapOf<Int, Int>()
        for (i in 0..(nums.size-1)) {
            if (target - nums[i] in cache) {
                return intArrayOf(cache[target - nums[i]]!!, i)
            }
            cache[nums[i]] = i
        }

        return intArrayOf()
    }
}
