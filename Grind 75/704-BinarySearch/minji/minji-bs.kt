class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size
        var mid = l + ((r - l) / 2)
        while (l < r - 1) {
            if (nums[mid] > target) {
                r = mid
            } else if (nums[mid] < target) {
                l = mid
            } else {
                return mid
            }
 
            mid = l + ((r - l) / 2)
        }

        if (nums[mid] != target) {
            return -1
        }
        return mid
    }
}
