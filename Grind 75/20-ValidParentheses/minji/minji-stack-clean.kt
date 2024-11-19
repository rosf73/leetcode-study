class Solution {
    fun isValid(s: String): Boolean {
        if (s.length % 2 == 1) {
            return false
        }

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
                if ((c == ')' && last != '(') ||
                    (c == '}' && last != '{') ||
                    (c == ']' && last != '[')) {
                    return false
                }
            }
        }
        return l < 0
    }
}
