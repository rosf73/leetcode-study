class Solution {
    fun maxArea(height: IntArray): Int {
        var result = 0
        var l = 0
        var r = height.size - 1
        while (l < r) {
            val area = min(height[l], height[r]) * (r-l)
            if (result < area) {
                result = area
            }

            if (height[l] > height[r]) {
                r--
            } else {
                l++
            }
        }

        return result
    }
}
