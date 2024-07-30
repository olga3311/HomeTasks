package HometaskThirtyNine;

import java.time.LocalDate;
import java.util.Objects;

public class ProgrammingLanguage {
    private String name;
    private String author;
    private LocalDate startDate;

    public ProgrammingLanguage(String name, String author, LocalDate startDate) {
        this.name = name;
        this.author = author;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgrammingLanguage that = (ProgrammingLanguage) o;
        return Objects.equals(name, that.name) && Objects.equals(author, that.author) && Objects.equals(startDate, that.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, startDate);
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
