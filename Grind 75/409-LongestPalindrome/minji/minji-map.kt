class Solution {
    fun longestPalindrome(s: String): Int {
        val maps = mutableMapOf<Char, Int>()
        for (c in s) {
            if (maps.containsKey(c)) {
                maps[c] = maps[c]!! + 1
            } else {
                maps[c] = 1
            }
        }

        var result = 0
        var odd = false
        for (count in maps.values) {
            if (count % 2 == 0) {
                result += count
            } else {
                if (odd) {
                    result += count - 1
                } else {
                    result += count
                    odd = true
                }
            }
        }

        return result
    }
}
