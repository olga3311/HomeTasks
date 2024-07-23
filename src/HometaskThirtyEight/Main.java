package HometaskThirtyEight;
/*1. Cоздайте 2 новых вида исключений:
1.1 "Проверяемое"
1.2 "Непроверяемое"
2. Решите две задачи:
2.1. Напишите метод. В него вводится целое число - он выводит сумму всех чисел от 1 до этого числа.
 Если сумма вышла больше 10_000, то бросьте непроверяемое исключение.
2.2 Напишите метод. В него вводится 2 числа. Метод ничего не возвращает, но если второе число больше первого,
то бросьте проверяемое исключение.

**Если это необходимо - используйте try-catch
** Числа для методов считайте из файла. Оформите его чтение правильным образом */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    // 2.1
    public static void printSum(int number) throws SumTooLargeException {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;

            if (sum > 10000) {
                throw new SumTooLargeException("Exception: Сумма чисел от 1 до N - больше 10000");
            }
        }
        System.out.println("Сумма чисел от 1 до " + number + " равна " + sum);
    }

    // 2.2
    public static void compareNumbers(int number1, int number2) throws SecondNumberIsLargerException{
        if (number2 > number1) {
            throw new SecondNumberIsLargerException("Exception: Второе число больше первого: " + number1 + " < " + number2+"."  );
        }
        System.out.println("Первое число: " + number1 + ", Второе число: " + number2);
    }


    public static void main(String[] args) {
        //2.2
        String filePath = "/Users/Olga/IdeaProjects/Hometasks/src/HomeTaskThirtyEight/numbers.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] numbers = line.split(" ");
                int number1 = Integer.parseInt(numbers[0]);
                int number2 = Integer.parseInt(numbers[1]);
                try {
                    compareNumbers(number1, number2);
                } catch (SecondNumberIsLargerException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        // 2.1
        try {
            System.out.println("\n2.1:Введите натуральное число:");
            printSum(scanner.nextInt());
        } catch (SumTooLargeException e) {
            System.out.println(e.getMessage());
        }

    }
}
