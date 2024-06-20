package HometaskTwentyNine;

//2. Вводится день недели. Напишите тип это дня (выходной или рабочий).
// Используйте для этого set.
// 2.1 Если такого дня не существует - напишите "Ошибка".

import java.util.*;

public class MainSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> workingDays = new HashSet<>();
        workingDays.add(DaysOfWeek.MONDAY.toString());
        workingDays.add(DaysOfWeek.TUESDAY.toString());
        workingDays.add(DaysOfWeek.WEDNESDAY.toString());
        workingDays.add(DaysOfWeek.THURSDAY.toString());
        workingDays.add(DaysOfWeek.FRIDAY.toString());

        Set<String> daysOff = new HashSet<>();
        daysOff.add(DaysOfWeek.SATURDAY.toString());
        daysOff.add(DaysOfWeek.SUNDAY.toString());

        System.out.println("Working days: " + workingDays + ", days off: " + daysOff);

        String day = scanner.nextLine();
         if ( workingDays.contains(day.toUpperCase())){
             System.out.println("It's a working day.");
         } else if (daysOff.contains(day.toUpperCase())) {
             System.out.println("It's a day off.");
         } else return;


    }
    }

