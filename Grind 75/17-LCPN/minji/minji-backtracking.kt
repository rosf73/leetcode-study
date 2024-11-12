class Solution {
    fun letterCombinations(digits: String): List<String> {
        if (digits.length < 1) {
            return listOf()
        }

        val alphaMap = mapOf(
            '2' to arrayOf('a','b','c'),
            '3' to arrayOf('d','e','f'),
            '4' to arrayOf('g','h','i'),
            '5' to arrayOf('j','k','l'),
            '6' to arrayOf('m','n','o'),
            '7' to arrayOf('p','q','r','s'),
            '8' to arrayOf('t','u','v'),
            '9' to arrayOf('w','x','y','z'),
        )

        val result = mutableListOf<String>()
        fun backtracking(depth: Int, alpha: Array<Char>, prev: String): String {
            for (c in alpha) {
                val next = prev + c
                if (depth == digits.length - 1) {
                    result.add(next)
                    continue
                }
                backtracking(depth+1, alphaMap[digits[depth+1]]!!, next)
            }
            return ""
        }

        backtracking(0, alphaMap[digits[0]]!!, "")
        return result
    }
}
