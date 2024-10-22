class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.length < 2) return s.length

        var result = 1
        var lastPoint = 0
        val alphaMap = mutableMapOf(s[0] to 1)
        for (i in 1..<s.length) {
            if (alphaMap.containsKey(s[i]) && lastPoint < alphaMap[s[i]]!!) {
                lastPoint = alphaMap[s[i]]!!
            }

            val distance = i + 1 - (lastPoint ?: 0)
            if (distance > result) {
                result = distance
            }
            alphaMap[s[i]] = i + 1
        }

        return result
    }
}
