package HometaskTwentyFive;

import java.util.Arrays;
import java.util.Scanner;

//1.Пользователь вводит в консоль 10 чисел.
//2.Соберите их в массив и отсортируйте (любым способом, кроме заложенных в джава)
//3. Бинарным поиском найдите число в этом массиве, которое пользователь введет 11ым.
// Выведите его индекс на экран

// Усложнения для первого задания
// 1. Вводится не 10 чисел, а строка содержащая числа, записанные через пробел
// 2. Бинарный поиск обязательно должен быть реккурсивным
//1 2 34 46 42  6 89 367 34 3456

public class FirstTask {
    public static void  main(String[] args) {

        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));


        Sorting sorting = new Sorting();
        array = sorting.selectionSort(array);
        System.out.println(Arrays.toString(array));


        int number = scanner.nextInt();
        int index = BinarySearch.binarySearch(array, number, 0,array.length-1);
        System.out.println(index);





    }

}
