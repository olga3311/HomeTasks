package HometaskFortyOne;

public class Video implements Playable {

    @Override
    public void play() {
        System.out.println("I'm watching a film!");
    }

    @Override
    public void printInfo() {
        Playable.super.printInfo();
    }
}
