class Solution {
    fun letterCombinations(digits: String): List<String> {
        if (digits.length < 1) {
            return listOf()
        }

        val alphaMap = arrayOf("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")

        val result = mutableListOf<String>()
        fun backtracking(depth: Int, alpha: String, prev: String): String {
            for (c in alpha) {
                val next = prev + c
                if (depth == digits.length - 1) {
                    result.add(next)
                    continue
                }
                backtracking(depth+1, alphaMap[digits[depth+1].digitToInt()], next)
            }
            return ""
        }

        backtracking(0, alphaMap[digits[0].digitToInt()], "")
        return result
    }
}
