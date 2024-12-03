import java.util.Stack

class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<Int>()

        for (s in tokens) {
            val result = when (s) {
                "+" -> {
                    val b = stack.pop()
                    val a = stack.pop()
                    a + b
                }
                "-" -> {
                    val b = stack.pop()
                    val a = stack.pop()
                    a - b
                }
                "*" -> {
                    val b = stack.pop()
                    val a = stack.pop()
                    a * b
                }
                "/" -> {
                    val b = stack.pop()
                    val a = stack.pop()
                    a / b
                }
                else -> s.toInt()
            }
            stack.push(result)
        }

        return stack.pop()
    }
}
