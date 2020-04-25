package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60; // формула перевода рублей в доллары.
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        int in = 140;
        float in1 = 140;
        int expected = 2;
        float expected1 = 2.3333333f;
        int out = rubleToEuro(in);
        float out1 = rubleToDollar(in);
        boolean passed = expected == out;
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("140 euro are 2.3333333. Test result : " + passed1);
    }
}
