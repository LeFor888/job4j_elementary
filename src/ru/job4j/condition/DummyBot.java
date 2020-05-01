package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
            System.out.println(rsl);
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
            System.out.println(rsl);
        } else {
            rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
            System.out.println(rsl);
        }
        return rsl;
    }

    public static void main(String[] args) {
        DummyBot.answer("Привет, Бот.");
        DummyBot.answer("Пока.");
        DummyBot.answer("Сколько будет 2 + 2?");
    }
}

