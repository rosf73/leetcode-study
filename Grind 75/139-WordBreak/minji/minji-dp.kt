class Solution {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val dp = BooleanArray(s.length + 1) { false }
        dp[0] = true

        for (i in s.indices) {
            for (j in 0..i) {
                if (dp[j] && s.substring(j, i+1) in wordDict) {
                    dp[i+1] = true
                    break
                }
            }
        }

        return dp[s.length]
    }
}
