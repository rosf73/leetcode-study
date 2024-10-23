class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var result = 0
        var left = 0
        val alphaSet = mutableSetOf<Char>()

        for (right in 0..<s.length) {
            while (alphaSet.contains(s[right])) {
                alphaSet.remove(s[left])
                left++
            }

            result = max(result, right - left + 1)
            alphaSet.add(s[right])
        }

        return result
    }
}
