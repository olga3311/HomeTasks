package HometaskThirtyNine;
//2. Создайте класс "посылка".
// 2.1 Добавьте поля: город отправления и город получения, вес посылки, дата-время создания посылки
//(посылки могут создаваться по всему миру, очень много часовых поясов, нам важна не конкретная дата,
// а лишь какая посылка была создана ранее, чем другая)
//2.2 Создать несколько посылок
//2.3 Найти самую новую посылку среди тех, кто отправляется в Берлин


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class SecondMain {
    public static void main(String[] args) {
        Package p1 = new Package("München", "Berlin", 2.02,
                ZonedDateTime.of(2024, 4, 23,
                        9, 0, 0, 0, ZoneId.of("Europe/Berlin")));
        Package p2 = new Package("Minsk", "Berlin", 2.02,
                ZonedDateTime.of(2024, 4, 23,
                        9, 0, 0, 0, ZoneId.of("Europe/Minsk")));
        Package p3 = new Package("Paris", "Amsterdam", 2.02,
                ZonedDateTime.of(2024, 4, 23,
                        9, 0, 0, 0, ZoneId.of("Europe/Paris")));

        List<Package> packageList = new ArrayList<>();
        packageList.add(p1);
        packageList.add(p2);
        packageList.add(p3);

        Package result = packageList.stream()
                .filter(x -> x.getShippingAddress().equalsIgnoreCase("Berlin"))
                .min((x, y) -> x.getDateTime().compareTo(y.getDateTime()))
                .orElse(null);

        if (result != null) System.out.println(result);
        else System.out.println("No package found.");

    }

}
