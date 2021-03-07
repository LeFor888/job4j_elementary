package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }

    public static int equal(int left, int right) {
        return left == right ? left : right;
    }

    public static int equal(int left, int right, int middle) {
        return equal(left, equal(right, middle));
    }

    public static int maxRight(int left, int right) {
        return left > right ? left : right;
    }

    public static int maxRight(int left, int right, int middle) {
        return maxRight(left, maxRight(right, middle));
    }
}
