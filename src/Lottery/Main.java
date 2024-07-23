package Lottery;
/*
Программа при запуске генерирует 6 чисел из 45 (от 1 до 45), числа должны быть уникальные
Пользователь вводит свои 6 вариантов чисел    +

Программа определяет, сколько чисел пользователь угадал и выводит результат.
В случае попадания во все 6 цифр - сообщает о джекпоте

Доп. задание:
Добавить возможность множественного выбора цифр (можно выбрать несколько раз по 6 цифр)   .+
Соответственно, выбрать среди всех комбинаций - самую удачную
 */


import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
/**
 * Класс Main содержит основной метод для запуска лотерейной игры.
 * Константы maxNumber и numberOfElem определяют максимальное значение числа и количество чисел для игры.
 */

public class Main {
    private static final int maxNumber = 45;
    private static final int numberOfElem = 6;

    public static void main(String[] args) {

        System.out.println("Lottery game welcomes you!");

        LotteryGame lotteryGame = new LotteryGame(maxNumber, numberOfElem);

        Scanner scanner = new Scanner(System.in);
        lotteryGame.userMenu();
        lotteryGame.generateRandomNumber();
        lotteryGame.findMatch();


    }
}

