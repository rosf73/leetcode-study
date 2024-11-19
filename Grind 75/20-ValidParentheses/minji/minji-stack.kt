class Solution {
    fun isValid(s: String): Boolean {
        if (s.length % 2 == 1) {
            return false
        }

        val map = mapOf(
            ')' to '(',
            '}' to '{',
            ']' to '[',
        )
        val stack = mutableListOf<Char>()
        var l = -1

        for (c in s) {
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c)
                l++
            } else if (l < 0) {
                return false
            } else {
                val last = stack.removeAt(l)
                l--
                if (last != map[c]) {
                    return false
                }
            }
        }
        return l < 0
    }
}
