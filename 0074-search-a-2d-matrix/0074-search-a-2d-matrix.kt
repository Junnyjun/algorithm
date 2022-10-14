class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        	return getRow(matrix, target)?.let { row ->
		row.binarySearch(target).let { idx ->
			(idx >= 0 && row[idx] == target)
		    }
	    } ?: false
    }

private fun getRow(matrix: Array<IntArray>, target: Int): IntArray? {
	var a = 0
	var b = matrix.size - 1

	while (a <= b) {
		val mid = (a + b) / 2

		when {
			matrix[mid][0] < target -> a = mid + 1
			matrix[mid][0] > target -> b = mid - 1
			else -> return matrix[mid]
		}
	}

	return if (0 <= b && b < matrix.size) matrix[b] else null
    }
}