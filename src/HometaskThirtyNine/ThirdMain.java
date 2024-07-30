package HometaskThirtyNine;

//3. Создать класс Meeting (встреча),
//3.1 В класс добавьте поля: кто встречается, с кем встречается и дату-время встречи
//3.2 Создайте несколько встреч
//3.3 Найдите среднее время начала всех встреч
// (Например, две встречи - одна встреча начинается 14-00, другая встреча начинается 16-00.
//  Тогда среднее время начала встречи - 15-00)


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class ThirdMain {
    public static void main(String[] args) {

        Meeting meeting1 = new Meeting("Dan", "Sam",
                ZonedDateTime.of(2024, 5, 12, 15, 30, 0, 0,
                        ZoneId.of("Europe/Berlin")));

        Meeting meeting2 = new Meeting("John", "Ricardo",
                ZonedDateTime.of(2024, 6, 19, 11, 0, 0, 0,
                        ZoneId.of("Europe/Madrid")));

        Meeting meeting3 = new Meeting("Ivan", "Alex",
                ZonedDateTime.of(2024, 7, 25, 18, 20, 0, 0,
                        ZoneId.of("America/Los_Angeles")));

        List<Meeting> meetingList = new ArrayList<>();
        meetingList.add(meeting1);
        meetingList.add(meeting2);
        meetingList.add(meeting3);

        ZonedDateTime averageDateTime = findAverageMeetingTime(meetingList);

        System.out.println("Среднее время начала всех встреч: " + averageDateTime);
    }

    public static ZonedDateTime findAverageMeetingTime(List<Meeting> meetingList) {

        long totalSeconds = 0;
        ZoneId zone = meetingList.get(0).getZonedDateTime().getZone();

        for (Meeting meeting : meetingList) {
            totalSeconds += meeting.getZonedDateTime().toEpochSecond();
        }

        long averageSeconds = totalSeconds / meetingList.size();


        ZonedDateTime averageDateTime = ZonedDateTime.ofInstant(java.time.Instant.ofEpochSecond(averageSeconds), zone);

        return averageDateTime;
    }
}
