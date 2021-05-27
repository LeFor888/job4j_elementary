package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int p = 1;
        for (int i = a; i <= b; i++) {
            p *= i;
        }
        return p;
    }
}
