class Solution {
    fun isPossibleToRearrange(s: String, t: String, k: Int): Boolean {
        val sList = mutableListOf<String>()
        val tList = mutableListOf<String>()
        var i = 0
        val step = s.length / k
        while (i < s.length) {
            sList.add(s.substring(i, i+step))
            tList.add(t.substring(i, i+step))
            i += step
        }
        val sSorted = sList.sorted()
        val tSorted = tList.sorted()

        return sSorted == tSorted
    }
}
