package HometaskTwentyFive;
import java.util.Arrays;
import java.util.Scanner;

// Усложнения для первого задания
// 1. Вводится не 10 чисел, а строка содержащая числа, записанные через пробел
// 2. Бинарный поиск обязательно должен быть реккурсивным
//1 2 34 46 42 6 89 367 34 3456


public class FirstTAskV2 {

    public static void  main(String[] args) {

        String[] array = new String[10];
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        array = input.split(" ");

        int[] numbers = new  int[array.length];
        for (int i = 0; i < array.length; i++) {
           numbers [i] = Integer.parseInt(array[i]);
        }
        System.out.println(Arrays.toString(numbers));



        Sorting sorting = new Sorting();
        numbers = sorting.selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));


        int number = scanner.nextInt();
        int index = BinarySearch.binarySearch(numbers, number, 0,array.length-1);
        System.out.println(index);

    }


}
