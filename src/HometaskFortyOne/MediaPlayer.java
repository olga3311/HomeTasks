package HometaskFortyOne;

//1. Создайте интерфейс Playable. С двумя методами:
//1.1 метод void play()
//1.2 default-метод printInfo(), реализация которого сообщает, что мы имеем дело с запускаемым файлом

//2. Реализуйте интерфейс Playable в двух классах:
//2.1 AudioTrack
//2.2 Video

//3. Создайте класс MediaPlayer. В нем добавьте возможность добавить трек или видео в список прослушивания.
// Используя varargs, добавьте возможномть добавлять несколько треков за раз.
//Также добавьте метод для запуска "очереди треков". Перед запуском каждого трека выводите информацию о каждом треке


import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

    List<Playable> tracks = new ArrayList<>();


    public void addTrack(Playable track) {
        this.tracks.add(track);
    }


    public void addTrack(Playable... a) {
        for (int i = 0; i < a.length; i++) {
            this.addTrack(a[i]);
        }
    }

    ;


    public void play() {
        for (int i = 0; i < (tracks.size()); i++) {
            tracks.get(i).printInfo();
            tracks.get(i).play();
        }
    }


}
