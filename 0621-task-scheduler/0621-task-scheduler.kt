class Solution {
fun leastInterval(tasks: CharArray, n: Int): Int {
	val tasksByCount = tasks.toList().groupingBy { it }.eachCount()
	val maxCount = tasksByCount.values.max()!!
	val tasksWithMaxCount = tasksByCount.count { it.value == maxCount }

	return maxOf(tasks.size, (maxCount - 1) * (n + 1) + tasksWithMaxCount)
}
}