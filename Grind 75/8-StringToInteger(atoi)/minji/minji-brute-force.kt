class Solution {
    fun myAtoi(s: String): Int {
        var isStarted = false
        var result = ""
        for (c in s) {
            if (!c.isReadable()) {
                break
            }
            if (isStarted && !c.isDigit()) {
                break
            }
            if (c == ' ') {
                continue
            }

            isStarted = true
            if (c == '+') {
                continue
            }
            result += c
        }

        return if (result.isBlank() || result == "-") {
            0
        } else if (result.firstOrNull() == '-' && result.toIntOrNull() == null) {
            -2_147_483_648
        } else if (result.toIntOrNull() == null) {
            2_147_483_647
        } else {
            result.toInt()
        }
    }

    private fun Char.isReadable() =
        this == '-' || this == '+' || this == ' ' || isDigit()
}
