class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0..(nums.size-2)) {
            for (j in (i+1)..(nums.size-1)) {
                if (target - nums[i] == nums[j]) {
                    return intArrayOf(i, j)
                }
            }
        }

        return intArrayOf()
    }
}
