class Solution {
    fun longestPalindrome(s: String): String {
        var result = ""
        for (i in s.indices) {
            val odd = subPalindrome(s, i, i)
            val even = subPalindrome(s, i, i+1)

            if (result.length < odd.length) {
                result = odd
            }
            if (result.length < even.length) {
                result = even
            }
        }

        return result
    }

    private fun subPalindrome(s: String, l: Int, r: Int): String {
        var left = l
        var right = r
        while (left >= 0 && right < s.length && s[left] == s[right]) {
            left--
            right++
        }
        return s.substring(left+1, right)
    }
}
