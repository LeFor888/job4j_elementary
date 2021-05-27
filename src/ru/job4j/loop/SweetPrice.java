package ru.job4j.loop;

public class SweetPrice {
    public static void out(int price) {
        for (int i = 1; i <= 5; i++) {
            int r = i * price;
            System.out.println(r);
        }
    }
}
