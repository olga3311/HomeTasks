package Lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Класс LotteryGame представляет собой игру в лотерею, где пользователь выбирает числа и
 * сравнивает их с сгенерированными случайными числами.
 */



public class LotteryGame {
    private int maxNumber;
    private int numberOfElem;
    private int bestMatch;

    private List<Integer> randomList;
    private List<UserChoiceList> totalList = new ArrayList<>();

    /**
     * Конструктор LotteryGame инициализирует игру с заданными параметрами.
     *
     * @param maxNumber    максимальное значение числа, которое можно выбрать
     * @param numberOfElem количество чисел, которые нужно выбрать
     */

    public LotteryGame(int maxNumber, int numberOfElem) {
        this.maxNumber = maxNumber;
        this.numberOfElem = numberOfElem;
    }

    /**
     * Возвращает список всех попыток пользователя.
     *
     * @return список всех выборов пользователя
     */

    public List<UserChoiceList> getTotalList() {
        return totalList;
    }

    /**
     * Меню для пользователя, которое позволяет ему выбирать числа и решать,
     * хочет ли он сделать еще одну попытку.
     */

    public void userMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's start! Enter six unique numbers from 0 to " + maxNumber + ": ");

        while (true) {
            UserChoiceMethod userChoiceMethod = new UserChoiceMethod(maxNumber, numberOfElem);

            UserChoiceList list2 = userChoiceMethod.chooseNumbers();
            totalList.add(list2);
            System.out.println("You have chosen the following numbers: " + list2.getUserNumbers());

            String input = "";

            while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N")) {
                System.out.println("Do you want to enter a new set of numbers? " + "Y or N");
                input = scanner.nextLine();
            }

            if (input.equalsIgnoreCase("Y")) {
                System.out.println("Enter numbers: ");
            }

            if (input.equalsIgnoreCase("N")) {
                System.out.println("You have made " + totalList.size() + " attempts.");
                break;
            }
        }
    }

    /**
     * Генерирует случайные числа, которые будут использоваться для сравнения с числами пользователя.
     */

    public void generateRandomNumber() {
        RandomChoice randomChoice = new RandomChoice(maxNumber, numberOfElem);
        randomList = randomChoice.chooseRandomNumber();
        System.out.println("Random choice: " + randomList);
    }

    public void findMatch() {
        bestMatch = 0;
        for (UserChoiceList list2 : totalList) {

            int matchedNumbers = list2.compare(randomList);

            bestMatch = Math.max(bestMatch, matchedNumbers);

            // Вывод результата для каждого набора
            System.out.println("Набор: " + list2.getUserNumbers() + " - Угадано чисел: " + matchedNumbers);
        }

        // Вывод лучшего результата
        System.out.println("The best result: " + bestMatch + " numbers guessed.");

        if (bestMatch == numberOfElem) {
            System.out.println("Congratulations! JACKPOT!!!");
        }

    }

}
