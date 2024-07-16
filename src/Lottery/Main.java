package Lottery;
/*
Программа при запуске генерирует 6 чисел из 45 (от 1 до 45), числа должны быть уникальные
Пользователь вводит свои 6 вариантов чисел +

 Программа определяет, сколько чисел пользователь угадал и выводит результат.
В случае попадания во все 6 цифр - сообщает о джекпоте
Реализовать по принципам ООП
Доп. задание:
Добавить возможность множественного выбора цифр (можно выбрать несколько раз по 6 цифр).
Соответственно, выбрать среди всех комбинаций - самую удачную
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        Random random = new Random();

        while (list1.size() != 6){
            int number = random.nextInt(45);
            if(!list1.contains(number)){
            list1.add(number);}
        }
        System.out.println(list1);


        System.out.println("Веедите шесть  уникальных не больше 45: ");
        Scanner scanner = new Scanner(System.in);
        List<Integer> list2 = new ArrayList<>();
        List <List<Integer>> totalList = new ArrayList<>();

while () {
    while (list2.size() != 6) {
        int number = scanner.nextInt();
        if (!list2.contains(number) && number <= 45) {
            list2.add(number);
        }
    }
    System.out.println(list2);

}

    }
}
