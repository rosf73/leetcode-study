class Solution {
    fun myAtoi(s: String): Int {
        val matched = Regex("[-+]?\\d+").find(s.trim())
        if (matched?.value == null) return 0
        if (matched.range.first() > 0) return 0

        val result = matched.value
        return if (result.first() == '-' && result.toIntOrNull() == null) {
            -2_147_483_648
        } else if (result.toIntOrNull() == null) {
            2_147_483_647
        } else {
            result.toInt()
        }
    }
}
