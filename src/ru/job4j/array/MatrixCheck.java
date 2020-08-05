package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int column = 0; column < board.length; column++) {
                if (board[row][column] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int line = 0; line < board.length; line++) {
            if (board[line][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
