package HometaskTwentyNine;

 /*1. Вводится 5 чисел. Напишите "Yes", если они  все равны между собой.
    1.1 Нужно использовать Set
    1.2 Запрещено писать в if условие (1 == 2 и 2 == 3 и 3 == 4), contains использовать нельзя

    2. Вводится день недели. Напишите тип это дня (выходной или рабочий). Используйте для этого set.
        2.1 Если такого дня не существует - напишите "Ошибка". */


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();



        for (int i = 0; i < 5; i++) {
            int number = sc.nextInt();
            set.add(number);
        }

        System.out.println(set.size());
        System.out.println(set.stream().distinct().count());

        if(set.stream().distinct().count() ==1 ){
            System.out.println("Yes");
        }

        if(set.size() ==1 ){
            System.out.println("Yes");
        }


    }
}
