package ru.job4j.condition;

public class EvenCheck {
    public static boolean check(int num) {
        boolean result = false;
        if (num % 2 == 0) {
            result = true;
        }
        return result;
    }
}