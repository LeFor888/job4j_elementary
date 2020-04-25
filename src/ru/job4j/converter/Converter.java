package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллары.
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        int in = 140;
        int inDlr = 180;
        int expected = 2;
        int expectedDlr = 3;
        int out = rubleToEuro(in);
        int outDlr = rubleToDollar(inDlr);
        boolean passed = expected == out;
        boolean passedDlr = expectedDlr == outDlr;
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollars.");
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("180 rubles are 3. Test result : " + passedDlr);

    }
}
