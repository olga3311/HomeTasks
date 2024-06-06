package HometaskTwentyFive;
//1. Пользователь вводит два числа - начальное и конечное число.
//2. Выведите на экран все числа в этом промежутке
//НО решите задание обязательно через реккурсию


import java.util.Scanner;



public class SecondTSk {
    public static void method(int i, int j){
        System.out.println(i);
        if( i < j){
            method(i + 1, j);
        }
        return;
    };


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
      method(number1,  number2);

    }

}