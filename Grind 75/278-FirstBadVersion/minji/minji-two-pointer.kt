/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

import kotlin.math.abs

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var l = 1
        var r = n

        while (l < r) {
            val center = l + (r - l) / 2
            if (isBadVersion(center)) {
                r = center
            } else {
                l = center + 1
            }
        }
        return l
    }
}
