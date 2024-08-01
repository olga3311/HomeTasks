package HometaskFortyOne;

public class AudioTrack implements Playable {


    @Override
    public void play() {
        System.out.println("I'm listening to music!");
    }

    @Override
    public void printInfo() {
        Playable.super.printInfo();
    }
}
