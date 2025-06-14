// O(N)
// 해결 : prefix sum 연산, 전체 sum에서 left sum을 순차적으로 구하며 right sum과 반복 비교
// 리뷰 : 1. leftSum의 변동폭 만큼 rightSum에 역 변동이 발생한다고 생각하여, diff의 그래프가 V자 형태라고 착각함
//        2. 하지만 요건에 음수가 발생할 수 있기때문에, 항상 V자가 보장되지 않음
//        3. 반례) [100, 100, 100, (-200), 1, 2, 3, 4, 5]

import kotlin.math.*

fun solution(A: IntArray): Int {
    val n = A.size

    var result = Int.MAX_VALUE
    var sum = A.sum()
    var leftSum = 0
    for (i in 0..<(n-1)) {
        leftSum += A[i]
        val rightSum = sum - leftSum
        val diff = abs(rightSum - leftSum)
        result = minOf(result, diff)
    }

    return result
}
