class Solution {
    fun minimumSumSubarray(nums: List<Int>, l: Int, r: Int): Int {
        var result = 100005
        for (i in l..r) {
            for (j in 0..(nums.size - i)) {
                val sum = nums.subList(j, j+i).sum()
                if (result > sum && sum > 0) {
                    result = sum
                }
            }
        }
        return if (result > 100000) {
            -1
        } else {
            result
        }
    }
}
