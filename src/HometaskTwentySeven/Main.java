package HometaskTwentySeven;
//1) Пользователь бесконечно вводит числа в программу - температуру ядерного реактора.

//2) После КАЖДОГО введеного числа сообщите пользователю информацию:
// 2.1) Среднее значение температуры ядерного за ВСЕ время
//2.2) Насколько текущая введеная температура отличается от предыдущей



//2.3) Если введеная температура превышает среднюю на 10% и повысилась
//тносительно предыдущего значения более, чем на 20%,
//То напишите на экран собщение "Тревога, превышение температуры"



//Усложненное задание:
      //  3.1) Рассчитайте также среднюю температуру за 10 последних измерений и
//реднюю температуру каждого 100ого измерения


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Data data = new Data();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int value = scanner.nextInt();

            if (value == -1) {
                break;
            }
            

            int previousMedium = data.reportMediumTemp();

            data.add(value);
            System.out.println("1. Medium temperature: " + data.reportMediumTemp());
            System.out.println("2. The temperature difference: " + data.compareTemp());
            System.out.println("3. " + data.percentTempWarning(previousMedium,
                    value - data.compareTemp() , value));
            System.out.println("4. " + data.mediumFromTen());
            System.out.println("5. " + data.mediumTempForEachHundred());


    }


    }
}