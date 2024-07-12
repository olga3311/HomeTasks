//1. Создайте класс Person +
//1.2 Добавьте в этот класс 3 поля: имя, папа и мама. Папа и мама - тоже поля класса Person +

//2.1. У вас есть список из людей, найдите среди них всех их мам и пап, у которых имя длиннее 6 букв
//Подскажка: Делайте либо через Stream.of(), либо делаем по отдельности (способ Владимира)
//Дополнение: важно поработать со стримами,
// но разрешается где-то какое-то действие выполнить без них

package HometaskThirtyFour;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskTwo {
    public static void main(String[] args) {
        Person daniil = new Person("Daniil",
                new Person("Elena", null, null),
                new Person("Anton", null, null)
        );
        Person artur = new Person("Artur",
                new Person("Elena", null, null),
                new Person("Vadim", null, null)
        );
        Person vladimir = new Person("Vladimir",
                new Person("Olga", null, null),
                new Person("Egor", null, null)
        );
        Person alexander = new Person("Aleksandr",
                new Person("Nadezda", null, null),
                new Person("Andrei", null, null)
        );
        Person anton = new Person("Anton",
                new Person("Anastasia", null, null),
                new Person("Valentin", null, null)
        );


        List<Person> person = new ArrayList<>();
        person.add(artur);
        person.add(daniil);
        person.add(vladimir);
        person.add(alexander);
        person.add(anton);


        List<String> result = person.stream()
                .flatMap(p -> Stream.of(p.getFather().getName(), p.getMother().getName()))
                .filter(par -> par.length() > 6)
                .collect(Collectors.toList());


        System.out.println(result);


    }
}
