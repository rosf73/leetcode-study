class Solution {
    fun myAtoi(s: String): Int {
        var i = 0
        var sign = 1
        while (i < s.length && s[i] == ' ') {
            i++
        }

        if (i < s.length && s[i] == '-') {
            sign = -1
            i++
        } else if (i < s.length && s[i] == '+') {
            i++
        }

        var result = 0L
        while (i < s.length) {
            if (s[i] < '0' || s[i] > '9') {
                return result.toInt() * sign
            }

            result = result*10 + s[i].digitToInt()
            if (result > 2_147_483_647) {
                if (sign == -1) {
                    return -2_147_483_648
                } else {
                    return 2_147_483_647
                }
            }
            i++
        }

        return result.toInt() * sign
    }
}
