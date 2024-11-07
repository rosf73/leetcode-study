class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableSetOf<List<Int>>()

        val temp = nums.sorted()
        var f = 0
        while (f < temp.size - 2) {
            if (f > 0 && temp[f] == temp[f-1]) {
                f++
                continue // duplicated
            }

            var s = f + 1
            var t = temp.size - 1
            while (s < t) {
                val comp = temp[s] + temp[t]
                if (comp == -temp[f]) {
                    result.add(listOf(temp[f], temp[s], temp[t]))
                    s++
                    while (s < t && temp[s] == temp[s-1]) {
                        s++ // duplicated
                    }
                } else if (comp > -temp[f]) {
                    t--
                } else {
                    s++
                }
            }
            f++
        }

        return result.toList()
    }
}
