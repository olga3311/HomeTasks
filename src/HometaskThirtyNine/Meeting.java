package HometaskThirtyNine;

import java.time.ZonedDateTime;

public class Meeting {
private String organizer;
private String participant;
private ZonedDateTime zonedDateTime;

    public Meeting(String organizer, String participant, ZonedDateTime zonedDateTime) {
        this.organizer = organizer;
        this.zonedDateTime = zonedDateTime;
        this.participant = participant;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public void setZonedDateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "organizer='" + organizer + '\'' +
                ", participant='" + participant + '\'' +
                ", zonedDateTime=" + zonedDateTime +
                '}';
    }



}
