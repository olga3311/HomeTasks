package Lottery;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс UserChoiceList представляет выбор  пользователя в игре в лотерею.
 * Он хранит выбранные пользователем числа в одном списке с
 * и обеспечивает методы для работы с этими числами.
 */

public class UserChoiceList {

    private List<Integer> userNumbers = new ArrayList<>();
    private int elementMatch;

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    public int getElementMatch() {
        return elementMatch;
    }

    public void add(int number) {
        userNumbers.add(number);
    }

    public boolean contains(int number) {
        return userNumbers.contains(number);
    }

    /**
     * Сравнивает числа, выбранные пользователем, со сгенерированным списком и
     * возвращает количество совпадающих чисел.
     *
     * @param randomList список случайных чисел для сравнения
     * @return количество совпадающих чисел
     */

    public int compare(List<Integer> randomList) {
        elementMatch = 0;
        for (int number : userNumbers) {
            if (randomList.contains(number)) {
                elementMatch++;
            }
        }
        return elementMatch;
    }

}
