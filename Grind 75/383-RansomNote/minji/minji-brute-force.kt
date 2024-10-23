class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val list = ransomNote.toMutableList()
        for (e in magazine) {
            list.remove(e)
            if (list.isEmpty()) {
                return true
            }
        }

        return list.isEmpty()
    }
}
