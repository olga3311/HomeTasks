//1.1 Создайте класс "Машина" +
// 1.2 Добавьте в этот класс 3 поля: наименование марки, год выпуска и пробег +
//2.1. Среди машин, которые имеют год выпуска новее, чем 1999, необходимо подсчитать общий пробег +
//2.2. Среди машин, у которых пробег более 500 000, найти самую старую машину+


//2.3. Среди машин, у которых марка начинается на "V" или "W",
// найти с самым большим пробегом, но не более 200 000 тысяч

package HometaskThirtyFour;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class TaskOne {
    public static void main(String[] args) {
        Car car1 = new Car("Volkswagen", 2018, 195000);
        Car car2 = new Car("BMW", 2005, 560000);
        Car car3 = new Car("Volvo", 1998, 550000);
        Car car4 = new Car("Peugeot", 2020, 130000);
        Car car5 = new Car("Tesla", 2022, 90000);
        Car car6 = new Car("Honda", 1995, 600000);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        Integer result = cars.stream()
                .filter(c -> c.getDate() > 1999)
                .map(Car::getMileage)
                .reduce((x, y) -> x + y)
                .orElse(0);

        System.out.println(result);


        Car result2 = cars.stream()

                .filter(c -> c.getMileage() > 500000)
                .min((x, y) -> x.getDate() - y.getDate())
                .orElse(null);

        System.out.println(result2);

        Car result3 = cars.stream()

                .filter(c -> c.getName().startsWith("W") || c.getName().startsWith("V"))
                .filter(c -> c.getMileage() < 200000)
                .max(Comparator.comparing(c -> c.getMileage()))
                .orElse(null);

        System.out.println(result3);

    }
}