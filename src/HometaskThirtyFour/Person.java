package HometaskThirtyFour;

import java.util.Objects;

public class Person {
    private String name;
    private Person mother;
    private Person father;

    public Person(String name, Person mother, Person father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(mother, person.mother) && Objects.equals(father, person.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mother, father);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mother='" + mother.getName() + '\'' +
                ", Father='" + father.getName() + '\'' +
                '}';
    }
}
