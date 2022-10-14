class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
                for (i in 0 until 9) {
            for (j in 0 until 9) {
                if (board[i][j] != '.') {
                    if (isValid(board, i, j).not()) return false
                }
            }
        }
        return true
    }
    
    fun isValid(board: Array<CharArray>, r: Int, c: Int): Boolean {
        val N = board.size
        
        fun isValidRow(): Boolean { // all cells in the row 'r' is valid?
            for (j in 0 until N) {
                if (j != c && board[r][j] == board[r][c]) return false
            }
            return true
        }
        
        fun isValidCol(): Boolean { // all cells in the col 'c' is valid?
            for (i in 0 until N) {
                if (i != r && board[i][c] == board[r][c]) return false
            }
            return true
        }
        
        fun isValidBlock(): Boolean { // all the cells in the corresponding block is valid?
            val startRow = 3 * (r / 3)
            val startCol = 3 * (c / 3)
            for (cell in 0 until N) {
                val cellRow = startRow + (cell / 3)
                val cellCol = startCol + (cell % 3)
                if (r != cellRow && c != cellCol && board[cellRow][cellCol] == board[r][c])
                    return false
            }
            return true
        }
        return isValidRow() && isValidCol() && isValidBlock()
    }
}