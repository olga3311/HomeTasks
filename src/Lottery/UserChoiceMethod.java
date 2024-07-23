package Lottery;
import java.util.List;
import java.util.Scanner;

/**
 * Класс UserChoiceMethod обеспечивает функциональность для выбора чисел пользователем
 * в игре в лотерею.
 */

public class UserChoiceMethod {
    private int maxNumber;
    private int numberOfElem;

    public UserChoiceMethod(int maxNumber, int numberOfElem) {
        this.numberOfElem = numberOfElem;
        this.maxNumber = maxNumber;
    }

    /**
     * Запрашивает у пользователя ввод чисел и возвращает список выбранных чисел.
     * Пользователь должен ввести уникальные числа в заданном диапазоне.
     *
     * @return список выбранных пользователем чисел
     */

    public UserChoiceList chooseNumbers() {
        UserChoiceList userChoiceList = new UserChoiceList();

        Scanner scanner = new Scanner(System.in);
        while (userChoiceList.getUserNumbers().size() != numberOfElem) {
            int number = scanner.nextInt();
            if (number >= 0 && number <= maxNumber) {
                if (!userChoiceList.getUserNumbers().contains(number)) {
                    userChoiceList.add(number);
                }
            } else System.out.println("incorrect number");
        }

        return userChoiceList;
    }
}