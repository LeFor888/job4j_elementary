package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        int el = 12;
        int[] nums = {0, 1, 2, 3, 4};
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                nums[i] = el;
            }
            System.out.println(nums[i]);
        }

        short[] ages = new short[10];
        String[] names = new String[4];
        float[] prices = new float[40];
        names[0] = "Stefan Zweig";
        names[1] = "Andrzej Sapkowski";
        names[2] = "Jaroslav Hašek";
        names[3] = "Jan Hus";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println("Размер массива равен: " + nums.length);
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + names.length);
        System.out.println("Размер массива равен: " + prices.length);
    }
}
