package HometaskThirtyOne;
//1. Создайте класс Message. Этот класс будет позволять хранить в себе сообщение любого типа.
//   2. Для того, чтобы Message мог хранить в себе любой тип данных, создайте поле в этом классе,
//   тип которого будет является дженериком
//   3. Создайте приложение, которое спрашивает у пользователя, что положить в Message.
//3.1 Если пользователь хочет положить строку - создайте Message<String> и дайте пользователю ввести строку
//3.2 Если же пользователь хочет положить число - создайте Message<Integer> и дайте пользователю ввести число


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Какое сообщение Вы хотите создать?" +
                "Выберите вариант:" +
                " 1. строка." +
                " 2. число.");


        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        if (answer == 1) {

            Message<String> message = new Message<>();
            message.setMessage(scanner.nextLine());
            String str = message.getMessage();
            System.out.println(str);

        } else {

        Message<Integer> message1 = new Message<>();
        message1.setMessage(scanner.nextInt());
        Integer integer = message1.getMessage();

        System.out.println(integer);

    }
    }
}
