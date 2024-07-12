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
import java.util.stream.Collectors;


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

        Optional<Integer> result = cars.stream()

                .filter(c -> c.getDate() > 1999)
                .map(Car::getMileage)
                .reduce(Integer::sum);
        System.out.println(result);


        Optional<Integer> result2 = cars.stream()

                .filter(c -> c.getMileage() > 500000)
                .map(Car::getDate)
                .min(Comparator.naturalOrder());
        System.out.println(result2);

        Optional<Integer> result3 = cars.stream()

                .filter(c -> c.getName().startsWith("W") || c.getName().startsWith("V"))
                .map(Car::getMileage)
                .filter(c -> c <= 200000)
                .max(Comparator.naturalOrder());

        System.out.println(result3);

    }
}