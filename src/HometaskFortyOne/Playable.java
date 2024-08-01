package HometaskFortyOne;

public interface Playable {

    void play();

    default void printInfo() {
        System.out.println("мы имеем дело с запускаемым файлом");
    };

}
