package leonardo.savona.problems.p36;

import java.util.*;

class Solution {
    public static final String TITLE = "36. Valid Sudoku";

public static boolean isValidSudoku(char[][] board) {
        for (int row=0; row<9; row++) {
            for (int col=0; col<9; col++) {
                if (row % 3 == 0 && col % 3 == 0 && !isValidSquare(board, row, col)) return false;

                char c = board[row][col];

                if (c == '.') continue;

                for (int x=0;x<9;x++) {
                    // check row
                    if (x != col && c == board[row][x]) return false;
                    // check column
                    if (x != row && c == board[x][col]) return false;
                }
            }
        }

        return true;
    }

    private static boolean isValidSquare(char[][] board, int row, int col) {
        List<Character> chars = new ArrayList<>();
        for (int r=row; r<row+3; r++) {
            for (int c=col; c<col+3; c++) {
                char chara = board[r][c];
                if (chars.contains(chara)) return false;
                if (chara != '.') chars.add(chara);
            }
        }
        return true;
    }

}