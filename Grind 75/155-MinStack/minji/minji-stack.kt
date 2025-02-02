class MinStack {

    private val stack = mutableListOf<Int>()
    private val minStack = mutableListOf<Int>()
    private var n = 0

    fun push(`val`: Int) {
        stack.add(`val`)

        if (n == 0 || getMin() > `val`) {
            minStack.add(`val`)
        } else {
            minStack.add(getMin())
        }
        n++
    }

    fun pop() {
        n--
        stack.removeAt(n)
        minStack.removeAt(n)
    }

    fun top(): Int {
        return stack[n-1]
    }

    fun getMin(): Int {
        return minStack[n-1]
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
