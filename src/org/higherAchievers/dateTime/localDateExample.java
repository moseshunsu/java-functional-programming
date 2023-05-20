package org.higherAchievers.dateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class localDateExample {
    public static void main(String[] args) {
        //creating localDate
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        //using day of the year
        localDate = LocalDate.ofYearDay(2023, 90);
        System.out.println("localDate = " + localDate);

        //
        localDate = LocalDate.of(2023, 5, 19);
        System.out.println("localDate = " + localDate);

        localDate = LocalDate.now();

        //Get Methods
        System.out.println("localeDate.getMonth = " + localDate.getMonth());
        System.out.println("localeDate.getMonthValue = " + localDate.getMonthValue());
        System.out.println("localDate.getDayOfWeek() = " + localDate.getDayOfWeek());
        System.out.println("localDate.getDayOfYear() = " + localDate.getDayOfYear());
        System.out.println("localDate = " + localDate.get(ChronoField.MONTH_OF_YEAR));
    }

}
