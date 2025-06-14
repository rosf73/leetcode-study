// O(1)
// 해결 : 정수 연산 (올림)
// 리뷰 : if else 조건문으로 올림 처리했는데, 한줄 연산으로 올림이 된다는 것을 까먹고 있었음

fun solution(X: Int, Y: Int, D: Int): Int {
//     val mod = (Y - X) % D
//     return if (mod > 0) (Y - X) / D + 1 else (Y - X) / D
    return (Y - X + D - 1) / D
}
