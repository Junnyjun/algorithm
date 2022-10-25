class MyStack() {
    val first: Queue<Int>
    val second: Queue<Int>

    init {
        first = ArrayDeque<Int>()
        second = ArrayDeque<Int>()
    }

    fun push(x: Int) {
        while (first.isNotEmpty()) second.add(first.poll())
        first.add(x)
        while (second.isNotEmpty()) first.add(second.poll())
    }

    fun pop(): Int {
        return first.poll()
    }

    fun top(): Int {
        return first.peek()
    }

    fun empty(): Boolean {
        return first.isEmpty()
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */