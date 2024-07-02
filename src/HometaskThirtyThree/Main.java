
//Решите задания с использованием Стримов (Stream) и лямбда-выражений
//1.1. Существует список из чисел (заполнить его можно как угодно)
//1.2. Добавьте к каждому из чисел из списка 15
// 1.3. Оставьте только числа, большие чем 50
//  1.4. Найдите сумму чисел

//2.1 Существует список строк (заполнить его можно как угодно)
//2.2 Среди всех строк, оставьте только те строки, которые состоят из 15 символов или меньшего количества
//2.3 Найдите самую длинную строку

package HometaskThirtyThree;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(120);
        list.add(450);
        list.add(1200);
        list.add(10000);
        list.add(1_000_000);
        list.add(5);
        list.add(37);
        list.add(78);
        list.add(563);
        list.add(148);
        list.add(841);
        list.add(3276);
        list.add(675432);

        Optional<Integer> result = list.stream()
                .map(x -> x + 15)
                .filter(x -> x >= 50)
                .reduce((x, y) -> x + y);

        System.out.println(result);
        System.out.println(result.get());


        List<String> strings = new ArrayList<>();
        strings.add("Wer reitet so spät durch Nacht und Wind?");
        strings.add("Es ist der Vater mit seinem Kind; ");
        strings.add("Es ist der");
        strings.add("er hat den Knaben wohl in dem Arm,");
        strings.add("er faßt ihn sicher, er hält ihn warm.");
        strings.add("Mein Sohn, was birgst du so bang dein Gesicht?");
        strings.add("Mein Sohn,");


        Predicate<String> predicate = (str) -> str.length() > 15;

        for (String string : strings) {
            System.out.println(predicate.test(string));

        }

        Comparator<String> comparator = (str1, str2) -> str1.length() - str2.length();

        List<String> list1 = strings.stream()
                .filter(predicate)
                .sorted(comparator)
                .collect(Collectors.toList());

        System.out.println(list1);
        System.out.println("The longest line is: " + list1.get(list1.size() - 1));


    }

}
