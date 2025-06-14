// O(N)
// 해결 : 시그마 공식, sum()
// 리뷰 : 정수 연산으로 대충 풀었더니 오버플로우 남, Long으로 바꿔서 해결

fun solution(A: IntArray): Int {
    val n = A.size + 1L
    val sum = A.fold(0L) { acc, v -> acc + v }
    return (n * (n + 1) / 2 - sum).toInt()
}
