package HometaskFortyOne;

public class Main {
    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new MediaPlayer();
        Video video = new Video();
        AudioTrack audioTrack = new AudioTrack();


        mediaPlayer.addTrack(video);
        mediaPlayer.addTrack(audioTrack);
        mediaPlayer.play();

    }
}
