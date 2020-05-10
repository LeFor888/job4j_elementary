package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean bigger = left > right;
        int result = bigger ? left : right;
        return result;
    }

    public static int equal(int left, int right) {
        boolean equal = left == right;
        int result = equal ? left : right;
        return result;
    }

    public static int maxright(int left, int right) {
        boolean bigger = left < right;
        int result = bigger ? left : right;
        return result;
    }
}
