// O(N)
// 해결 : 비트 연산 순회
// 리뷰 : 1. HashSet 이용해서 짝지어진 수를 추가/삭제, N이 커질 수록 컬렉션 연산이 많아져서 fail
//        2. 짝짓기 제거 문제는 XOR이 가장 성능이 좋다는 힌트, 해당 방식으로 구현

fun solution(A: IntArray): Int {
    var result = 0
    for (a in A) {
        result = result xor a
    }

    return result
}
