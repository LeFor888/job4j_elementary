package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int line = 0; line < table.length; line++) {
            for( int column = 0; column < table.length; column++) {
                table [line][column] = (line + 1) * (column + 1);
            }
        }
        return table;
    }
}