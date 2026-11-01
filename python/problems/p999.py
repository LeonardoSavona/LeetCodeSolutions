"""999. Available Captures for Rook"""

class Solution:
    def numRookCaptures(self, board: list[list[str]]) -> int:
        rook_x, rook_y = 0, 0
        for x in range(8):
            for y in range(8):
                if board[x][y] == "R":
                    rook_x = x
                    rook_y = y
                    break

        result = 0
        for x in range(rook_x-1, -1, -1):
            if board[x][rook_y] == 'p':
                result +=1
                break
            if board[x][rook_y] != '.':
                break
        for x in range(rook_x+1, 8):
            if board[x][rook_y] == 'p':
                result +=1
                break
            if board[x][rook_y] != '.':
                break

        for x in range(rook_y-1, -1, -1):
            if board[rook_x][x] == 'p':
                result +=1
                break
            if board[rook_x][x] != '.':
                break

        for x in range(rook_y+1, 8):
            if board[rook_x][x] == 'p':
                result +=1
                break
            if board[rook_x][x] != '.':
                break

        return result
