class Solution {
    fun longestPalindrome(s: String): String {
        var result = s.first().toString()
        for (i in s.indices) {
            for (j in (s.length-1) downTo (i+1)) {
                val curr = s.substring(i..j)
                if (result.length < curr.length &&
                    s[i] == s[j] &&
                    isPalindrome(curr)
                ) {
                    result = curr
                    break
                }
            }

            if (result.length > s.length - i) {
                break
            }
        }

        return result
    }

    private fun isPalindrome(s: String): Boolean {
        val half: Int = s.length / 2
        return if (s.length % 2 == 0) {
            s.substring(0..<half) == s.substring(half).reversed()
        } else {
            s.substring(0..<half) == s.substring(half+1).reversed()
        }
    }
}
