package HometaskThirty;//1. Пользователи вводят поисковые запросы (просто строка в консоли),
//2. В ответ пользователю напишите, сколько раз такая строка уже искалась другими пользователями
//2.1 Если строка искалась более 100 раз, то дальнейшее количество попыток поиска не учитывается
// (значение замирает на 100)

//Дополнительное задание:
//1. Придумать, как проверить решение, передав в код какую-либо строку более 100 раз
// (сделать можно любым способом: код на джаве, каким-либо сочетанием клавиш)


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        int counter = 0;

        while(true) {
            String string = scanner.nextLine();

            if (string.equals("exit")) {
                break;
            }

            if (map.containsKey(string)) {
                counter = map.get(string) + 1;
            } else {
                counter = 1;
            }
            map.put(string, counter);

            if( counter > 100){
                counter = 100;
            }
            System.out.println(counter);
        }



    }
}
