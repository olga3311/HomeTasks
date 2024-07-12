package HometaskThirtyFour;

import java.util.Objects;

public class Car {
    private String name;
    private int date;
    private  int  mileage;

    public Car(String name, int date, int mileage) {
        this.name = name;
        this.date = date;
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return date == car.date && mileage == car.mileage && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, mileage);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", mileage=" + mileage +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
