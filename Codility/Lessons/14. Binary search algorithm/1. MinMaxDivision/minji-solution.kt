// O(N*log(N+M))
// 해결 : Binary Search, 목표치인 최소 결과값의 범주를 기준으로 탐색
// 리뷰 : binary search 문제인지 떠올리는 데 한참 걸렸다. 배열을 부분수열로 나누는 것만 생각했는데, 사실 이진 탐색의 기초는 찾고자 하는 최솟값이 탐색의 기준이라는 점이다.
//        그리고 checkSuccess 같은 연산을 바로 떠올릴 수 있는 능력도 중요한 것 같다.

fun solution(K: Int, M: Int, A: IntArray): Int {
    var low = A.max()
    var high = A.sum()

    var result = 0
    while (low <= high) {
        val mid = (low + high) / 2
        if (checkSuccess(A, mid, K)) {
            result = mid
            high = mid - 1
        } else {
            low = mid + 1
        }
    }

    return result
}

fun checkSuccess(array: IntArray, max: Int, blockLimit: Int): Boolean {
    var count = 1
    var sum = 0
    for (num in array) {
        sum += num
        if (sum > max) {
            sum = num
            count++

            if (count > blockLimit) return false
        }
    }

    return true
}
