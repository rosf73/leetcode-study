// O(N)
// 해결 : 조건부 stack
// 리뷰 : 반대로 연산함(down 연속전투는 연산을 했지만 up 연속전투는 연산하지 않고 for문을 종료함)
//        순회하면서 up 연속전투만 연산하여 해결할 수 있다는 데서 힌트를 얻음
//        배열 문제를 너무 순차적으로만 생각하려는 경향이 있음, 다양한 방향으로 해결을 추론하는 능력이 필요함

fun solution(A: IntArray, B: IntArray): Int {
    val opponents = mutableListOf<Int>()
    var survivors = 0
    for (i in A.indices) {
        val size = A[i]
        val dir = B[i]

        if (dir == 1) {
            opponents.add(size)
        } else {
            // up and fight
            var win = true
            while (opponents.isNotEmpty()) {
                val opponent = opponents.last()
                if (opponent > size) {
                    win = false
                    break
                } else {
                    opponents.removeLast()
                }
            }
            if (win) {
                survivors++
            }
        }
    }

    return survivors + opponents.size
}
