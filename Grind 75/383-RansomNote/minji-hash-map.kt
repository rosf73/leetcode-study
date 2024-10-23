class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        if (ransomNote.length > magazine.length) {
            return false
        }

        val having = mutableMapOf<Char, Int>()
        val needed = mutableMapOf<Char, Int>()
        for (i in magazine.indices) {
            val mElem = magazine[i]
            if (having.containsKey(mElem)) {
                having[mElem] = having[mElem]!! + 1
            } else {
                having[mElem] = 1
            }

            if (i >= ransomNote.length) continue
            val rElem = ransomNote[i]
            if (needed.containsKey(rElem)) {
                needed[rElem] = needed[rElem]!! + 1
            } else {
                needed[rElem] = 1
            }
        }

        for ((neededChar, neededCount) in needed) {
            if ((having[neededChar] ?: 0) < neededCount) {
                return false
            }
        }

        return true
    }
}
