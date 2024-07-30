package HometaskThirtyNine;

//1. Создайте класс "Язык программирования"
// 1.1 Добавьте поля: название языка, автор языка (или компания), дата первой версии языка +
//1.2 Создайте несколько языков программирования
//1.3 Найдите среди них самых старый язык, используя любой подход (стримы привествуются)


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FirstMain {
    public static void main(String[] args) {


       ProgrammingLanguage programmingLanguage1 = new ProgrammingLanguage("C", "Bell Labs",
               LocalDate.of(1972, 12, 1));
       ProgrammingLanguage programmingLanguage2 = new ProgrammingLanguage( "Java","Sun Microsystems",
               LocalDate.of(1995, 5, 23));
       ProgrammingLanguage programmingLanguage3 = new ProgrammingLanguage("C#", "Microsoft",
               LocalDate.of(2002, 2, 1));
       ProgrammingLanguage programmingLanguage4 = new ProgrammingLanguage("Go", "Google",
               LocalDate.of(2009, 11, 10));

        List<ProgrammingLanguage> languages = new ArrayList<>();
        languages.add(programmingLanguage1);
        languages.add(programmingLanguage2);
        languages.add(programmingLanguage3);
        languages.add(programmingLanguage4);

        ProgrammingLanguage result = languages.stream()
                .min((x, y) -> x.getStartDate().compareTo(y.getStartDate()))
                .get();

        System.out.println(result);
    }
}
