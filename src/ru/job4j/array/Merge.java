package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int cursorLeft = 0;
        int cursorRight = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (cursorLeft != left.length && cursorRight != right.length) {
                if (left[cursorLeft] < right[cursorRight]) {
                    rsl[i] = left[cursorLeft++];
                } else {
                    rsl[i] = right[cursorRight++];
                }
            } else if (cursorLeft == left.length) {
                rsl[i] = right[cursorRight++];
            } else {
                rsl[i] = left[cursorLeft++];
            }
        }
        return rsl;
    }
}