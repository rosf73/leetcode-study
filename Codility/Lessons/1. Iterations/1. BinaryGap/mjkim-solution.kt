// O(logN)
// 해결 : 2진수 연산, 루프 연산
// 리뷰 : and, shr 등의 비트 연산자로 개선하면 더 직관적일듯
//       그러나 문자열 연산을 떠올리지 않고 비트 연산 로직을 떠올린 것은 좋은 시도

fun solution(N: Int): Int {
    // Implement your solution here
    var result = 0
    var n = N
    var count = 0
    var start = false
    while (n >= 1) {
        if (n % 2 == 1) {
            start = true
            if (result < count) {
                result = count
            }
            count = 0
        } else if (start) {
            count++
        }

        if (n == 1) break;
        n /= 2
    }

    return result
}
