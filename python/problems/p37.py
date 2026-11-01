"""37. Sudoku Solver"""

def isInRow(board, row, n):
    for i in range(9):
        if board[row][i] == n:
            return True
    return False

def isInCol(board, col, n):
    for i in range(9):
        if board[i][col] == n:
            return True
    return False

def isInSquare(board, row, col, n):
    r0 = 3 * (row // 3)
    c0 = 3 * (col // 3)
    for i in range(r0,r0+3):
        for j in range(c0, c0+3):
            if board[i][j] == n:
                return True
    return False

def isValid(board, row, col, n) -> bool:
    if isInRow(board, row, n):
        return False
    if isInCol(board, col, n):
        return False
    if isInSquare(board, row, col, n):
        return False
    return True

def solve(board) -> bool:
    for row in range(9):
        for col in range(9):
            if board[row][col] == '.':
                candidates = []
                for x in '123456789':
                    if isValid(board, row, col, x):
                        candidates.append(x)

                for x in candidates:
                    board[row][col] = x
                    if solve(board):
                        return True
                    board[row][col] = '.'
                return False
    return True

class Solution:
    def solveSudoku(self, board: list[list[str]]) -> None:
        solve(board)
