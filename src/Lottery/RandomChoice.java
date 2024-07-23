package Lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Класс RandomChoice генерирует случайные числа для лотерейной игры.
 */

public class RandomChoice {
private int maxNumber;
private int numberOfElem;

Random random = new Random();

    public RandomChoice( int maxNumber, int numberOfElem) {
        this.maxNumber = maxNumber;
        this.numberOfElem = numberOfElem;
    }


    public List<Integer> chooseRandomNumber() {
        List <Integer> list  = new ArrayList<>();
        while (list.size() != numberOfElem) {
          int  number = random.nextInt(maxNumber);

            if (!list.contains(number)) {
                list.add(number);
            }
        }
        return list;

    }
}
