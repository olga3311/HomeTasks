package HometaskTwentyEight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
200 10 5
300 20 10
150 30 7
*/
/*
/Users/Olga/IdeaProjects/Hometasks/out/production/Hometasks/HometaskTwentyEight/deposits.txt
src/HometaskTwentyEight/deposits.txt
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Deposit> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите, откуда получать данные: 1 - файл, 2 - консоль");

        int switcher = scanner.nextInt();
        scanner.nextLine();

        if (switcher == 1) {
            System.out.println("Введите имя файла: ");
            String str = scanner.nextLine();
            File file = new File(str);
            scanner = new Scanner(file);
        }


        System.out.println("Ведите число строк: ");
        int num = scanner.nextInt();
        lines.ensureCapacity(num);
        System.out.println("-------------");


        String string = scanner.nextLine();
        System.out.println("1. Количество денег на вклад\n" +
                "2. Процент по вкладу\n" +
                "3. Количество лет ");

        long start = System.nanoTime();

        for (int i = 0; i < num; i++) {

            string = scanner.nextLine();
            String[] strings = string.split(" ");
            int amount = Integer.parseInt(strings[0]);
            int percent = Integer.parseInt(strings[1]);
            int years = Integer.parseInt(strings[2]);
            Deposit deposit = new Deposit(amount, percent, years);

            lines.add(deposit);
        }
        System.out.println(lines);

        Collections.sort(lines, Collections.reverseOrder());

        long end = System.nanoTime();
        System.out.println("Execution time: " + (end - start));

        System.out.println("Самый выгодный вклад: " + lines.get(0).toString());
        System.out.println("Средняя прибыль с каждого вклада: " +  "1. " + lines.get(0).getMediumProfit() +
                 ", 2." + lines.get(1).getMediumProfit() +
                 ", 3. " + lines.get(2).getMediumProfit());

    }
}