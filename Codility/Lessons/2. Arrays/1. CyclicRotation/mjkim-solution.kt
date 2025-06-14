// O(N)
// 해결 : 배열 순회, 예외 처리
// 리뷰 : 1. 배열이 빈 경우, K가 N보다 큰 경우 등을 처리하지 않고 제출하여 히든 케이스 모두 실패
//        2. array의 plus 연산자는 복사+요소가 추가된 새로운 배열을 반환하여 할당하기 때문에 성능이 좋지 않음
//        3. 2번을 해결하고, for문을 두번 쓰지 않고도 right 쉬프트를 해결할 수 있는 연산 정의

// fun solution(A: IntArray, K: Int): IntArray {
//     val n = A.size
//     if (n == 0) {
//         return A
//     }
// 
//     var result = intArrayOf(n)
//     val k = K % A.size
//     for (i in (A.size - k)..<A.size) {
//         result += A[i]
//     }
//     for (i in 0..<(A.size - k)) {
//         result += A[i]
//     }
// 
//     return result
// }

fun solution(A: IntArray, K: Int): IntArray {
    val n = A.size
    if (n == 0) {
        return A
    }

    val result = IntArray(n)
    val k = K % A.size
    for (i in A.indices) {
        result[(i + k) % n] = A[i]
    }

    return result
}
