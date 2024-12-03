class Solution {
    fun minArraySum(nums: IntArray, k: Int, op1: Int, op2: Int): Int {
        val dp = Array<Array<IntArray>>(nums.size) {
            Array(op1+1) { IntArray(op2+1) { -1 } }
        }

        return compareMin(dp, nums, k, 0, op1, op2)
    }

    private fun compareMin(
        dp: Array<Array<IntArray>>,
        nums: IntArray,
        k: Int,
        i: Int,
        op1: Int,
        op2: Int,
    ): Int {
        if (i == nums.size) {
            return 0
        }
        if (dp[i][op1][op2] > -1) {
            return dp[i][op1][op2]
        }

        var result = Int.MAX_VALUE

        if (op1 > 0) {
            val check1 = (nums[i] + 1) / 2 + compareMin(dp, nums, k, i+1, op1-1, op2)
            if (check1 < result) {
                result = check1
            }
        }

        if (op2 > 0 && nums[i] >= k) {
            val check2 = nums[i] - k + compareMin(dp, nums, k, i+1, op1, op2-1)
            if (check2 < result) {
                result = check2
            }
        }

        if (op1 > 0 && op2 > 0) {
            if (nums[i] >= 2*k-1) {
                val check3 = (nums[i] + 1) / 2 - k + compareMin(dp, nums, k, i+1, op1-1, op2-1)
                if (check3 < result) {
                    result = check3
                }
            }
            if (nums[i] > k) {
                val check4 = (nums[i] - k + 1) / 2 + compareMin(dp, nums, k, i+1, op1-1, op2-1)
                if (check4 < result) {
                    result = check4
                }
            }
        }

        val check5 = nums[i] + compareMin(dp, nums, k, i+1, op1, op2)
        if (check5 < result) {
            result = check5
        }

        dp[i][op1][op2] = result
        return result
    }
}
